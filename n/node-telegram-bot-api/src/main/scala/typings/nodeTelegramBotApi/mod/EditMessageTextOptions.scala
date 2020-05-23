package typings.nodeTelegramBotApi.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EditMessageTextOptions extends EditMessageCaptionOptions {
  var disable_web_page_preview: js.UndefOr[Boolean] = js.undefined
  var parse_mode: js.UndefOr[ParseMode] = js.undefined
}

object EditMessageTextOptions {
  @scala.inline
  def apply(
    chat_id: Double | String = null,
    disable_web_page_preview: js.UndefOr[Boolean] = js.undefined,
    inline_message_id: String = null,
    message_id: js.UndefOr[Double] = js.undefined,
    parse_mode: ParseMode = null,
    reply_markup: InlineKeyboardMarkup = null
  ): EditMessageTextOptions = {
    val __obj = js.Dynamic.literal()
    if (chat_id != null) __obj.updateDynamic("chat_id")(chat_id.asInstanceOf[js.Any])
    if (!js.isUndefined(disable_web_page_preview)) __obj.updateDynamic("disable_web_page_preview")(disable_web_page_preview.get.asInstanceOf[js.Any])
    if (inline_message_id != null) __obj.updateDynamic("inline_message_id")(inline_message_id.asInstanceOf[js.Any])
    if (!js.isUndefined(message_id)) __obj.updateDynamic("message_id")(message_id.get.asInstanceOf[js.Any])
    if (parse_mode != null) __obj.updateDynamic("parse_mode")(parse_mode.asInstanceOf[js.Any])
    if (reply_markup != null) __obj.updateDynamic("reply_markup")(reply_markup.asInstanceOf[js.Any])
    __obj.asInstanceOf[EditMessageTextOptions]
  }
}

