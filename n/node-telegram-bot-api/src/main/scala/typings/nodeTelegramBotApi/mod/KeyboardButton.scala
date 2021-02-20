package typings.nodeTelegramBotApi.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait KeyboardButton extends StObject {
  
  var request_contact: js.UndefOr[Boolean] = js.native
  
  var request_location: js.UndefOr[Boolean] = js.native
  
  var text: String = js.native
}
object KeyboardButton {
  
  @scala.inline
  def apply(text: String): KeyboardButton = {
    val __obj = js.Dynamic.literal(text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[KeyboardButton]
  }
  
  @scala.inline
  implicit class KeyboardButtonMutableBuilder[Self <: KeyboardButton] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRequest_contact(value: Boolean): Self = StObject.set(x, "request_contact", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest_contactUndefined: Self = StObject.set(x, "request_contact", js.undefined)
    
    @scala.inline
    def setRequest_location(value: Boolean): Self = StObject.set(x, "request_location", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest_locationUndefined: Self = StObject.set(x, "request_location", js.undefined)
    
    @scala.inline
    def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
  }
}
