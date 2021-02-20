package typings.nodeTelegramBotApi.mod

import typings.nodeTelegramBotApi.nodeTelegramBotApiStrings.contact
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InlineQueryResultContact
  extends InlineQueryResultBase
     with InlineQueryResult {
  
  var first_name: String = js.native
  
  var input_message_content: js.UndefOr[InputMessageContent] = js.native
  
  var last_name: js.UndefOr[String] = js.native
  
  var phone_number: String = js.native
  
  var thumb_height: js.UndefOr[Double] = js.native
  
  var thumb_url: js.UndefOr[String] = js.native
  
  var thumb_width: js.UndefOr[Double] = js.native
  
  var `type`: contact = js.native
}
object InlineQueryResultContact {
  
  @scala.inline
  def apply(first_name: String, id: String, phone_number: String, `type`: contact): InlineQueryResultContact = {
    val __obj = js.Dynamic.literal(first_name = first_name.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], phone_number = phone_number.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[InlineQueryResultContact]
  }
  
  @scala.inline
  implicit class InlineQueryResultContactMutableBuilder[Self <: InlineQueryResultContact] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFirst_name(value: String): Self = StObject.set(x, "first_name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInput_message_content(value: InputMessageContent): Self = StObject.set(x, "input_message_content", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInput_message_contentUndefined: Self = StObject.set(x, "input_message_content", js.undefined)
    
    @scala.inline
    def setLast_name(value: String): Self = StObject.set(x, "last_name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLast_nameUndefined: Self = StObject.set(x, "last_name", js.undefined)
    
    @scala.inline
    def setPhone_number(value: String): Self = StObject.set(x, "phone_number", value.asInstanceOf[js.Any])
    
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
    def setType(value: contact): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
