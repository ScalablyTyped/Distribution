package typings.pouchdbNode

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object PouchDB {
  
  object Core {
    
    @js.native
    trait DatabaseInfo extends StObject {
      
      /** The backend *DOWN adapter being used (MemDOWN, RiakDOWN, …). */
      var backend_adapter: js.UndefOr[String] = js.native
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
        def setBackend_adapter(value: String): Self = StObject.set(x, "backend_adapter", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setBackend_adapterUndefined: Self = StObject.set(x, "backend_adapter", js.undefined)
      }
    }
  }
}
