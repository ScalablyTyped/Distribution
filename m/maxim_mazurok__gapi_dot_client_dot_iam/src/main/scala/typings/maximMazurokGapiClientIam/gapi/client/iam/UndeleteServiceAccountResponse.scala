package typings.maximMazurokGapiClientIam.gapi.client.iam

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UndeleteServiceAccountResponse extends StObject {
  
  /** Metadata for the restored service account. */
  var restoredAccount: js.UndefOr[ServiceAccount] = js.undefined
}
object UndeleteServiceAccountResponse {
  
  inline def apply(): UndeleteServiceAccountResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UndeleteServiceAccountResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UndeleteServiceAccountResponse] (val x: Self) extends AnyVal {
    
    inline def setRestoredAccount(value: ServiceAccount): Self = StObject.set(x, "restoredAccount", value.asInstanceOf[js.Any])
    
    inline def setRestoredAccountUndefined: Self = StObject.set(x, "restoredAccount", js.undefined)
  }
}
