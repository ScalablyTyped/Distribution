package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PasswordProfile extends js.Object {
  
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
  implicit class PasswordProfileOps[Self <: PasswordProfile] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setForceChangePasswordNextSignIn(value: NullableOption[Boolean]): Self = this.set("forceChangePasswordNextSignIn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteForceChangePasswordNextSignIn: Self = this.set("forceChangePasswordNextSignIn", js.undefined)
    
    @scala.inline
    def setForceChangePasswordNextSignInNull: Self = this.set("forceChangePasswordNextSignIn", null)
    
    @scala.inline
    def setForceChangePasswordNextSignInWithMfa(value: NullableOption[Boolean]): Self = this.set("forceChangePasswordNextSignInWithMfa", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteForceChangePasswordNextSignInWithMfa: Self = this.set("forceChangePasswordNextSignInWithMfa", js.undefined)
    
    @scala.inline
    def setForceChangePasswordNextSignInWithMfaNull: Self = this.set("forceChangePasswordNextSignInWithMfa", null)
    
    @scala.inline
    def setPassword(value: NullableOption[String]): Self = this.set("password", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePassword: Self = this.set("password", js.undefined)
    
    @scala.inline
    def setPasswordNull: Self = this.set("password", null)
  }
}
