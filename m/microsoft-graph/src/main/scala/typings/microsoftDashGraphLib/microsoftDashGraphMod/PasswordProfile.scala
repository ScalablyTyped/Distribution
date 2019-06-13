package typings
package microsoftDashGraphLib.microsoftDashGraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PasswordProfile extends js.Object {
  /** true if the user must change her password on the next login; otherwise false. */
  var forceChangePasswordNextSignIn: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * If true, at next sign-in, the user must perform a multi-factor authentication (MFA) before being forced to change their password.
    * The behavior is identical to forceChangePasswordNextSignIn except that the user is required to first perform a multi-factor authentication before password change.
    * After a password change, this property will be automatically reset to false. If not set, default is false.
    */
  var forceChangePasswordNextSignInWithMfa: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * The password for the user. This property is required when a user is created.
    * It can be updated, but the user will be required to change the password on the next login.
    * The password must satisfy minimum requirements as specified by the user’s passwordPolicies property. By default, a strong password is required.
    */
  var password: js.UndefOr[java.lang.String] = js.undefined
}

object PasswordProfile {
  @scala.inline
  def apply(
    forceChangePasswordNextSignIn: js.UndefOr[scala.Boolean] = js.undefined,
    forceChangePasswordNextSignInWithMfa: js.UndefOr[scala.Boolean] = js.undefined,
    password: java.lang.String = null
  ): PasswordProfile = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(forceChangePasswordNextSignIn)) __obj.updateDynamic("forceChangePasswordNextSignIn")(forceChangePasswordNextSignIn)
    if (!js.isUndefined(forceChangePasswordNextSignInWithMfa)) __obj.updateDynamic("forceChangePasswordNextSignInWithMfa")(forceChangePasswordNextSignInWithMfa)
    if (password != null) __obj.updateDynamic("password")(password)
    __obj.asInstanceOf[PasswordProfile]
  }
}

