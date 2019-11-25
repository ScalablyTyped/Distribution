package typings.passportDashRememberDashMeDashExtended.passportDashRememberDashMeDashExtendedMod

import typings.express.expressMod.CookieOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StrategyOption extends js.Object {
  var cookie: js.UndefOr[CookieOptions] = js.undefined
  var key: js.UndefOr[String] = js.undefined
}

object StrategyOption {
  @scala.inline
  def apply(cookie: CookieOptions = null, key: String = null): StrategyOption = {
    val __obj = js.Dynamic.literal()
    if (cookie != null) __obj.updateDynamic("cookie")(cookie.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    __obj.asInstanceOf[StrategyOption]
  }
}

