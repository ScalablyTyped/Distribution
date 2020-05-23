package typings.nodeTelegramBotApi.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SendVideoNoteOptions extends SendBasicOptions {
  var duration: js.UndefOr[Double] = js.undefined
  var length: js.UndefOr[Double] = js.undefined
}

object SendVideoNoteOptions {
  @scala.inline
  def apply(
    disable_notification: js.UndefOr[Boolean] = js.undefined,
    duration: js.UndefOr[Double] = js.undefined,
    length: js.UndefOr[Double] = js.undefined,
    reply_markup: InlineKeyboardMarkup | ReplyKeyboardMarkup | ReplyKeyboardRemove | ForceReply = null,
    reply_to_message_id: js.UndefOr[Double] = js.undefined
  ): SendVideoNoteOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(disable_notification)) __obj.updateDynamic("disable_notification")(disable_notification.get.asInstanceOf[js.Any])
    if (!js.isUndefined(duration)) __obj.updateDynamic("duration")(duration.get.asInstanceOf[js.Any])
    if (!js.isUndefined(length)) __obj.updateDynamic("length")(length.get.asInstanceOf[js.Any])
    if (reply_markup != null) __obj.updateDynamic("reply_markup")(reply_markup.asInstanceOf[js.Any])
    if (!js.isUndefined(reply_to_message_id)) __obj.updateDynamic("reply_to_message_id")(reply_to_message_id.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[SendVideoNoteOptions]
  }
}

