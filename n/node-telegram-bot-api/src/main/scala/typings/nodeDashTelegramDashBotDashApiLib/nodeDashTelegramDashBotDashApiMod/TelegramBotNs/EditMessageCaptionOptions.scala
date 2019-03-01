package typings
package nodeDashTelegramDashBotDashApiLib.nodeDashTelegramDashBotDashApiMod.TelegramBotNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EditMessageCaptionOptions extends EditMessageReplyMarkupOptions {
  var reply_markup: js.UndefOr[InlineKeyboardMarkup] = js.undefined
}

object EditMessageCaptionOptions {
  @scala.inline
  def apply(
    chat_id: scala.Double | java.lang.String = null,
    inline_message_id: java.lang.String = null,
    message_id: scala.Int | scala.Double = null,
    reply_markup: InlineKeyboardMarkup = null
  ): EditMessageCaptionOptions = {
    val __obj = js.Dynamic.literal()
    if (chat_id != null) __obj.updateDynamic("chat_id")(chat_id.asInstanceOf[js.Any])
    if (inline_message_id != null) __obj.updateDynamic("inline_message_id")(inline_message_id)
    if (message_id != null) __obj.updateDynamic("message_id")(message_id.asInstanceOf[js.Any])
    if (reply_markup != null) __obj.updateDynamic("reply_markup")(reply_markup)
    __obj.asInstanceOf[EditMessageCaptionOptions]
  }
}

