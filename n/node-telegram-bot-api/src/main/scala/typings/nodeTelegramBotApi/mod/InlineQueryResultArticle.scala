package typings.nodeTelegramBotApi.mod

import typings.nodeTelegramBotApi.nodeTelegramBotApiStrings.article
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InlineQueryResultArticle
  extends InlineQueryResultBase
     with InlineQueryResult {
  var description: js.UndefOr[String] = js.native
  var hide_url: js.UndefOr[Boolean] = js.native
  var input_message_content: InputMessageContent = js.native
  var thumb_height: js.UndefOr[Double] = js.native
  var thumb_url: js.UndefOr[String] = js.native
  var thumb_width: js.UndefOr[Double] = js.native
  var title: String = js.native
  var `type`: article = js.native
  var url: js.UndefOr[String] = js.native
}

object InlineQueryResultArticle {
  @scala.inline
  def apply(id: String, input_message_content: InputMessageContent, title: String, `type`: article): InlineQueryResultArticle = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], input_message_content = input_message_content.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[InlineQueryResultArticle]
  }
  @scala.inline
  implicit class InlineQueryResultArticleOps[Self <: InlineQueryResultArticle] (val x: Self) extends AnyVal {
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
    def setInput_message_content(value: InputMessageContent): Self = this.set("input_message_content", value.asInstanceOf[js.Any])
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: article): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    @scala.inline
    def setHide_url(value: Boolean): Self = this.set("hide_url", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHide_url: Self = this.set("hide_url", js.undefined)
    @scala.inline
    def setThumb_height(value: Double): Self = this.set("thumb_height", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteThumb_height: Self = this.set("thumb_height", js.undefined)
    @scala.inline
    def setThumb_url(value: String): Self = this.set("thumb_url", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteThumb_url: Self = this.set("thumb_url", js.undefined)
    @scala.inline
    def setThumb_width(value: Double): Self = this.set("thumb_width", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteThumb_width: Self = this.set("thumb_width", js.undefined)
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUrl: Self = this.set("url", js.undefined)
  }
  
}

