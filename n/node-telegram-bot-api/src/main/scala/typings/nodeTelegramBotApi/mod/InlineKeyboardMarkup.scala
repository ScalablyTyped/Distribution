package typings.nodeTelegramBotApi.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InlineKeyboardMarkup extends StObject {
  
  var inline_keyboard: js.Array[js.Array[InlineKeyboardButton]]
}
object InlineKeyboardMarkup {
  
  @scala.inline
  def apply(inline_keyboard: js.Array[js.Array[InlineKeyboardButton]]): InlineKeyboardMarkup = {
    val __obj = js.Dynamic.literal(inline_keyboard = inline_keyboard.asInstanceOf[js.Any])
    __obj.asInstanceOf[InlineKeyboardMarkup]
  }
  
  @scala.inline
  implicit class InlineKeyboardMarkupMutableBuilder[Self <: InlineKeyboardMarkup] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInline_keyboard(value: js.Array[js.Array[InlineKeyboardButton]]): Self = StObject.set(x, "inline_keyboard", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInline_keyboardVarargs(value: js.Array[InlineKeyboardButton]*): Self = StObject.set(x, "inline_keyboard", js.Array(value :_*))
  }
}
