package typings.maximMazurokGapiClientIdentitytoolkit.gapi.client.identitytoolkit

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ResetPasswordResponse extends StObject {
  
  /** The user's email. If the out-of-band code is for email recovery, the user's original email. */
  var email: js.UndefOr[String] = js.undefined
  
  /** The fixed string "identitytoolkit#ResetPasswordResponse". */
  var kind: js.UndefOr[String] = js.undefined
  
  /** If the out-of-band code is for email recovery, the user's new email. */
  var newEmail: js.UndefOr[String] = js.undefined
  
  /** The request type. */
  var requestType: js.UndefOr[String] = js.undefined
}
object ResetPasswordResponse {
  
  @scala.inline
  def apply(): ResetPasswordResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResetPasswordResponse]
  }
  
  @scala.inline
  implicit class ResetPasswordResponseMutableBuilder[Self <: ResetPasswordResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEmailUndefined: Self = StObject.set(x, "email", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    @scala.inline
    def setNewEmail(value: String): Self = StObject.set(x, "newEmail", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNewEmailUndefined: Self = StObject.set(x, "newEmail", js.undefined)
    
    @scala.inline
    def setRequestType(value: String): Self = StObject.set(x, "requestType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequestTypeUndefined: Self = StObject.set(x, "requestType", js.undefined)
  }
}
