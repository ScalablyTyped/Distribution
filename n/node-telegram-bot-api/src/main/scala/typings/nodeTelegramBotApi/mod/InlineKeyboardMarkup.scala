package typings.nodeTelegramBotApi.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InlineKeyboardMarkup extends js.Object {
  
  var inline_keyboard: js.Array[js.Array[InlineKeyboardButton]] = js.native
}
object InlineKeyboardMarkup {
  
  @scala.inline
  def apply(inline_keyboard: js.Array[js.Array[InlineKeyboardButton]]): InlineKeyboardMarkup = {
    val __obj = js.Dynamic.literal(inline_keyboard = inline_keyboard.asInstanceOf[js.Any])
    __obj.asInstanceOf[InlineKeyboardMarkup]
  }
  
  @scala.inline
  implicit class InlineKeyboardMarkupOps[Self <: InlineKeyboardMarkup] (val x: Self) extends AnyVal {
    
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
    def setInline_keyboardVarargs(value: js.Array[InlineKeyboardButton]*): Self = this.set("inline_keyboard", js.Array(value :_*))
    
    @scala.inline
    def setInline_keyboard(value: js.Array[js.Array[InlineKeyboardButton]]): Self = this.set("inline_keyboard", value.asInstanceOf[js.Any])
  }
}
