package typings
package nodeDashTelegramDashBotDashApiLib.nodeDashTelegramDashBotDashApiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InlineQueryResultMpeg4Gif
  extends InlineQueryResultBase
     with InlineQueryResult {
  var caption: js.UndefOr[java.lang.String] = js.undefined
  var input_message_content: js.UndefOr[InputMessageContent] = js.undefined
  var mpeg4_duration: js.UndefOr[scala.Double] = js.undefined
  var mpeg4_height: js.UndefOr[scala.Double] = js.undefined
  var mpeg4_url: java.lang.String
  var mpeg4_width: js.UndefOr[scala.Double] = js.undefined
  var thumb_url: js.UndefOr[java.lang.String] = js.undefined
  var title: js.UndefOr[java.lang.String] = js.undefined
  var `type`: nodeDashTelegramDashBotDashApiLib.nodeDashTelegramDashBotDashApiLibStrings.mpeg4_gif
}

object InlineQueryResultMpeg4Gif {
  @scala.inline
  def apply(
    id: java.lang.String,
    mpeg4_url: java.lang.String,
    `type`: nodeDashTelegramDashBotDashApiLib.nodeDashTelegramDashBotDashApiLibStrings.mpeg4_gif,
    caption: java.lang.String = null,
    input_message_content: InputMessageContent = null,
    mpeg4_duration: scala.Int | scala.Double = null,
    mpeg4_height: scala.Int | scala.Double = null,
    mpeg4_width: scala.Int | scala.Double = null,
    reply_markup: InlineKeyboardMarkup = null,
    thumb_url: java.lang.String = null,
    title: java.lang.String = null
  ): InlineQueryResultMpeg4Gif = {
    val __obj = js.Dynamic.literal(id = id, mpeg4_url = mpeg4_url)
    __obj.updateDynamic("type")(`type`)
    if (caption != null) __obj.updateDynamic("caption")(caption)
    if (input_message_content != null) __obj.updateDynamic("input_message_content")(input_message_content)
    if (mpeg4_duration != null) __obj.updateDynamic("mpeg4_duration")(mpeg4_duration.asInstanceOf[js.Any])
    if (mpeg4_height != null) __obj.updateDynamic("mpeg4_height")(mpeg4_height.asInstanceOf[js.Any])
    if (mpeg4_width != null) __obj.updateDynamic("mpeg4_width")(mpeg4_width.asInstanceOf[js.Any])
    if (reply_markup != null) __obj.updateDynamic("reply_markup")(reply_markup)
    if (thumb_url != null) __obj.updateDynamic("thumb_url")(thumb_url)
    if (title != null) __obj.updateDynamic("title")(title)
    __obj.asInstanceOf[InlineQueryResultMpeg4Gif]
  }
}

