package typings.nodeDashTelegramDashBotDashApi.nodeDashTelegramDashBotDashApiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SendMediaGroupOptions extends js.Object {
  var disable_notification: js.UndefOr[Boolean] = js.undefined
  var reply_to_message_id: js.UndefOr[Double] = js.undefined
}

object SendMediaGroupOptions {
  @scala.inline
  def apply(disable_notification: js.UndefOr[Boolean] = js.undefined, reply_to_message_id: Int | Double = null): SendMediaGroupOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(disable_notification)) __obj.updateDynamic("disable_notification")(disable_notification.asInstanceOf[js.Any])
    if (reply_to_message_id != null) __obj.updateDynamic("reply_to_message_id")(reply_to_message_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[SendMediaGroupOptions]
  }
}

