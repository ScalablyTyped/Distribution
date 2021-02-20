package typings.pouchdbAdapterWebsql

import org.scalablytyped.runtime.Instantiable2
import typings.pouchdbAdapterWebsql.PouchDB.AdapterWebSql.Configuration
import typings.pouchdbAdapterWebsql.pouchdbAdapterWebsqlStrings.`UTF-16`
import typings.pouchdbAdapterWebsql.pouchdbAdapterWebsqlStrings.`UTF-8`
import typings.pouchdbAdapterWebsql.pouchdbAdapterWebsqlStrings.websql
import typings.pouchdbCore.PouchDB.Configuration.LocalDatabaseConfiguration
import typings.pouchdbCore.PouchDB.Database
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object PouchDB {
  
  object AdapterWebSql {
    
    @js.native
    trait Configuration extends LocalDatabaseConfiguration {
      
      @JSName("adapter")
      var adapter_Configuration: websql = js.native
    }
    object Configuration {
      
      @scala.inline
      def apply(adapter: websql): Configuration = {
        val __obj = js.Dynamic.literal(adapter = adapter.asInstanceOf[js.Any])
        __obj.asInstanceOf[Configuration]
      }
      
      @scala.inline
      implicit class ConfigurationMutableBuilder[Self <: Configuration] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setAdapter(value: websql): Self = StObject.set(x, "adapter", value.asInstanceOf[js.Any])
      }
    }
  }
  
  object Core {
    
    @js.native
    trait DatabaseInfo extends StObject {
      
      var sqlite_plugin: js.UndefOr[Boolean] = js.native
      
      var websql_encoding: js.UndefOr[`UTF-8` | `UTF-16`] = js.native
    }
    object DatabaseInfo {
      
      @scala.inline
      def apply(): DatabaseInfo = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[DatabaseInfo]
      }
      
      @scala.inline
      implicit class DatabaseInfoMutableBuilder[Self <: DatabaseInfo] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setSqlite_plugin(value: Boolean): Self = StObject.set(x, "sqlite_plugin", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSqlite_pluginUndefined: Self = StObject.set(x, "sqlite_plugin", js.undefined)
        
        @scala.inline
        def setWebsql_encoding(value: `UTF-8` | `UTF-16`): Self = StObject.set(x, "websql_encoding", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setWebsql_encodingUndefined: Self = StObject.set(x, "websql_encoding", js.undefined)
      }
    }
  }
  
  @js.native
  trait Static
    extends Instantiable2[
          (/* name */ Null) | (/* name */ String), 
          /* options */ Configuration, 
          Database[js.Object]
        ]
}
