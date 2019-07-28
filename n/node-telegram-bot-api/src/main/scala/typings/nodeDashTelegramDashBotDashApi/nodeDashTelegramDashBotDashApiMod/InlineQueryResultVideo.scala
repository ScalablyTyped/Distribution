package typings.nodeDashTelegramDashBotDashApi.nodeDashTelegramDashBotDashApiMod

import typings.nodeDashTelegramDashBotDashApi.nodeDashTelegramDashBotDashApiStrings.video
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InlineQueryResultVideo
  extends InlineQueryResultBase
     with InlineQueryResult {
  var caption: js.UndefOr[String] = js.undefined
  var description: js.UndefOr[String] = js.undefined
  var input_message_content: js.UndefOr[InputMessageContent] = js.undefined
  var mime_type: String
  var thumb_url: String
  var title: String
  var `type`: video
  var video_duration: js.UndefOr[Double] = js.undefined
  var video_height: js.UndefOr[Double] = js.undefined
  var video_url: String
  var video_width: js.UndefOr[Double] = js.undefined
}

object InlineQueryResultVideo {
  @scala.inline
  def apply(
    id: String,
    mime_type: String,
    thumb_url: String,
    title: String,
    `type`: video,
    video_url: String,
    caption: String = null,
    description: String = null,
    input_message_content: InputMessageContent = null,
    reply_markup: InlineKeyboardMarkup = null,
    video_duration: Int | Double = null,
    video_height: Int | Double = null,
    video_width: Int | Double = null
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

