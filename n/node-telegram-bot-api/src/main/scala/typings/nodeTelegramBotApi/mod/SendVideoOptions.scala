package typings.nodeTelegramBotApi.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SendVideoOptions extends SendBasicOptions {
  var caption: js.UndefOr[String] = js.undefined
  var duration: js.UndefOr[Double] = js.undefined
  var height: js.UndefOr[Double] = js.undefined
  var parse_mode: js.UndefOr[ParseMode] = js.undefined
  var width: js.UndefOr[Double] = js.undefined
}

object SendVideoOptions {
  @scala.inline
  def apply(
    caption: String = null,
    disable_notification: js.UndefOr[Boolean] = js.undefined,
    duration: Int | Double = null,
    height: Int | Double = null,
    parse_mode: ParseMode = null,
    reply_markup: InlineKeyboardMarkup | ReplyKeyboardMarkup | ReplyKeyboardRemove | ForceReply = null,
    reply_to_message_id: Int | Double = null,
    width: Int | Double = null
  ): SendVideoOptions = {
    val __obj = js.Dynamic.literal()
    if (caption != null) __obj.updateDynamic("caption")(caption.asInstanceOf[js.Any])
    if (!js.isUndefined(disable_notification)) __obj.updateDynamic("disable_notification")(disable_notification.asInstanceOf[js.Any])
    if (duration != null) __obj.updateDynamic("duration")(duration.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (parse_mode != null) __obj.updateDynamic("parse_mode")(parse_mode.asInstanceOf[js.Any])
    if (reply_markup != null) __obj.updateDynamic("reply_markup")(reply_markup.asInstanceOf[js.Any])
    if (reply_to_message_id != null) __obj.updateDynamic("reply_to_message_id")(reply_to_message_id.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[SendVideoOptions]
  }
}

