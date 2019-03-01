package typings
package passportDashRememberDashMeDashExtendedLib.passportDashRememberDashMeDashExtendedMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StrategyOptionWithRequest extends StrategyOption {
  var passReqToCallback: passportDashRememberDashMeDashExtendedLib.passportDashRememberDashMeDashExtendedLibNumbers.`true`
}

object StrategyOptionWithRequest {
  @scala.inline
  def apply(
    passReqToCallback: passportDashRememberDashMeDashExtendedLib.passportDashRememberDashMeDashExtendedLibNumbers.`true`,
    cookie: expressLib.expressMod.eNs.CookieOptions = null,
    key: java.lang.String = null
  ): StrategyOptionWithRequest = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("passReqToCallback")(passReqToCallback)
    if (cookie != null) __obj.updateDynamic("cookie")(cookie)
    if (key != null) __obj.updateDynamic("key")(key)
    __obj.asInstanceOf[StrategyOptionWithRequest]
  }
}

