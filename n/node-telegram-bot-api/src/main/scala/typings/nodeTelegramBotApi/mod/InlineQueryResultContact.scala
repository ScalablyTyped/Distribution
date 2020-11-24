package typings.nodeTelegramBotApi.mod

import typings.nodeTelegramBotApi.nodeTelegramBotApiStrings.contact
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
  implicit class InlineQueryResultContactOps[Self <: InlineQueryResultContact] (val x: Self) extends AnyVal {
    
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
    def setFirst_name(value: String): Self = this.set("first_name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPhone_number(value: String): Self = this.set("phone_number", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: contact): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInput_message_content(value: InputMessageContent): Self = this.set("input_message_content", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInput_message_content: Self = this.set("input_message_content", js.undefined)
    
    @scala.inline
    def setLast_name(value: String): Self = this.set("last_name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLast_name: Self = this.set("last_name", js.undefined)
    
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
