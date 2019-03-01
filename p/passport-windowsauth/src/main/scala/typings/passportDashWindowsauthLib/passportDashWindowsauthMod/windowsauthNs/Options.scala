package typings
package passportDashWindowsauthLib.passportDashWindowsauthMod.windowsauthNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var getUserNameFromHeader: js.UndefOr[js.Function1[/* req */ expressLib.expressMod.eNs.Request, java.lang.String]] = js.undefined
  var integrated: js.UndefOr[scala.Boolean] = js.undefined
  var ldap: js.UndefOr[passportDashWindowsauthLib.Anon_Base] = js.undefined
  var passReqToCallback: js.UndefOr[scala.Boolean] = js.undefined
  var passwordField: js.UndefOr[java.lang.String] = js.undefined
  var usernameField: js.UndefOr[java.lang.String] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    getUserNameFromHeader: js.Function1[/* req */ expressLib.expressMod.eNs.Request, java.lang.String] = null,
    integrated: js.UndefOr[scala.Boolean] = js.undefined,
    ldap: passportDashWindowsauthLib.Anon_Base = null,
    passReqToCallback: js.UndefOr[scala.Boolean] = js.undefined,
    passwordField: java.lang.String = null,
    usernameField: java.lang.String = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (getUserNameFromHeader != null) __obj.updateDynamic("getUserNameFromHeader")(getUserNameFromHeader)
    if (!js.isUndefined(integrated)) __obj.updateDynamic("integrated")(integrated)
    if (ldap != null) __obj.updateDynamic("ldap")(ldap)
    if (!js.isUndefined(passReqToCallback)) __obj.updateDynamic("passReqToCallback")(passReqToCallback)
    if (passwordField != null) __obj.updateDynamic("passwordField")(passwordField)
    if (usernameField != null) __obj.updateDynamic("usernameField")(usernameField)
    __obj.asInstanceOf[Options]
  }
}

