package typings
package nodeDashTelegramDashBotDashApiLib.nodeDashTelegramDashBotDashApiMod.TelegramBotNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InlineQueryResultCachedSticker
  extends InlineQueryResultBase
     with InlineQueryResult {
  var input_message_content: js.UndefOr[InputMessageContent] = js.undefined
  var sticker_file_id: java.lang.String
  var `type`: nodeDashTelegramDashBotDashApiLib.nodeDashTelegramDashBotDashApiLibStrings.sticker
}

object InlineQueryResultCachedSticker {
  @scala.inline
  def apply(
    id: java.lang.String,
    sticker_file_id: java.lang.String,
    `type`: nodeDashTelegramDashBotDashApiLib.nodeDashTelegramDashBotDashApiLibStrings.sticker,
    input_message_content: InputMessageContent = null,
    reply_markup: InlineKeyboardMarkup = null
  ): InlineQueryResultCachedSticker = {
    val __obj = js.Dynamic.literal(id = id, sticker_file_id = sticker_file_id)
    __obj.updateDynamic("type")(`type`)
    if (input_message_content != null) __obj.updateDynamic("input_message_content")(input_message_content)
    if (reply_markup != null) __obj.updateDynamic("reply_markup")(reply_markup)
    __obj.asInstanceOf[InlineQueryResultCachedSticker]
  }
}

