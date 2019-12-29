package typings.passportDashRememberDashMeDashExtended.passportDashRememberDashMeDashExtendedMod

import typings.express.expressMod.CookieOptions
import typings.passportDashRememberDashMeDashExtended.passportDashRememberDashMeDashExtendedBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StrategyOptionWithRequest extends StrategyOption {
  var passReqToCallback: `true`
}

object StrategyOptionWithRequest {
  @scala.inline
  def apply(passReqToCallback: `true`, cookie: CookieOptions = null, key: String = null): StrategyOptionWithRequest = {
    val __obj = js.Dynamic.literal(passReqToCallback = passReqToCallback.asInstanceOf[js.Any])
    if (cookie != null) __obj.updateDynamic("cookie")(cookie.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    __obj.asInstanceOf[StrategyOptionWithRequest]
  }
}

