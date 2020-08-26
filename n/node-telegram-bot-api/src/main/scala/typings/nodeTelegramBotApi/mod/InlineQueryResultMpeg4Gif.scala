package typings.nodeTelegramBotApi.mod

import typings.nodeTelegramBotApi.nodeTelegramBotApiStrings.mpeg4_gif
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InlineQueryResultMpeg4Gif
  extends InlineQueryResultBase
     with InlineQueryResult {
  var caption: js.UndefOr[String] = js.native
  var input_message_content: js.UndefOr[InputMessageContent] = js.native
  var mpeg4_duration: js.UndefOr[Double] = js.native
  var mpeg4_height: js.UndefOr[Double] = js.native
  var mpeg4_url: String = js.native
  var mpeg4_width: js.UndefOr[Double] = js.native
  var thumb_url: js.UndefOr[String] = js.native
  var title: js.UndefOr[String] = js.native
  var `type`: mpeg4_gif = js.native
}

object InlineQueryResultMpeg4Gif {
  @scala.inline
  def apply(id: String, mpeg4_url: String, `type`: mpeg4_gif): InlineQueryResultMpeg4Gif = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], mpeg4_url = mpeg4_url.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[InlineQueryResultMpeg4Gif]
  }
  @scala.inline
  implicit class InlineQueryResultMpeg4GifOps[Self <: InlineQueryResultMpeg4Gif] (val x: Self) extends AnyVal {
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
    def setMpeg4_url(value: String): Self = this.set("mpeg4_url", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: mpeg4_gif): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def setCaption(value: String): Self = this.set("caption", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCaption: Self = this.set("caption", js.undefined)
    @scala.inline
    def setInput_message_content(value: InputMessageContent): Self = this.set("input_message_content", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInput_message_content: Self = this.set("input_message_content", js.undefined)
    @scala.inline
    def setMpeg4_duration(value: Double): Self = this.set("mpeg4_duration", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMpeg4_duration: Self = this.set("mpeg4_duration", js.undefined)
    @scala.inline
    def setMpeg4_height(value: Double): Self = this.set("mpeg4_height", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMpeg4_height: Self = this.set("mpeg4_height", js.undefined)
    @scala.inline
    def setMpeg4_width(value: Double): Self = this.set("mpeg4_width", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMpeg4_width: Self = this.set("mpeg4_width", js.undefined)
    @scala.inline
    def setThumb_url(value: String): Self = this.set("thumb_url", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteThumb_url: Self = this.set("thumb_url", js.undefined)
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
  }
  
}

