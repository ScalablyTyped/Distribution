package typings.nodeDashTelegramDashBotDashApi.nodeDashTelegramDashBotDashApiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StopPollingOptions extends js.Object {
  var cancel: js.UndefOr[Boolean] = js.undefined
  var reason: js.UndefOr[String] = js.undefined
}

object StopPollingOptions {
  @scala.inline
  def apply(cancel: js.UndefOr[Boolean] = js.undefined, reason: String = null): StopPollingOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(cancel)) __obj.updateDynamic("cancel")(cancel.asInstanceOf[js.Any])
    if (reason != null) __obj.updateDynamic("reason")(reason.asInstanceOf[js.Any])
    __obj.asInstanceOf[StopPollingOptions]
  }
}

