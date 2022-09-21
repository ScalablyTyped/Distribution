package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PasswordResetResponse extends StObject {
  
  // The Azure AD-generated password.
  var newPassword: js.UndefOr[NullableOption[String]] = js.undefined
}
object PasswordResetResponse {
  
  inline def apply(): PasswordResetResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PasswordResetResponse]
  }
  
  extension [Self <: PasswordResetResponse](x: Self) {
    
    inline def setNewPassword(value: NullableOption[String]): Self = StObject.set(x, "newPassword", value.asInstanceOf[js.Any])
    
    inline def setNewPasswordNull: Self = StObject.set(x, "newPassword", null)
    
    inline def setNewPasswordUndefined: Self = StObject.set(x, "newPassword", js.undefined)
  }
}
