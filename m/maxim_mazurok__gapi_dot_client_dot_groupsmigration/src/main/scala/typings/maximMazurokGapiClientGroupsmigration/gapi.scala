package typings.maximMazurokGapiClientGroupsmigration

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientGroupsmigration.anon.Accesstoken
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object gapi {
  
  object client {
    
    object groupsmigration {
      
      @js.native
      trait ArchiveResource extends StObject {
        
        /** Inserts a new mail into the archive of the Google group. */
        def insert(): Request[Groups] = js.native
        def insert(request: Accesstoken): Request[Groups] = js.native
      }
      
      trait Groups extends StObject {
        
        /** The kind of insert resource this is. */
        var kind: js.UndefOr[String] = js.undefined
        
        /** The status of the insert request. */
        var responseCode: js.UndefOr[String] = js.undefined
      }
      object Groups {
        
        inline def apply(): Groups = {
          val __obj = js.Dynamic.literal()
          __obj.asInstanceOf[Groups]
        }
        
        @scala.inline
        implicit open class MutableBuilder[Self <: Groups] (val x: Self) extends AnyVal {
          
          inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
          
          inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
          
          inline def setResponseCode(value: String): Self = StObject.set(x, "responseCode", value.asInstanceOf[js.Any])
          
          inline def setResponseCodeUndefined: Self = StObject.set(x, "responseCode", js.undefined)
        }
      }
    }
  }
}
