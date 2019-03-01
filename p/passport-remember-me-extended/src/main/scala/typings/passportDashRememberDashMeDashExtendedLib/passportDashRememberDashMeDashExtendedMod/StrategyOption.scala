package typings
package passportDashRememberDashMeDashExtendedLib.passportDashRememberDashMeDashExtendedMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StrategyOption extends js.Object {
  var cookie: js.UndefOr[expressLib.expressMod.eNs.CookieOptions] = js.undefined
  var key: js.UndefOr[java.lang.String] = js.undefined
}

object StrategyOption {
  @scala.inline
  def apply(cookie: expressLib.expressMod.eNs.CookieOptions = null, key: java.lang.String = null): StrategyOption = {
    val __obj = js.Dynamic.literal()
    if (cookie != null) __obj.updateDynamic("cookie")(cookie)
    if (key != null) __obj.updateDynamic("key")(key)
    __obj.asInstanceOf[StrategyOption]
  }
}

