package typings.pouchdbAdapterCordovaSqlite

import org.scalablytyped.runtime.Instantiable2
import typings.pouchdbAdapterCordovaSqlite.PouchDB.AdapterCordovaSqlite.Configuration
import typings.pouchdbAdapterCordovaSqlite.pouchdbAdapterCordovaSqliteStrings.`cordova-sqlite`
import typings.pouchdbCore.PouchDB.Configuration.LocalDatabaseConfiguration
import typings.pouchdbCore.PouchDB.Database
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object PouchDB {
  
  object AdapterCordovaSqlite {
    
    @js.native
    trait Configuration extends LocalDatabaseConfiguration {
      
      @JSName("adapter")
      var adapter_Configuration: `cordova-sqlite` = js.native
      
      /**
        * Version of android database to use.
        */
      var androidDatabaseImplementation: js.UndefOr[Double] = js.native
      
      /**
        * Location of database e.g. 'Default'. Only use 'location' or 'iosDatabaseLocation' not both.
        */
      var iosDatabaseLocation: js.UndefOr[String] = js.native
      
      /**
        * Location of database e.g. 'Default'.
        */
      var location: js.UndefOr[String] = js.native
    }
    object Configuration {
      
      @scala.inline
      def apply(adapter: `cordova-sqlite`): Configuration = {
        val __obj = js.Dynamic.literal(adapter = adapter.asInstanceOf[js.Any])
        __obj.asInstanceOf[Configuration]
      }
      
      @scala.inline
      implicit class ConfigurationMutableBuilder[Self <: Configuration] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setAdapter(value: `cordova-sqlite`): Self = StObject.set(x, "adapter", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setAndroidDatabaseImplementation(value: Double): Self = StObject.set(x, "androidDatabaseImplementation", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setAndroidDatabaseImplementationUndefined: Self = StObject.set(x, "androidDatabaseImplementation", js.undefined)
        
        @scala.inline
        def setIosDatabaseLocation(value: String): Self = StObject.set(x, "iosDatabaseLocation", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setIosDatabaseLocationUndefined: Self = StObject.set(x, "iosDatabaseLocation", js.undefined)
        
        @scala.inline
        def setLocation(value: String): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
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
