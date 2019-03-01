package typings
package nodeDashTelegramDashBotDashApiLib.nodeDashTelegramDashBotDashApiMod.TelegramBotNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InlineQueryResultVoice
  extends InlineQueryResultBase
     with InlineQueryResult {
  var caption: js.UndefOr[java.lang.String] = js.undefined
  var input_message_content: js.UndefOr[InputMessageContent] = js.undefined
  var title: java.lang.String
  var `type`: nodeDashTelegramDashBotDashApiLib.nodeDashTelegramDashBotDashApiLibStrings.voice
  var voice_duration: js.UndefOr[scala.Double] = js.undefined
  var voice_url: java.lang.String
}

object InlineQueryResultVoice {
  @scala.inline
  def apply(
    id: java.lang.String,
    title: java.lang.String,
    `type`: nodeDashTelegramDashBotDashApiLib.nodeDashTelegramDashBotDashApiLibStrings.voice,
    voice_url: java.lang.String,
    caption: java.lang.String = null,
    input_message_content: InputMessageContent = null,
    reply_markup: InlineKeyboardMarkup = null,
    voice_duration: scala.Int | scala.Double = null
  ): InlineQueryResultVoice = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("id")(id)
    __obj.updateDynamic("title")(title)
    __obj.updateDynamic("voice_url")(voice_url)
    if (caption != null) __obj.updateDynamic("caption")(caption)
    if (input_message_content != null) __obj.updateDynamic("input_message_content")(input_message_content)
    if (reply_markup != null) __obj.updateDynamic("reply_markup")(reply_markup)
    if (voice_duration != null) __obj.updateDynamic("voice_duration")(voice_duration.asInstanceOf[js.Any])
    __obj.asInstanceOf[InlineQueryResultVoice]
  }
}

