package typings.maximMazurokGapiClientIdentitytoolkit.gapi.client.identitytoolkit

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IdentitytoolkitRelyingpartyResetPasswordRequest extends StObject {
  
  /** The email address of the user. */
  var email: js.UndefOr[String] = js.undefined
  
  /** The new password inputted by the user. */
  var newPassword: js.UndefOr[String] = js.undefined
  
  /** The old password inputted by the user. */
  var oldPassword: js.UndefOr[String] = js.undefined
  
  /** The confirmation code. */
  var oobCode: js.UndefOr[String] = js.undefined
}
object IdentitytoolkitRelyingpartyResetPasswordRequest {
  
  inline def apply(): IdentitytoolkitRelyingpartyResetPasswordRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IdentitytoolkitRelyingpartyResetPasswordRequest]
  }
  
  extension [Self <: IdentitytoolkitRelyingpartyResetPasswordRequest](x: Self) {
    
    inline def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
    
    inline def setEmailUndefined: Self = StObject.set(x, "email", js.undefined)
    
    inline def setNewPassword(value: String): Self = StObject.set(x, "newPassword", value.asInstanceOf[js.Any])
    
    inline def setNewPasswordUndefined: Self = StObject.set(x, "newPassword", js.undefined)
    
    inline def setOldPassword(value: String): Self = StObject.set(x, "oldPassword", value.asInstanceOf[js.Any])
    
    inline def setOldPasswordUndefined: Self = StObject.set(x, "oldPassword", js.undefined)
    
    inline def setOobCode(value: String): Self = StObject.set(x, "oobCode", value.asInstanceOf[js.Any])
    
    inline def setOobCodeUndefined: Self = StObject.set(x, "oobCode", js.undefined)
  }
}
