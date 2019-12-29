package typings.passportDashLocal.passportDashLocalMod

import typings.passportDashLocal.passportDashLocalBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IStrategyOptions extends js.Object {
  var passReqToCallback: js.UndefOr[`false`] = js.undefined
  var passwordField: js.UndefOr[String] = js.undefined
  var session: js.UndefOr[Boolean] = js.undefined
  var usernameField: js.UndefOr[String] = js.undefined
}

object IStrategyOptions {
  @scala.inline
  def apply(
    passReqToCallback: `false` = null,
    passwordField: String = null,
    session: js.UndefOr[Boolean] = js.undefined,
    usernameField: String = null
  ): IStrategyOptions = {
    val __obj = js.Dynamic.literal()
    if (passReqToCallback != null) __obj.updateDynamic("passReqToCallback")(passReqToCallback.asInstanceOf[js.Any])
    if (passwordField != null) __obj.updateDynamic("passwordField")(passwordField.asInstanceOf[js.Any])
    if (!js.isUndefined(session)) __obj.updateDynamic("session")(session.asInstanceOf[js.Any])
    if (usernameField != null) __obj.updateDynamic("usernameField")(usernameField.asInstanceOf[js.Any])
    __obj.asInstanceOf[IStrategyOptions]
  }
}

