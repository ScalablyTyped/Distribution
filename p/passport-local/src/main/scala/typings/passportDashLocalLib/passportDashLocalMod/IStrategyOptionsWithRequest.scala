package typings
package passportDashLocalLib.passportDashLocalMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IStrategyOptionsWithRequest extends js.Object {
  var passReqToCallback: passportDashLocalLib.passportDashLocalLibNumbers.`true`
  var passwordField: js.UndefOr[java.lang.String] = js.undefined
  var session: js.UndefOr[scala.Boolean] = js.undefined
  var usernameField: js.UndefOr[java.lang.String] = js.undefined
}

object IStrategyOptionsWithRequest {
  @scala.inline
  def apply(
    passReqToCallback: passportDashLocalLib.passportDashLocalLibNumbers.`true`,
    passwordField: java.lang.String = null,
    session: js.UndefOr[scala.Boolean] = js.undefined,
    usernameField: java.lang.String = null
  ): IStrategyOptionsWithRequest = {
    val __obj = js.Dynamic.literal(passReqToCallback = passReqToCallback)
    if (passwordField != null) __obj.updateDynamic("passwordField")(passwordField)
    if (!js.isUndefined(session)) __obj.updateDynamic("session")(session)
    if (usernameField != null) __obj.updateDynamic("usernameField")(usernameField)
    __obj.asInstanceOf[IStrategyOptionsWithRequest]
  }
}

