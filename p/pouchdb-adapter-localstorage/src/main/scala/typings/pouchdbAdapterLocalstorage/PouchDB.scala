package typings.pouchdbAdapterLocalstorage

import org.scalablytyped.runtime.Instantiable2
import typings.pouchdbAdapterLocalstorage.PouchDB.LocalStorageAdapter.LocalStorageAdapterConfiguration
import typings.pouchdbAdapterLocalstorage.pouchdbAdapterLocalstorageStrings.localstorage
import typings.pouchdbCore.PouchDB.Configuration.LocalDatabaseConfiguration
import typings.pouchdbCore.PouchDB.Database
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object PouchDB {
  
  object LocalStorageAdapter {
    
    @js.native
    trait LocalStorageAdapterConfiguration extends LocalDatabaseConfiguration {
      
      @JSName("adapter")
      var adapter_LocalStorageAdapterConfiguration: localstorage = js.native
    }
    object LocalStorageAdapterConfiguration {
      
      @scala.inline
      def apply(adapter: localstorage): LocalStorageAdapterConfiguration = {
        val __obj = js.Dynamic.literal(adapter = adapter.asInstanceOf[js.Any])
        __obj.asInstanceOf[LocalStorageAdapterConfiguration]
      }
      
      @scala.inline
      implicit class LocalStorageAdapterConfigurationMutableBuilder[Self <: LocalStorageAdapterConfiguration] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setAdapter(value: localstorage): Self = StObject.set(x, "adapter", value.asInstanceOf[js.Any])
      }
    }
  }
  
  @js.native
  trait Static
    extends Instantiable2[
          (/* name */ Null) | (/* name */ String), 
          /* options */ LocalStorageAdapterConfiguration, 
          Database[js.Object]
        ]
}
