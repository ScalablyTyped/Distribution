package typings.nodeTelegramBotApi.mod

import typings.nodeTelegramBotApi.nodeTelegramBotApiStrings.article
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InlineQueryResultArticle
  extends StObject
     with InlineQueryResultBase
     with InlineQueryResult {
  
  var description: js.UndefOr[String] = js.undefined
  
  var hide_url: js.UndefOr[Boolean] = js.undefined
  
  var input_message_content: InputMessageContent
  
  var thumb_height: js.UndefOr[Double] = js.undefined
  
  var thumb_url: js.UndefOr[String] = js.undefined
  
  var thumb_width: js.UndefOr[Double] = js.undefined
  
  var title: String
  
  var `type`: article
  
  var url: js.UndefOr[String] = js.undefined
}
object InlineQueryResultArticle {
  
  inline def apply(id: String, input_message_content: InputMessageContent, title: String): InlineQueryResultArticle = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], input_message_content = input_message_content.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("article")
    __obj.asInstanceOf[InlineQueryResultArticle]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: InlineQueryResultArticle] (val x: Self) extends AnyVal {
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setHide_url(value: Boolean): Self = StObject.set(x, "hide_url", value.asInstanceOf[js.Any])
    
    inline def setHide_urlUndefined: Self = StObject.set(x, "hide_url", js.undefined)
    
    inline def setInput_message_content(value: InputMessageContent): Self = StObject.set(x, "input_message_content", value.asInstanceOf[js.Any])
    
    inline def setThumb_height(value: Double): Self = StObject.set(x, "thumb_height", value.asInstanceOf[js.Any])
    
    inline def setThumb_heightUndefined: Self = StObject.set(x, "thumb_height", js.undefined)
    
    inline def setThumb_url(value: String): Self = StObject.set(x, "thumb_url", value.asInstanceOf[js.Any])
    
    inline def setThumb_urlUndefined: Self = StObject.set(x, "thumb_url", js.undefined)
    
    inline def setThumb_width(value: Double): Self = StObject.set(x, "thumb_width", value.asInstanceOf[js.Any])
    
    inline def setThumb_widthUndefined: Self = StObject.set(x, "thumb_width", js.undefined)
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setType(value: article): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
  }
}
