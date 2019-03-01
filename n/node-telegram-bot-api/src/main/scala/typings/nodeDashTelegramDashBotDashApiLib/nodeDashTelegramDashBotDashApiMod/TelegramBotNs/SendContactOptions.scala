package typings
package nodeDashTelegramDashBotDashApiLib.nodeDashTelegramDashBotDashApiMod.TelegramBotNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SendContactOptions extends SendBasicOptions {
  var last_name: js.UndefOr[java.lang.String] = js.undefined
}

object SendContactOptions {
  @scala.inline
  def apply(
    disable_notification: js.UndefOr[scala.Boolean] = js.undefined,
    last_name: java.lang.String = null,
    reply_markup: InlineKeyboardMarkup | ReplyKeyboardMarkup | ReplyKeyboardRemove | ForceReply = null,
    reply_to_message_id: scala.Int | scala.Double = null
  ): SendContactOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(disable_notification)) __obj.updateDynamic("disable_notification")(disable_notification)
    if (last_name != null) __obj.updateDynamic("last_name")(last_name)
    if (reply_markup != null) __obj.updateDynamic("reply_markup")(reply_markup.asInstanceOf[js.Any])
    if (reply_to_message_id != null) __obj.updateDynamic("reply_to_message_id")(reply_to_message_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[SendContactOptions]
  }
}

