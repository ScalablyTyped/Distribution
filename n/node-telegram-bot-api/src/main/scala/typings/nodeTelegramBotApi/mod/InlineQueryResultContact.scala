package typings.nodeTelegramBotApi.mod

import typings.nodeTelegramBotApi.nodeTelegramBotApiStrings.contact
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InlineQueryResultContact
  extends StObject
     with InlineQueryResultBase
     with InlineQueryResult {
  
  var first_name: String
  
  var input_message_content: js.UndefOr[InputMessageContent] = js.undefined
  
  var last_name: js.UndefOr[String] = js.undefined
  
  var phone_number: String
  
  var thumb_height: js.UndefOr[Double] = js.undefined
  
  var thumb_url: js.UndefOr[String] = js.undefined
  
  var thumb_width: js.UndefOr[Double] = js.undefined
  
  var `type`: contact
}
object InlineQueryResultContact {
  
  inline def apply(first_name: String, id: String, phone_number: String): InlineQueryResultContact = {
    val __obj = js.Dynamic.literal(first_name = first_name.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], phone_number = phone_number.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("contact")
    __obj.asInstanceOf[InlineQueryResultContact]
  }
  
  extension [Self <: InlineQueryResultContact](x: Self) {
    
    inline def setFirst_name(value: String): Self = StObject.set(x, "first_name", value.asInstanceOf[js.Any])
    
    inline def setInput_message_content(value: InputMessageContent): Self = StObject.set(x, "input_message_content", value.asInstanceOf[js.Any])
    
    inline def setInput_message_contentUndefined: Self = StObject.set(x, "input_message_content", js.undefined)
    
    inline def setLast_name(value: String): Self = StObject.set(x, "last_name", value.asInstanceOf[js.Any])
    
    inline def setLast_nameUndefined: Self = StObject.set(x, "last_name", js.undefined)
    
    inline def setPhone_number(value: String): Self = StObject.set(x, "phone_number", value.asInstanceOf[js.Any])
    
    inline def setThumb_height(value: Double): Self = StObject.set(x, "thumb_height", value.asInstanceOf[js.Any])
    
    inline def setThumb_heightUndefined: Self = StObject.set(x, "thumb_height", js.undefined)
    
    inline def setThumb_url(value: String): Self = StObject.set(x, "thumb_url", value.asInstanceOf[js.Any])
    
    inline def setThumb_urlUndefined: Self = StObject.set(x, "thumb_url", js.undefined)
    
    inline def setThumb_width(value: Double): Self = StObject.set(x, "thumb_width", value.asInstanceOf[js.Any])
    
    inline def setThumb_widthUndefined: Self = StObject.set(x, "thumb_width", js.undefined)
    
    inline def setType(value: contact): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
