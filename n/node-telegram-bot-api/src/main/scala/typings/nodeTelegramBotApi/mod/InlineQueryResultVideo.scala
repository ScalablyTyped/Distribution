package typings.nodeTelegramBotApi.mod

import typings.nodeTelegramBotApi.nodeTelegramBotApiStrings.video
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
    video_duration: js.UndefOr[Double] = js.undefined,
    video_height: js.UndefOr[Double] = js.undefined,
    video_width: js.UndefOr[Double] = js.undefined
  ): InlineQueryResultVideo = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], mime_type = mime_type.asInstanceOf[js.Any], thumb_url = thumb_url.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], video_url = video_url.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (caption != null) __obj.updateDynamic("caption")(caption.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (input_message_content != null) __obj.updateDynamic("input_message_content")(input_message_content.asInstanceOf[js.Any])
    if (reply_markup != null) __obj.updateDynamic("reply_markup")(reply_markup.asInstanceOf[js.Any])
    if (!js.isUndefined(video_duration)) __obj.updateDynamic("video_duration")(video_duration.get.asInstanceOf[js.Any])
    if (!js.isUndefined(video_height)) __obj.updateDynamic("video_height")(video_height.get.asInstanceOf[js.Any])
    if (!js.isUndefined(video_width)) __obj.updateDynamic("video_width")(video_width.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[InlineQueryResultVideo]
  }
}

