package typings.passportWindowsauth

import typings.express.mod.Request_
import typings.expressServeStaticCore.mod.ParamsDictionary
import typings.passportWindowsauth.passportWindowsauthBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined passport-windowsauth.passport-windowsauth.Options & {  passReqToCallback  :true} */
trait OptionspassReqToCallbackt extends js.Object {
  var getUserNameFromHeader: js.UndefOr[js.Function1[/* req */ Request_[ParamsDictionary], String]] = js.undefined
  var integrated: js.UndefOr[Boolean] = js.undefined
  var ldap: js.UndefOr[AnonBase] = js.undefined
  var passReqToCallback: js.UndefOr[Boolean with `true`] = js.undefined
  var passwordField: js.UndefOr[String] = js.undefined
  var usernameField: js.UndefOr[String] = js.undefined
}

object OptionspassReqToCallbackt {
  @scala.inline
  def apply(
    getUserNameFromHeader: /* req */ Request_[ParamsDictionary] => String = null,
    integrated: js.UndefOr[Boolean] = js.undefined,
    ldap: AnonBase = null,
    passReqToCallback: js.UndefOr[Boolean with `true`] = js.undefined,
    passwordField: String = null,
    usernameField: String = null
  ): OptionspassReqToCallbackt = {
    val __obj = js.Dynamic.literal()
    if (getUserNameFromHeader != null) __obj.updateDynamic("getUserNameFromHeader")(js.Any.fromFunction1(getUserNameFromHeader))
    if (!js.isUndefined(integrated)) __obj.updateDynamic("integrated")(integrated.asInstanceOf[js.Any])
    if (ldap != null) __obj.updateDynamic("ldap")(ldap.asInstanceOf[js.Any])
    if (!js.isUndefined(passReqToCallback)) __obj.updateDynamic("passReqToCallback")(passReqToCallback.asInstanceOf[js.Any])
    if (passwordField != null) __obj.updateDynamic("passwordField")(passwordField.asInstanceOf[js.Any])
    if (usernameField != null) __obj.updateDynamic("usernameField")(usernameField.asInstanceOf[js.Any])
    __obj.asInstanceOf[OptionspassReqToCallbackt]
  }
}

