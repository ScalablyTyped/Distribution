package typings.nodeDashTelegramDashBotDashApi.nodeDashTelegramDashBotDashApiMod

import typings.nodeDashTelegramDashBotDashApi.nodeDashTelegramDashBotDashApiStrings.audio
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InlineQueryResultCachedAudio
  extends InlineQueryResultBase
     with InlineQueryResult {
  var audio_file_id: String
  var caption: js.UndefOr[String] = js.undefined
  var input_message_content: js.UndefOr[InputMessageContent] = js.undefined
  var `type`: audio
}

object InlineQueryResultCachedAudio {
  @scala.inline
  def apply(
    audio_file_id: String,
    id: String,
    `type`: audio,
    caption: String = null,
    input_message_content: InputMessageContent = null,
    reply_markup: InlineKeyboardMarkup = null
  ): InlineQueryResultCachedAudio = {
    val __obj = js.Dynamic.literal(audio_file_id = audio_file_id, id = id)
    __obj.updateDynamic("type")(`type`)
    if (caption != null) __obj.updateDynamic("caption")(caption)
    if (input_message_content != null) __obj.updateDynamic("input_message_content")(input_message_content)
    if (reply_markup != null) __obj.updateDynamic("reply_markup")(reply_markup)
    __obj.asInstanceOf[InlineQueryResultCachedAudio]
  }
}

