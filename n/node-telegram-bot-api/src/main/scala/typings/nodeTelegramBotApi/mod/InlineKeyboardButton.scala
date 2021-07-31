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
}
object InlineKeyboardButton {
  
  @scala.inline
  def apply(text: String): InlineKeyboardButton = {
    val __obj = js.Dynamic.literal(text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[InlineKeyboardButton]
  }
  
  @scala.inline
  implicit class InlineKeyboardButtonMutableBuilder[Self <: InlineKeyboardButton] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCallback_data(value: String): Self = StObject.set(x, "callback_data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCallback_dataUndefined: Self = StObject.set(x, "callback_data", js.undefined)
    
    @scala.inline
    def setCallback_game(value: CallbackGame): Self = StObject.set(x, "callback_game", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCallback_gameUndefined: Self = StObject.set(x, "callback_game", js.undefined)
    
    @scala.inline
    def setLogin_url(value: LoginUrl): Self = StObject.set(x, "login_url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLogin_urlUndefined: Self = StObject.set(x, "login_url", js.undefined)
    
    @scala.inline
    def setPay(value: Boolean): Self = StObject.set(x, "pay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPayUndefined: Self = StObject.set(x, "pay", js.undefined)
    
    @scala.inline
    def setSwitch_inline_query(value: String): Self = StObject.set(x, "switch_inline_query", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSwitch_inline_queryUndefined: Self = StObject.set(x, "switch_inline_query", js.undefined)
    
    @scala.inline
    def setSwitch_inline_query_current_chat(value: String): Self = StObject.set(x, "switch_inline_query_current_chat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSwitch_inline_query_current_chatUndefined: Self = StObject.set(x, "switch_inline_query_current_chat", js.undefined)
    
    @scala.inline
    def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
  }
}
