package typings.maximMazurokGapiClientGroupsmigration

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientGroupsmigration.anon.Accesstoken
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
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
      
      @js.native
      trait Groups extends StObject {
        
        /** The kind of insert resource this is. */
        var kind: js.UndefOr[String] = js.native
        
        /** The status of the insert request. */
        var responseCode: js.UndefOr[String] = js.native
      }
      object Groups {
        
        @scala.inline
        def apply(): Groups = {
          val __obj = js.Dynamic.literal()
          __obj.asInstanceOf[Groups]
        }
        
        @scala.inline
        implicit class GroupsMutableBuilder[Self <: Groups] (val x: Self) extends AnyVal {
          
          @scala.inline
          def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
          
          @scala.inline
          def setResponseCode(value: String): Self = StObject.set(x, "responseCode", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setResponseCodeUndefined: Self = StObject.set(x, "responseCode", js.undefined)
        }
      }
    }
  }
}
