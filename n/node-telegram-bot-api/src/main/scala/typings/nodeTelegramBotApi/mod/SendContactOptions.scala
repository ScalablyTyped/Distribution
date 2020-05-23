package typings.nodeTelegramBotApi.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SendContactOptions extends SendBasicOptions {
  var last_name: js.UndefOr[String] = js.undefined
}

object SendContactOptions {
  @scala.inline
  def apply(
    disable_notification: js.UndefOr[Boolean] = js.undefined,
    last_name: String = null,
    reply_markup: InlineKeyboardMarkup | ReplyKeyboardMarkup | ReplyKeyboardRemove | ForceReply = null,
    reply_to_message_id: js.UndefOr[Double] = js.undefined
  ): SendContactOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(disable_notification)) __obj.updateDynamic("disable_notification")(disable_notification.get.asInstanceOf[js.Any])
    if (last_name != null) __obj.updateDynamic("last_name")(last_name.asInstanceOf[js.Any])
    if (reply_markup != null) __obj.updateDynamic("reply_markup")(reply_markup.asInstanceOf[js.Any])
    if (!js.isUndefined(reply_to_message_id)) __obj.updateDynamic("reply_to_message_id")(reply_to_message_id.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[SendContactOptions]
  }
}

