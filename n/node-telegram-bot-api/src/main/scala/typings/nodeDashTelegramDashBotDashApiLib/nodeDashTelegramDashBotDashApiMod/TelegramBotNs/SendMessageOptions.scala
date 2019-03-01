package typings
package nodeDashTelegramDashBotDashApiLib.nodeDashTelegramDashBotDashApiMod.TelegramBotNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SendMessageOptions extends SendBasicOptions {
  var disable_web_page_preview: js.UndefOr[scala.Boolean] = js.undefined
  var parse_mode: js.UndefOr[ParseMode] = js.undefined
}

object SendMessageOptions {
  @scala.inline
  def apply(
    disable_notification: js.UndefOr[scala.Boolean] = js.undefined,
    disable_web_page_preview: js.UndefOr[scala.Boolean] = js.undefined,
    parse_mode: ParseMode = null,
    reply_markup: InlineKeyboardMarkup | ReplyKeyboardMarkup | ReplyKeyboardRemove | ForceReply = null,
    reply_to_message_id: scala.Int | scala.Double = null
  ): SendMessageOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(disable_notification)) __obj.updateDynamic("disable_notification")(disable_notification)
    if (!js.isUndefined(disable_web_page_preview)) __obj.updateDynamic("disable_web_page_preview")(disable_web_page_preview)
    if (parse_mode != null) __obj.updateDynamic("parse_mode")(parse_mode)
    if (reply_markup != null) __obj.updateDynamic("reply_markup")(reply_markup.asInstanceOf[js.Any])
    if (reply_to_message_id != null) __obj.updateDynamic("reply_to_message_id")(reply_to_message_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[SendMessageOptions]
  }
}

