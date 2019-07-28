package typings.nodeDashTelegramDashBotDashApi.nodeDashTelegramDashBotDashApiMod

import typings.nodeDashTelegramDashBotDashApi.nodeDashTelegramDashBotDashApiStrings.mpeg4_gif
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InlineQueryResultCachedMpeg4Gif
  extends InlineQueryResultBase
     with InlineQueryResult {
  var caption: js.UndefOr[String] = js.undefined
  var input_message_content: js.UndefOr[InputMessageContent] = js.undefined
  var mpeg4_file_id: String
  var title: js.UndefOr[String] = js.undefined
  var `type`: mpeg4_gif
}

object InlineQueryResultCachedMpeg4Gif {
  @scala.inline
  def apply(
    id: String,
    mpeg4_file_id: String,
    `type`: mpeg4_gif,
    caption: String = null,
    input_message_content: InputMessageContent = null,
    reply_markup: InlineKeyboardMarkup = null,
    title: String = null
  ): InlineQueryResultCachedMpeg4Gif = {
    val __obj = js.Dynamic.literal(id = id, mpeg4_file_id = mpeg4_file_id)
    __obj.updateDynamic("type")(`type`)
    if (caption != null) __obj.updateDynamic("caption")(caption)
    if (input_message_content != null) __obj.updateDynamic("input_message_content")(input_message_content)
    if (reply_markup != null) __obj.updateDynamic("reply_markup")(reply_markup)
    if (title != null) __obj.updateDynamic("title")(title)
    __obj.asInstanceOf[InlineQueryResultCachedMpeg4Gif]
  }
}

