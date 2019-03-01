package typings
package nodeDashTelegramDashBotDashApiLib.nodeDashTelegramDashBotDashApiMod.TelegramBotNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InlineQueryResultCachedAudio
  extends InlineQueryResultBase
     with InlineQueryResult {
  var audio_file_id: java.lang.String
  var caption: js.UndefOr[java.lang.String] = js.undefined
  var input_message_content: js.UndefOr[InputMessageContent] = js.undefined
  var `type`: nodeDashTelegramDashBotDashApiLib.nodeDashTelegramDashBotDashApiLibStrings.audio
}

object InlineQueryResultCachedAudio {
  @scala.inline
  def apply(
    audio_file_id: java.lang.String,
    id: java.lang.String,
    `type`: nodeDashTelegramDashBotDashApiLib.nodeDashTelegramDashBotDashApiLibStrings.audio,
    caption: java.lang.String = null,
    input_message_content: InputMessageContent = null,
    reply_markup: InlineKeyboardMarkup = null
  ): InlineQueryResultCachedAudio = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("audio_file_id")(audio_file_id)
    __obj.updateDynamic("id")(id)
    if (caption != null) __obj.updateDynamic("caption")(caption)
    if (input_message_content != null) __obj.updateDynamic("input_message_content")(input_message_content)
    if (reply_markup != null) __obj.updateDynamic("reply_markup")(reply_markup)
    __obj.asInstanceOf[InlineQueryResultCachedAudio]
  }
}

