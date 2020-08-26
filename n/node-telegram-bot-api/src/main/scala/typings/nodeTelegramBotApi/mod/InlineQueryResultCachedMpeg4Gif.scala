package typings.nodeTelegramBotApi.mod

import typings.nodeTelegramBotApi.nodeTelegramBotApiStrings.mpeg4_gif
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InlineQueryResultCachedMpeg4Gif
  extends InlineQueryResultBase
     with InlineQueryResult {
  var caption: js.UndefOr[String] = js.native
  var input_message_content: js.UndefOr[InputMessageContent] = js.native
  var mpeg4_file_id: String = js.native
  var title: js.UndefOr[String] = js.native
  var `type`: mpeg4_gif = js.native
}

object InlineQueryResultCachedMpeg4Gif {
  @scala.inline
  def apply(id: String, mpeg4_file_id: String, `type`: mpeg4_gif): InlineQueryResultCachedMpeg4Gif = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], mpeg4_file_id = mpeg4_file_id.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[InlineQueryResultCachedMpeg4Gif]
  }
  @scala.inline
  implicit class InlineQueryResultCachedMpeg4GifOps[Self <: InlineQueryResultCachedMpeg4Gif] (val x: Self) extends AnyVal {
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
    def setMpeg4_file_id(value: String): Self = this.set("mpeg4_file_id", value.asInstanceOf[js.Any])
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
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
  }
  
}

