package typings.passportDashLocal.passportDashLocalMod

import typings.passportDashLocal.passportDashLocalNumbers.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IStrategyOptionsWithRequest extends js.Object {
  var passReqToCallback: `true`
  var passwordField: js.UndefOr[String] = js.undefined
  var session: js.UndefOr[Boolean] = js.undefined
  var usernameField: js.UndefOr[String] = js.undefined
}

object IStrategyOptionsWithRequest {
  @scala.inline
  def apply(
    passReqToCallback: `true`,
    passwordField: String = null,
    session: js.UndefOr[Boolean] = js.undefined,
    usernameField: String = null
  ): IStrategyOptionsWithRequest = {
    val __obj = js.Dynamic.literal(passReqToCallback = passReqToCallback)
    if (passwordField != null) __obj.updateDynamic("passwordField")(passwordField)
    if (!js.isUndefined(session)) __obj.updateDynamic("session")(session)
    if (usernameField != null) __obj.updateDynamic("usernameField")(usernameField)
    __obj.asInstanceOf[IStrategyOptionsWithRequest]
  }
}

