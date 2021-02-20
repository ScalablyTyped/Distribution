package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PasswordProfile extends StObject {
  
  // true if the user must change her password on the next login; otherwise false.
  var forceChangePasswordNextSignIn: js.UndefOr[NullableOption[Boolean]] = js.native
  
  /**
    * If true, at next sign-in, the user must perform a multi-factor authentication (MFA) before being forced to change their
    * password. The behavior is identical to forceChangePasswordNextSignIn except that the user is required to first perform
    * a multi-factor authentication before password change. After a password change, this property will be automatically
    * reset to false. If not set, default is false.
    */
  var forceChangePasswordNextSignInWithMfa: js.UndefOr[NullableOption[Boolean]] = js.native
  
  /**
    * The password for the user. This property is required when a user is created. It can be updated, but the user will be
    * required to change the password on the next login. The password must satisfy minimum requirements as specified by the
    * user’s passwordPolicies property. By default, a strong password is required.
    */
  var password: js.UndefOr[NullableOption[String]] = js.native
}
object PasswordProfile {
  
  @scala.inline
  def apply(): PasswordProfile = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PasswordProfile]
  }
  
  @scala.inline
  implicit class PasswordProfileMutableBuilder[Self <: PasswordProfile] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setForceChangePasswordNextSignIn(value: NullableOption[Boolean]): Self = StObject.set(x, "forceChangePasswordNextSignIn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setForceChangePasswordNextSignInNull: Self = StObject.set(x, "forceChangePasswordNextSignIn", null)
    
    @scala.inline
    def setForceChangePasswordNextSignInUndefined: Self = StObject.set(x, "forceChangePasswordNextSignIn", js.undefined)
    
    @scala.inline
    def setForceChangePasswordNextSignInWithMfa(value: NullableOption[Boolean]): Self = StObject.set(x, "forceChangePasswordNextSignInWithMfa", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setForceChangePasswordNextSignInWithMfaNull: Self = StObject.set(x, "forceChangePasswordNextSignInWithMfa", null)
    
    @scala.inline
    def setForceChangePasswordNextSignInWithMfaUndefined: Self = StObject.set(x, "forceChangePasswordNextSignInWithMfa", js.undefined)
    
    @scala.inline
    def setPassword(value: NullableOption[String]): Self = StObject.set(x, "password", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPasswordNull: Self = StObject.set(x, "password", null)
    
    @scala.inline
    def setPasswordUndefined: Self = StObject.set(x, "password", js.undefined)
  }
}
