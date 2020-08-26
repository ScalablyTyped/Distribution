package typings.nodeTelegramBotApi.mod

import typings.nodeTelegramBotApi.nodeTelegramBotApiStrings.video
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InlineQueryResultVideo
  extends InlineQueryResultBase
     with InlineQueryResult {
  var caption: js.UndefOr[String] = js.native
  var description: js.UndefOr[String] = js.native
  var input_message_content: js.UndefOr[InputMessageContent] = js.native
  var mime_type: String = js.native
  var thumb_url: String = js.native
  var title: String = js.native
  var `type`: video = js.native
  var video_duration: js.UndefOr[Double] = js.native
  var video_height: js.UndefOr[Double] = js.native
  var video_url: String = js.native
  var video_width: js.UndefOr[Double] = js.native
}

object InlineQueryResultVideo {
  @scala.inline
  def apply(id: String, mime_type: String, thumb_url: String, title: String, `type`: video, video_url: String): InlineQueryResultVideo = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], mime_type = mime_type.asInstanceOf[js.Any], thumb_url = thumb_url.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], video_url = video_url.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[InlineQueryResultVideo]
  }
  @scala.inline
  implicit class InlineQueryResultVideoOps[Self <: InlineQueryResultVideo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setMime_type(value: String): Self = this.set("mime_type", value.asInstanceOf[js.Any])
    @scala.inline
    def setThumb_url(value: String): Self = this.set("thumb_url", value.asInstanceOf[js.Any])
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: video): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def setVideo_url(value: String): Self = this.set("video_url", value.asInstanceOf[js.Any])
    @scala.inline
    def setCaption(value: String): Self = this.set("caption", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCaption: Self = this.set("caption", js.undefined)
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    @scala.inline
    def setInput_message_content(value: InputMessageContent): Self = this.set("input_message_content", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInput_message_content: Self = this.set("input_message_content", js.undefined)
    @scala.inline
    def setVideo_duration(value: Double): Self = this.set("video_duration", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVideo_duration: Self = this.set("video_duration", js.undefined)
    @scala.inline
    def setVideo_height(value: Double): Self = this.set("video_height", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVideo_height: Self = this.set("video_height", js.undefined)
    @scala.inline
    def setVideo_width(value: Double): Self = this.set("video_width", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVideo_width: Self = this.set("video_width", js.undefined)
  }
  
}

