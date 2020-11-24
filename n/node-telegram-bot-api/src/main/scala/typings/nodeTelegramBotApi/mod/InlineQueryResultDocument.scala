package typings.nodeTelegramBotApi.mod

import typings.nodeTelegramBotApi.nodeTelegramBotApiStrings.document
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InlineQueryResultDocument
  extends InlineQueryResultBase
     with InlineQueryResult {
  
  var caption: js.UndefOr[String] = js.native
  
  var description: js.UndefOr[String] = js.native
  
  var document_url: String = js.native
  
  var input_message_content: js.UndefOr[InputMessageContent] = js.native
  
  var mime_type: String = js.native
  
  var thumb_height: js.UndefOr[Double] = js.native
  
  var thumb_url: js.UndefOr[String] = js.native
  
  var thumb_width: js.UndefOr[Double] = js.native
  
  var title: String = js.native
  
  var `type`: document = js.native
}
object InlineQueryResultDocument {
  
  @scala.inline
  def apply(document_url: String, id: String, mime_type: String, title: String, `type`: document): InlineQueryResultDocument = {
    val __obj = js.Dynamic.literal(document_url = document_url.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], mime_type = mime_type.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[InlineQueryResultDocument]
  }
  
  @scala.inline
  implicit class InlineQueryResultDocumentOps[Self <: InlineQueryResultDocument] (val x: Self) extends AnyVal {
    
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
    def setDocument_url(value: String): Self = this.set("document_url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMime_type(value: String): Self = this.set("mime_type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: document): Self = this.set("type", value.asInstanceOf[js.Any])
    
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
  }
}
