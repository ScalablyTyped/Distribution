package typings.pouchdbAdapterMemory

import org.scalablytyped.runtime.Instantiable2
import typings.pouchdbAdapterMemory.PouchDB.MemoryAdapter.MemoryAdapterConfiguration
import typings.pouchdbAdapterMemory.pouchdbAdapterMemoryStrings.memory
import typings.pouchdbCore.PouchDB.Configuration.LocalDatabaseConfiguration
import typings.pouchdbCore.PouchDB.Database
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object PouchDB {
  
  object MemoryAdapter {
    
    @js.native
    trait MemoryAdapterConfiguration extends LocalDatabaseConfiguration {
      
      @JSName("adapter")
      var adapter_MemoryAdapterConfiguration: memory = js.native
    }
    object MemoryAdapterConfiguration {
      
      @scala.inline
      def apply(adapter: memory): MemoryAdapterConfiguration = {
        val __obj = js.Dynamic.literal(adapter = adapter.asInstanceOf[js.Any])
        __obj.asInstanceOf[MemoryAdapterConfiguration]
      }
      
      @scala.inline
      implicit class MemoryAdapterConfigurationMutableBuilder[Self <: MemoryAdapterConfiguration] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setAdapter(value: memory): Self = StObject.set(x, "adapter", value.asInstanceOf[js.Any])
      }
    }
  }
  
  @js.native
  trait Static
    extends Instantiable2[
          (/* name */ Null) | (/* name */ String), 
          /* options */ MemoryAdapterConfiguration, 
          Database[js.Object]
        ]
}
