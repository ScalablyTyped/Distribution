package typings
package passportDashLocalLib.passportDashLocalMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IStrategyOptions extends js.Object {
  var passReqToCallback: js.UndefOr[passportDashLocalLib.passportDashLocalLibNumbers.`false`] = js.undefined
  var passwordField: js.UndefOr[java.lang.String] = js.undefined
  var session: js.UndefOr[scala.Boolean] = js.undefined
  var usernameField: js.UndefOr[java.lang.String] = js.undefined
}

object IStrategyOptions {
  @scala.inline
  def apply(
    passReqToCallback: passportDashLocalLib.passportDashLocalLibNumbers.`false` = null,
    passwordField: java.lang.String = null,
    session: js.UndefOr[scala.Boolean] = js.undefined,
    usernameField: java.lang.String = null
  ): IStrategyOptions = {
    val __obj = js.Dynamic.literal()
    if (passReqToCallback != null) __obj.updateDynamic("passReqToCallback")(passReqToCallback)
    if (passwordField != null) __obj.updateDynamic("passwordField")(passwordField)
    if (!js.isUndefined(session)) __obj.updateDynamic("session")(session)
    if (usernameField != null) __obj.updateDynamic("usernameField")(usernameField)
    __obj.asInstanceOf[IStrategyOptions]
  }
}

