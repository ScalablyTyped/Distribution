package typings.nodeTelegramBotApi.mod

import typings.nodeTelegramBotApi.nodeTelegramBotApiStrings.mpeg4_gif
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InlineQueryResultMpeg4Gif
  extends InlineQueryResultBase
     with InlineQueryResult {
  var caption: js.UndefOr[String] = js.undefined
  var input_message_content: js.UndefOr[InputMessageContent] = js.undefined
  var mpeg4_duration: js.UndefOr[Double] = js.undefined
  var mpeg4_height: js.UndefOr[Double] = js.undefined
  var mpeg4_url: String
  var mpeg4_width: js.UndefOr[Double] = js.undefined
  var thumb_url: js.UndefOr[String] = js.undefined
  var title: js.UndefOr[String] = js.undefined
  var `type`: mpeg4_gif
}

object InlineQueryResultMpeg4Gif {
  @scala.inline
  def apply(
    id: String,
    mpeg4_url: String,
    `type`: mpeg4_gif,
    caption: String = null,
    input_message_content: InputMessageContent = null,
    mpeg4_duration: Int | Double = null,
    mpeg4_height: Int | Double = null,
    mpeg4_width: Int | Double = null,
    reply_markup: InlineKeyboardMarkup = null,
    thumb_url: String = null,
    title: String = null
  ): InlineQueryResultMpeg4Gif = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], mpeg4_url = mpeg4_url.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (caption != null) __obj.updateDynamic("caption")(caption.asInstanceOf[js.Any])
    if (input_message_content != null) __obj.updateDynamic("input_message_content")(input_message_content.asInstanceOf[js.Any])
    if (mpeg4_duration != null) __obj.updateDynamic("mpeg4_duration")(mpeg4_duration.asInstanceOf[js.Any])
    if (mpeg4_height != null) __obj.updateDynamic("mpeg4_height")(mpeg4_height.asInstanceOf[js.Any])
    if (mpeg4_width != null) __obj.updateDynamic("mpeg4_width")(mpeg4_width.asInstanceOf[js.Any])
    if (reply_markup != null) __obj.updateDynamic("reply_markup")(reply_markup.asInstanceOf[js.Any])
    if (thumb_url != null) __obj.updateDynamic("thumb_url")(thumb_url.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    __obj.asInstanceOf[InlineQueryResultMpeg4Gif]
  }
}

