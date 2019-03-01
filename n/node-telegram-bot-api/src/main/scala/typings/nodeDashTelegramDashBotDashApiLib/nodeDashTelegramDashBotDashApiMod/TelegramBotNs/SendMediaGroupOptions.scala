package typings
package nodeDashTelegramDashBotDashApiLib.nodeDashTelegramDashBotDashApiMod.TelegramBotNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SendMediaGroupOptions extends js.Object {
  var disable_notification: js.UndefOr[scala.Boolean] = js.undefined
  var reply_to_message_id: js.UndefOr[scala.Double] = js.undefined
}

object SendMediaGroupOptions {
  @scala.inline
  def apply(
    disable_notification: js.UndefOr[scala.Boolean] = js.undefined,
    reply_to_message_id: scala.Int | scala.Double = null
  ): SendMediaGroupOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(disable_notification)) __obj.updateDynamic("disable_notification")(disable_notification)
    if (reply_to_message_id != null) __obj.updateDynamic("reply_to_message_id")(reply_to_message_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[SendMediaGroupOptions]
  }
}

