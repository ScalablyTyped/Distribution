package typings.nodeTelegramBotApi.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait KeyboardButton extends StObject {
  
  var request_chat: js.UndefOr[KeyboardButtonRequestChat] = js.undefined
  
  var request_contact: js.UndefOr[Boolean] = js.undefined
  
  var request_location: js.UndefOr[Boolean] = js.undefined
  
  var request_poll: js.UndefOr[KeyboardButtonPollType] = js.undefined
  
  var request_user: js.UndefOr[KeyboardButtonRequestUser] = js.undefined
  
  var text: String
  
  var web_app: js.UndefOr[WebAppInfo] = js.undefined
}
object KeyboardButton {
  
  inline def apply(text: String): KeyboardButton = {
    val __obj = js.Dynamic.literal(text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[KeyboardButton]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: KeyboardButton] (val x: Self) extends AnyVal {
    
    inline def setRequest_chat(value: KeyboardButtonRequestChat): Self = StObject.set(x, "request_chat", value.asInstanceOf[js.Any])
    
    inline def setRequest_chatUndefined: Self = StObject.set(x, "request_chat", js.undefined)
    
    inline def setRequest_contact(value: Boolean): Self = StObject.set(x, "request_contact", value.asInstanceOf[js.Any])
    
    inline def setRequest_contactUndefined: Self = StObject.set(x, "request_contact", js.undefined)
    
    inline def setRequest_location(value: Boolean): Self = StObject.set(x, "request_location", value.asInstanceOf[js.Any])
    
    inline def setRequest_locationUndefined: Self = StObject.set(x, "request_location", js.undefined)
    
    inline def setRequest_poll(value: KeyboardButtonPollType): Self = StObject.set(x, "request_poll", value.asInstanceOf[js.Any])
    
    inline def setRequest_pollUndefined: Self = StObject.set(x, "request_poll", js.undefined)
    
    inline def setRequest_user(value: KeyboardButtonRequestUser): Self = StObject.set(x, "request_user", value.asInstanceOf[js.Any])
    
    inline def setRequest_userUndefined: Self = StObject.set(x, "request_user", js.undefined)
    
    inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    inline def setWeb_app(value: WebAppInfo): Self = StObject.set(x, "web_app", value.asInstanceOf[js.Any])
    
    inline def setWeb_appUndefined: Self = StObject.set(x, "web_app", js.undefined)
  }
}
