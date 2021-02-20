package typings.maximMazurokGapiClientIam.gapi.client.iam

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UndeleteServiceAccountResponse extends StObject {
  
  /** Metadata for the restored service account. */
  var restoredAccount: js.UndefOr[ServiceAccount] = js.native
}
object UndeleteServiceAccountResponse {
  
  @scala.inline
  def apply(): UndeleteServiceAccountResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UndeleteServiceAccountResponse]
  }
  
  @scala.inline
  implicit class UndeleteServiceAccountResponseMutableBuilder[Self <: UndeleteServiceAccountResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRestoredAccount(value: ServiceAccount): Self = StObject.set(x, "restoredAccount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRestoredAccountUndefined: Self = StObject.set(x, "restoredAccount", js.undefined)
  }
}
