/*
 *
 *  *
 *  * Licensed to the Apache Software Foundation (ASF) under one
 *  * or more contributor license agreements.  See the NOTICE file
 *  * distributed with this work for additional information
 *  * regarding copyright ownership.  The ASF licenses this file
 *  * to you under the Apache License, Version 2.0 (the
 *  * "License"); you may not use this file except in compliance
 *  * with the License.  You may obtain a copy of the License at
 *  *
 *  *    http://www.apache.org/licenses/LICENSE-2.0
 *  *
 *  * Unless required by applicable law or agreed to in writing,
 *  * software distributed under the License is distributed on an
 *  * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 *  * KIND, either express or implied.  See the License for the
 *  * specific language governing permissions and limitations
 *  * under the License.
 *  *
 *
 */

package org.apache.usergrid.persistence.collection.serialization.impl.migration;


import java.util.Set;

import org.apache.usergrid.persistence.core.migration.data.AbstractMigrationPlugin;
import org.apache.usergrid.persistence.core.migration.data.DataMigration;
import org.apache.usergrid.persistence.core.migration.data.MigrationInfoSerialization;
import org.apache.usergrid.persistence.core.migration.data.PluginPhase;

import com.google.inject.Inject;
import com.google.inject.Singleton;


/**
 * Migration plugin for the collection module
 */
@Singleton
public class CollectionMigrationPlugin extends AbstractMigrationPlugin {

    public static final String PLUGIN_NAME = "collections-entity-data";



    @Inject
    public CollectionMigrationPlugin( @CollectionMigration
                                          final Set<DataMigration> entityDataMigrations,
                                      final MigrationInfoSerialization migrationInfoSerialization ) {
        super( entityDataMigrations, migrationInfoSerialization );
    }


    @Override
    public String getName() {
        return PLUGIN_NAME;
    }


    @Override
    public PluginPhase getPhase() {
        return PluginPhase.MIGRATE;
    }
}
