package typings.passportDashWindowsauth.passportDashWindowsauthMod

import typings.express.expressMod.Request
import typings.passportDashWindowsauth.Anon_Base
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var getUserNameFromHeader: js.UndefOr[js.Function1[/* req */ Request, String]] = js.undefined
  var integrated: js.UndefOr[Boolean] = js.undefined
  var ldap: js.UndefOr[Anon_Base] = js.undefined
  var passReqToCallback: js.UndefOr[Boolean] = js.undefined
  var passwordField: js.UndefOr[String] = js.undefined
  var usernameField: js.UndefOr[String] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    getUserNameFromHeader: /* req */ Request => String = null,
    integrated: js.UndefOr[Boolean] = js.undefined,
    ldap: Anon_Base = null,
    passReqToCallback: js.UndefOr[Boolean] = js.undefined,
    passwordField: String = null,
    usernameField: String = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (getUserNameFromHeader != null) __obj.updateDynamic("getUserNameFromHeader")(js.Any.fromFunction1(getUserNameFromHeader))
    if (!js.isUndefined(integrated)) __obj.updateDynamic("integrated")(integrated)
    if (ldap != null) __obj.updateDynamic("ldap")(ldap)
    if (!js.isUndefined(passReqToCallback)) __obj.updateDynamic("passReqToCallback")(passReqToCallback)
    if (passwordField != null) __obj.updateDynamic("passwordField")(passwordField)
    if (usernameField != null) __obj.updateDynamic("usernameField")(usernameField)
    __obj.asInstanceOf[Options]
  }
}

