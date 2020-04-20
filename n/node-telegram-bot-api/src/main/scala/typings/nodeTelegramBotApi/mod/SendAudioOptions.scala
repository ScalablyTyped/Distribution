package typings.nodeTelegramBotApi.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SendAudioOptions extends SendBasicOptions {
  var caption: js.UndefOr[String] = js.undefined
  var duration: js.UndefOr[Double] = js.undefined
  var parse_mode: js.UndefOr[ParseMode] = js.undefined
  var performer: js.UndefOr[String] = js.undefined
  var title: js.UndefOr[String] = js.undefined
}

object SendAudioOptions {
  @scala.inline
  def apply(
    caption: String = null,
    disable_notification: js.UndefOr[Boolean] = js.undefined,
    duration: Int | Double = null,
    parse_mode: ParseMode = null,
    performer: String = null,
    reply_markup: InlineKeyboardMarkup | ReplyKeyboardMarkup | ReplyKeyboardRemove | ForceReply = null,
    reply_to_message_id: Int | Double = null,
    title: String = null
  ): SendAudioOptions = {
    val __obj = js.Dynamic.literal()
    if (caption != null) __obj.updateDynamic("caption")(caption.asInstanceOf[js.Any])
    if (!js.isUndefined(disable_notification)) __obj.updateDynamic("disable_notification")(disable_notification.asInstanceOf[js.Any])
    if (duration != null) __obj.updateDynamic("duration")(duration.asInstanceOf[js.Any])
    if (parse_mode != null) __obj.updateDynamic("parse_mode")(parse_mode.asInstanceOf[js.Any])
    if (performer != null) __obj.updateDynamic("performer")(performer.asInstanceOf[js.Any])
    if (reply_markup != null) __obj.updateDynamic("reply_markup")(reply_markup.asInstanceOf[js.Any])
    if (reply_to_message_id != null) __obj.updateDynamic("reply_to_message_id")(reply_to_message_id.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    __obj.asInstanceOf[SendAudioOptions]
  }
}

