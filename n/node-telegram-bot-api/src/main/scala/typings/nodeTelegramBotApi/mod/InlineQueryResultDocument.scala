package typings.nodeTelegramBotApi.mod

import typings.nodeTelegramBotApi.nodeTelegramBotApiStrings.document
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InlineQueryResultDocument
  extends StObject
     with InlineQueryResultBase
     with InlineQueryResult {
  
  var caption: js.UndefOr[String] = js.undefined
  
  var description: js.UndefOr[String] = js.undefined
  
  var document_url: String
  
  var input_message_content: js.UndefOr[InputMessageContent] = js.undefined
  
  var mime_type: String
  
  var thumb_height: js.UndefOr[Double] = js.undefined
  
  var thumb_url: js.UndefOr[String] = js.undefined
  
  var thumb_width: js.UndefOr[Double] = js.undefined
  
  var title: String
  
  var `type`: document
}
object InlineQueryResultDocument {
  
  @scala.inline
  def apply(document_url: String, id: String, mime_type: String, title: String): InlineQueryResultDocument = {
    val __obj = js.Dynamic.literal(document_url = document_url.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], mime_type = mime_type.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("document")
    __obj.asInstanceOf[InlineQueryResultDocument]
  }
  
  @scala.inline
  implicit class InlineQueryResultDocumentMutableBuilder[Self <: InlineQueryResultDocument] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCaption(value: String): Self = StObject.set(x, "caption", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCaptionUndefined: Self = StObject.set(x, "caption", js.undefined)
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    @scala.inline
    def setDocument_url(value: String): Self = StObject.set(x, "document_url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInput_message_content(value: InputMessageContent): Self = StObject.set(x, "input_message_content", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInput_message_contentUndefined: Self = StObject.set(x, "input_message_content", js.undefined)
    
    @scala.inline
    def setMime_type(value: String): Self = StObject.set(x, "mime_type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThumb_height(value: Double): Self = StObject.set(x, "thumb_height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThumb_heightUndefined: Self = StObject.set(x, "thumb_height", js.undefined)
    
    @scala.inline
    def setThumb_url(value: String): Self = StObject.set(x, "thumb_url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThumb_urlUndefined: Self = StObject.set(x, "thumb_url", js.undefined)
    
    @scala.inline
    def setThumb_width(value: Double): Self = StObject.set(x, "thumb_width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThumb_widthUndefined: Self = StObject.set(x, "thumb_width", js.undefined)
    
    @scala.inline
    def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: document): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
