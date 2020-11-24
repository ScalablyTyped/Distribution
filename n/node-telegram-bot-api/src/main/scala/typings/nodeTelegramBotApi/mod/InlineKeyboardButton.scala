package typings.nodeTelegramBotApi.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InlineKeyboardButton extends js.Object {
  
  var callback_data: js.UndefOr[String] = js.native
  
  var callback_game: js.UndefOr[CallbackGame] = js.native
  
  var login_url: js.UndefOr[LoginUrl] = js.native
  
  var pay: js.UndefOr[Boolean] = js.native
  
  var switch_inline_query: js.UndefOr[String] = js.native
  
  var switch_inline_query_current_chat: js.UndefOr[String] = js.native
  
  var text: String = js.native
  
  var url: js.UndefOr[String] = js.native
}
object InlineKeyboardButton {
  
  @scala.inline
  def apply(text: String): InlineKeyboardButton = {
    val __obj = js.Dynamic.literal(text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[InlineKeyboardButton]
  }
  
  @scala.inline
  implicit class InlineKeyboardButtonOps[Self <: InlineKeyboardButton] (val x: Self) extends AnyVal {
    
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
    def setText(value: String): Self = this.set("text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCallback_data(value: String): Self = this.set("callback_data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCallback_data: Self = this.set("callback_data", js.undefined)
    
    @scala.inline
    def setCallback_game(value: CallbackGame): Self = this.set("callback_game", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCallback_game: Self = this.set("callback_game", js.undefined)
    
    @scala.inline
    def setLogin_url(value: LoginUrl): Self = this.set("login_url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLogin_url: Self = this.set("login_url", js.undefined)
    
    @scala.inline
    def setPay(value: Boolean): Self = this.set("pay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePay: Self = this.set("pay", js.undefined)
    
    @scala.inline
    def setSwitch_inline_query(value: String): Self = this.set("switch_inline_query", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSwitch_inline_query: Self = this.set("switch_inline_query", js.undefined)
    
    @scala.inline
    def setSwitch_inline_query_current_chat(value: String): Self = this.set("switch_inline_query_current_chat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSwitch_inline_query_current_chat: Self = this.set("switch_inline_query_current_chat", js.undefined)
    
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUrl: Self = this.set("url", js.undefined)
  }
}
