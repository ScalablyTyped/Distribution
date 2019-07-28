package typings.nodeDashTelegramDashBotDashApi.nodeDashTelegramDashBotDashApiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SendBasicOptions extends js.Object {
  var disable_notification: js.UndefOr[Boolean] = js.undefined
  var reply_markup: js.UndefOr[InlineKeyboardMarkup | ReplyKeyboardMarkup | ReplyKeyboardRemove | ForceReply] = js.undefined
  var reply_to_message_id: js.UndefOr[Double] = js.undefined
}

object SendBasicOptions {
  @scala.inline
  def apply(
    disable_notification: js.UndefOr[Boolean] = js.undefined,
    reply_markup: InlineKeyboardMarkup | ReplyKeyboardMarkup | ReplyKeyboardRemove | ForceReply = null,
    reply_to_message_id: Int | Double = null
  ): SendBasicOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(disable_notification)) __obj.updateDynamic("disable_notification")(disable_notification)
    if (reply_markup != null) __obj.updateDynamic("reply_markup")(reply_markup.asInstanceOf[js.Any])
    if (reply_to_message_id != null) __obj.updateDynamic("reply_to_message_id")(reply_to_message_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[SendBasicOptions]
  }
}

