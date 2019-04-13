package typings
package nodeDashTelegramDashBotDashApiLib.nodeDashTelegramDashBotDashApiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EditMessageTextOptions extends EditMessageCaptionOptions {
  var disable_web_page_preview: js.UndefOr[scala.Boolean] = js.undefined
  var parse_mode: js.UndefOr[ParseMode] = js.undefined
}

object EditMessageTextOptions {
  @scala.inline
  def apply(
    chat_id: scala.Double | java.lang.String = null,
    disable_web_page_preview: js.UndefOr[scala.Boolean] = js.undefined,
    inline_message_id: java.lang.String = null,
    message_id: scala.Int | scala.Double = null,
    parse_mode: ParseMode = null,
    reply_markup: InlineKeyboardMarkup = null
  ): EditMessageTextOptions = {
    val __obj = js.Dynamic.literal()
    if (chat_id != null) __obj.updateDynamic("chat_id")(chat_id.asInstanceOf[js.Any])
    if (!js.isUndefined(disable_web_page_preview)) __obj.updateDynamic("disable_web_page_preview")(disable_web_page_preview)
    if (inline_message_id != null) __obj.updateDynamic("inline_message_id")(inline_message_id)
    if (message_id != null) __obj.updateDynamic("message_id")(message_id.asInstanceOf[js.Any])
    if (parse_mode != null) __obj.updateDynamic("parse_mode")(parse_mode)
    if (reply_markup != null) __obj.updateDynamic("reply_markup")(reply_markup)
    __obj.asInstanceOf[EditMessageTextOptions]
  }
}

