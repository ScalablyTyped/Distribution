package typings
package nodeDashTelegramDashBotDashApiLib.nodeDashTelegramDashBotDashApiMod.TelegramBotNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InlineQueryResultAudio
  extends InlineQueryResultBase
     with InlineQueryResult {
  var audio_duration: js.UndefOr[scala.Double] = js.undefined
  var audio_url: java.lang.String
  var caption: js.UndefOr[java.lang.String] = js.undefined
  var input_message_content: js.UndefOr[InputMessageContent] = js.undefined
  var performer: js.UndefOr[java.lang.String] = js.undefined
  var title: java.lang.String
  var `type`: nodeDashTelegramDashBotDashApiLib.nodeDashTelegramDashBotDashApiLibStrings.audio
}

object InlineQueryResultAudio {
  @scala.inline
  def apply(
    audio_url: java.lang.String,
    id: java.lang.String,
    title: java.lang.String,
    `type`: nodeDashTelegramDashBotDashApiLib.nodeDashTelegramDashBotDashApiLibStrings.audio,
    audio_duration: scala.Int | scala.Double = null,
    caption: java.lang.String = null,
    input_message_content: InputMessageContent = null,
    performer: java.lang.String = null,
    reply_markup: InlineKeyboardMarkup = null
  ): InlineQueryResultAudio = {
    val __obj = js.Dynamic.literal(audio_url = audio_url, id = id, title = title)
    __obj.updateDynamic("type")(`type`)
    if (audio_duration != null) __obj.updateDynamic("audio_duration")(audio_duration.asInstanceOf[js.Any])
    if (caption != null) __obj.updateDynamic("caption")(caption)
    if (input_message_content != null) __obj.updateDynamic("input_message_content")(input_message_content)
    if (performer != null) __obj.updateDynamic("performer")(performer)
    if (reply_markup != null) __obj.updateDynamic("reply_markup")(reply_markup)
    __obj.asInstanceOf[InlineQueryResultAudio]
  }
}

