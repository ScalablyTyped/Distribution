package typings.nodeTelegramBotApi.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InlineKeyboardButton extends StObject {
  
  var callback_data: js.UndefOr[String] = js.undefined
  
  var callback_game: js.UndefOr[CallbackGame] = js.undefined
  
  var login_url: js.UndefOr[LoginUrl] = js.undefined
  
  var pay: js.UndefOr[Boolean] = js.undefined
  
  var switch_inline_query: js.UndefOr[String] = js.undefined
  
  var switch_inline_query_current_chat: js.UndefOr[String] = js.undefined
  
  var text: String
  
  var url: js.UndefOr[String] = js.undefined
  
  var web_app: js.UndefOr[WebAppInfo] = js.undefined
}
object InlineKeyboardButton {
  
  inline def apply(text: String): InlineKeyboardButton = {
    val __obj = js.Dynamic.literal(text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[InlineKeyboardButton]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: InlineKeyboardButton] (val x: Self) extends AnyVal {
    
    inline def setCallback_data(value: String): Self = StObject.set(x, "callback_data", value.asInstanceOf[js.Any])
    
    inline def setCallback_dataUndefined: Self = StObject.set(x, "callback_data", js.undefined)
    
    inline def setCallback_game(value: CallbackGame): Self = StObject.set(x, "callback_game", value.asInstanceOf[js.Any])
    
    inline def setCallback_gameUndefined: Self = StObject.set(x, "callback_game", js.undefined)
    
    inline def setLogin_url(value: LoginUrl): Self = StObject.set(x, "login_url", value.asInstanceOf[js.Any])
    
    inline def setLogin_urlUndefined: Self = StObject.set(x, "login_url", js.undefined)
    
    inline def setPay(value: Boolean): Self = StObject.set(x, "pay", value.asInstanceOf[js.Any])
    
    inline def setPayUndefined: Self = StObject.set(x, "pay", js.undefined)
    
    inline def setSwitch_inline_query(value: String): Self = StObject.set(x, "switch_inline_query", value.asInstanceOf[js.Any])
    
    inline def setSwitch_inline_queryUndefined: Self = StObject.set(x, "switch_inline_query", js.undefined)
    
    inline def setSwitch_inline_query_current_chat(value: String): Self = StObject.set(x, "switch_inline_query_current_chat", value.asInstanceOf[js.Any])
    
    inline def setSwitch_inline_query_current_chatUndefined: Self = StObject.set(x, "switch_inline_query_current_chat", js.undefined)
    
    inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
    
    inline def setWeb_app(value: WebAppInfo): Self = StObject.set(x, "web_app", value.asInstanceOf[js.Any])
    
    inline def setWeb_appUndefined: Self = StObject.set(x, "web_app", js.undefined)
  }
}
