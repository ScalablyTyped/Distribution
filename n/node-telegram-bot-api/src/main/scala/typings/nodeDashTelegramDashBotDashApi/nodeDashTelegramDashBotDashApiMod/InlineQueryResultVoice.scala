package typings.nodeDashTelegramDashBotDashApi.nodeDashTelegramDashBotDashApiMod

import typings.nodeDashTelegramDashBotDashApi.nodeDashTelegramDashBotDashApiStrings.voice
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InlineQueryResultVoice
  extends InlineQueryResultBase
     with InlineQueryResult {
  var caption: js.UndefOr[String] = js.undefined
  var input_message_content: js.UndefOr[InputMessageContent] = js.undefined
  var title: String
  var `type`: voice
  var voice_duration: js.UndefOr[Double] = js.undefined
  var voice_url: String
}

object InlineQueryResultVoice {
  @scala.inline
  def apply(
    id: String,
    title: String,
    `type`: voice,
    voice_url: String,
    caption: String = null,
    input_message_content: InputMessageContent = null,
    reply_markup: InlineKeyboardMarkup = null,
    voice_duration: Int | Double = null
  ): InlineQueryResultVoice = {
    val __obj = js.Dynamic.literal(id = id, title = title, voice_url = voice_url)
    __obj.updateDynamic("type")(`type`)
    if (caption != null) __obj.updateDynamic("caption")(caption)
    if (input_message_content != null) __obj.updateDynamic("input_message_content")(input_message_content)
    if (reply_markup != null) __obj.updateDynamic("reply_markup")(reply_markup)
    if (voice_duration != null) __obj.updateDynamic("voice_duration")(voice_duration.asInstanceOf[js.Any])
    __obj.asInstanceOf[InlineQueryResultVoice]
  }
}

