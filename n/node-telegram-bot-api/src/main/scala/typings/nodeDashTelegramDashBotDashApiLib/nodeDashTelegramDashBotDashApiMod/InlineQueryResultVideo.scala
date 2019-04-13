package typings
package nodeDashTelegramDashBotDashApiLib.nodeDashTelegramDashBotDashApiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InlineQueryResultVideo
  extends InlineQueryResultBase
     with InlineQueryResult {
  var caption: js.UndefOr[java.lang.String] = js.undefined
  var description: js.UndefOr[java.lang.String] = js.undefined
  var input_message_content: js.UndefOr[InputMessageContent] = js.undefined
  var mime_type: java.lang.String
  var thumb_url: java.lang.String
  var title: java.lang.String
  var `type`: nodeDashTelegramDashBotDashApiLib.nodeDashTelegramDashBotDashApiLibStrings.video
  var video_duration: js.UndefOr[scala.Double] = js.undefined
  var video_height: js.UndefOr[scala.Double] = js.undefined
  var video_url: java.lang.String
  var video_width: js.UndefOr[scala.Double] = js.undefined
}

object InlineQueryResultVideo {
  @scala.inline
  def apply(
    id: java.lang.String,
    mime_type: java.lang.String,
    thumb_url: java.lang.String,
    title: java.lang.String,
    `type`: nodeDashTelegramDashBotDashApiLib.nodeDashTelegramDashBotDashApiLibStrings.video,
    video_url: java.lang.String,
    caption: java.lang.String = null,
    description: java.lang.String = null,
    input_message_content: InputMessageContent = null,
    reply_markup: InlineKeyboardMarkup = null,
    video_duration: scala.Int | scala.Double = null,
    video_height: scala.Int | scala.Double = null,
    video_width: scala.Int | scala.Double = null
  ): InlineQueryResultVideo = {
    val __obj = js.Dynamic.literal(id = id, mime_type = mime_type, thumb_url = thumb_url, title = title, video_url = video_url)
    __obj.updateDynamic("type")(`type`)
    if (caption != null) __obj.updateDynamic("caption")(caption)
    if (description != null) __obj.updateDynamic("description")(description)
    if (input_message_content != null) __obj.updateDynamic("input_message_content")(input_message_content)
    if (reply_markup != null) __obj.updateDynamic("reply_markup")(reply_markup)
    if (video_duration != null) __obj.updateDynamic("video_duration")(video_duration.asInstanceOf[js.Any])
    if (video_height != null) __obj.updateDynamic("video_height")(video_height.asInstanceOf[js.Any])
    if (video_width != null) __obj.updateDynamic("video_width")(video_width.asInstanceOf[js.Any])
    __obj.asInstanceOf[InlineQueryResultVideo]
  }
}

