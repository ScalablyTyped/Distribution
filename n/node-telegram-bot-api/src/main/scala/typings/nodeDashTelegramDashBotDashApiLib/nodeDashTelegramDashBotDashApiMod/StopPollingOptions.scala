package typings
package nodeDashTelegramDashBotDashApiLib.nodeDashTelegramDashBotDashApiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StopPollingOptions extends js.Object {
  var cancel: js.UndefOr[scala.Boolean] = js.undefined
  var reason: js.UndefOr[java.lang.String] = js.undefined
}

object StopPollingOptions {
  @scala.inline
  def apply(cancel: js.UndefOr[scala.Boolean] = js.undefined, reason: java.lang.String = null): StopPollingOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(cancel)) __obj.updateDynamic("cancel")(cancel)
    if (reason != null) __obj.updateDynamic("reason")(reason)
    __obj.asInstanceOf[StopPollingOptions]
  }
}

