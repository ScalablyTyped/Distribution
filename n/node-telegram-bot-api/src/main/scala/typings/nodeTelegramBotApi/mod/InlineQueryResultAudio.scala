package typings.nodeTelegramBotApi.mod

import typings.nodeTelegramBotApi.nodeTelegramBotApiStrings.audio
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InlineQueryResultAudio
  extends InlineQueryResultBase
     with InlineQueryResult {
  var audio_duration: js.UndefOr[Double] = js.undefined
  var audio_url: String
  var caption: js.UndefOr[String] = js.undefined
  var input_message_content: js.UndefOr[InputMessageContent] = js.undefined
  var performer: js.UndefOr[String] = js.undefined
  var title: String
  var `type`: audio
}

object InlineQueryResultAudio {
  @scala.inline
  def apply(
    audio_url: String,
    id: String,
    title: String,
    `type`: audio,
    audio_duration: Int | Double = null,
    caption: String = null,
    input_message_content: InputMessageContent = null,
    performer: String = null,
    reply_markup: InlineKeyboardMarkup = null
  ): InlineQueryResultAudio = {
    val __obj = js.Dynamic.literal(audio_url = audio_url.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (audio_duration != null) __obj.updateDynamic("audio_duration")(audio_duration.asInstanceOf[js.Any])
    if (caption != null) __obj.updateDynamic("caption")(caption.asInstanceOf[js.Any])
    if (input_message_content != null) __obj.updateDynamic("input_message_content")(input_message_content.asInstanceOf[js.Any])
    if (performer != null) __obj.updateDynamic("performer")(performer.asInstanceOf[js.Any])
    if (reply_markup != null) __obj.updateDynamic("reply_markup")(reply_markup.asInstanceOf[js.Any])
    __obj.asInstanceOf[InlineQueryResultAudio]
  }
}

