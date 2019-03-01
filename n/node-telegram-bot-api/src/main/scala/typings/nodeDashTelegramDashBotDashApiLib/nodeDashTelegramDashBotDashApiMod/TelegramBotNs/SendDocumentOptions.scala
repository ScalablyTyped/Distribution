package typings
package nodeDashTelegramDashBotDashApiLib.nodeDashTelegramDashBotDashApiMod.TelegramBotNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SendDocumentOptions extends SendBasicOptions {
  var caption: js.UndefOr[java.lang.String] = js.undefined
}

object SendDocumentOptions {
  @scala.inline
  def apply(
    caption: java.lang.String = null,
    disable_notification: js.UndefOr[scala.Boolean] = js.undefined,
    reply_markup: InlineKeyboardMarkup | ReplyKeyboardMarkup | ReplyKeyboardRemove | ForceReply = null,
    reply_to_message_id: scala.Int | scala.Double = null
  ): SendDocumentOptions = {
    val __obj = js.Dynamic.literal()
    if (caption != null) __obj.updateDynamic("caption")(caption)
    if (!js.isUndefined(disable_notification)) __obj.updateDynamic("disable_notification")(disable_notification)
    if (reply_markup != null) __obj.updateDynamic("reply_markup")(reply_markup.asInstanceOf[js.Any])
    if (reply_to_message_id != null) __obj.updateDynamic("reply_to_message_id")(reply_to_message_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[SendDocumentOptions]
  }
}

