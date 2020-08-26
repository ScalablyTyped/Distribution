package typings.nodeTelegramBotApi.mod

import typings.nodeTelegramBotApi.nodeTelegramBotApiStrings.photo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InlineQueryResultPhoto
  extends InlineQueryResultBase
     with InlineQueryResult {
  var caption: js.UndefOr[String] = js.native
  var description: js.UndefOr[String] = js.native
  var input_message_content: js.UndefOr[InputMessageContent] = js.native
  var photo_height: js.UndefOr[Double] = js.native
  var photo_url: String = js.native
  var photo_width: js.UndefOr[Double] = js.native
  var thumb_url: String = js.native
  var title: js.UndefOr[String] = js.native
  var `type`: photo = js.native
}

object InlineQueryResultPhoto {
  @scala.inline
  def apply(id: String, photo_url: String, thumb_url: String, `type`: photo): InlineQueryResultPhoto = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], photo_url = photo_url.asInstanceOf[js.Any], thumb_url = thumb_url.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[InlineQueryResultPhoto]
  }
  @scala.inline
  implicit class InlineQueryResultPhotoOps[Self <: InlineQueryResultPhoto] (val x: Self) extends AnyVal {
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
    def setPhoto_url(value: String): Self = this.set("photo_url", value.asInstanceOf[js.Any])
    @scala.inline
    def setThumb_url(value: String): Self = this.set("thumb_url", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: photo): Self = this.set("type", value.asInstanceOf[js.Any])
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
    def setPhoto_height(value: Double): Self = this.set("photo_height", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePhoto_height: Self = this.set("photo_height", js.undefined)
    @scala.inline
    def setPhoto_width(value: Double): Self = this.set("photo_width", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePhoto_width: Self = this.set("photo_width", js.undefined)
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
  }
  
}

