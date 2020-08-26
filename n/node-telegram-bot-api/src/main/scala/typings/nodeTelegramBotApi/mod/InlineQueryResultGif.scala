package typings.nodeTelegramBotApi.mod

import typings.nodeTelegramBotApi.nodeTelegramBotApiStrings.gif
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InlineQueryResultGif
  extends InlineQueryResultBase
     with InlineQueryResult {
  var caption: js.UndefOr[String] = js.native
  var gif_duration: js.UndefOr[Double] = js.native
  var gif_height: js.UndefOr[Double] = js.native
  var gif_url: String = js.native
  var gif_width: js.UndefOr[Double] = js.native
  var input_message_content: js.UndefOr[InputMessageContent] = js.native
  var thumb_url: js.UndefOr[String] = js.native
  var title: js.UndefOr[String] = js.native
  var `type`: gif = js.native
}

object InlineQueryResultGif {
  @scala.inline
  def apply(gif_url: String, id: String, `type`: gif): InlineQueryResultGif = {
    val __obj = js.Dynamic.literal(gif_url = gif_url.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[InlineQueryResultGif]
  }
  @scala.inline
  implicit class InlineQueryResultGifOps[Self <: InlineQueryResultGif] (val x: Self) extends AnyVal {
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
    def setGif_url(value: String): Self = this.set("gif_url", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: gif): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def setCaption(value: String): Self = this.set("caption", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCaption: Self = this.set("caption", js.undefined)
    @scala.inline
    def setGif_duration(value: Double): Self = this.set("gif_duration", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGif_duration: Self = this.set("gif_duration", js.undefined)
    @scala.inline
    def setGif_height(value: Double): Self = this.set("gif_height", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGif_height: Self = this.set("gif_height", js.undefined)
    @scala.inline
    def setGif_width(value: Double): Self = this.set("gif_width", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGif_width: Self = this.set("gif_width", js.undefined)
    @scala.inline
    def setInput_message_content(value: InputMessageContent): Self = this.set("input_message_content", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInput_message_content: Self = this.set("input_message_content", js.undefined)
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

