package typings.passportWindowsauth.mod

import typings.express.mod.Request_
import typings.expressServeStaticCore.mod.ParamsDictionary
import typings.expressServeStaticCore.mod.Query
import typings.passportWindowsauth.anon.Base
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var getUserNameFromHeader: js.UndefOr[js.Function1[/* req */ Request_[ParamsDictionary, _, _, Query], String]] = js.undefined
  var integrated: js.UndefOr[Boolean] = js.undefined
  var ldap: js.UndefOr[Base] = js.undefined
  var passReqToCallback: js.UndefOr[Boolean] = js.undefined
  var passwordField: js.UndefOr[String] = js.undefined
  var usernameField: js.UndefOr[String] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    getUserNameFromHeader: /* req */ Request_[ParamsDictionary, _, _, Query] => String = null,
    integrated: js.UndefOr[Boolean] = js.undefined,
    ldap: Base = null,
    passReqToCallback: js.UndefOr[Boolean] = js.undefined,
    passwordField: String = null,
    usernameField: String = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (getUserNameFromHeader != null) __obj.updateDynamic("getUserNameFromHeader")(js.Any.fromFunction1(getUserNameFromHeader))
    if (!js.isUndefined(integrated)) __obj.updateDynamic("integrated")(integrated.get.asInstanceOf[js.Any])
    if (ldap != null) __obj.updateDynamic("ldap")(ldap.asInstanceOf[js.Any])
    if (!js.isUndefined(passReqToCallback)) __obj.updateDynamic("passReqToCallback")(passReqToCallback.get.asInstanceOf[js.Any])
    if (passwordField != null) __obj.updateDynamic("passwordField")(passwordField.asInstanceOf[js.Any])
    if (usernameField != null) __obj.updateDynamic("usernameField")(usernameField.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

