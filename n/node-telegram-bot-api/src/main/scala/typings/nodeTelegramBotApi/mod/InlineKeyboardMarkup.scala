package typings.nodeTelegramBotApi.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InlineKeyboardMarkup extends StObject {
  
  var inline_keyboard: js.Array[js.Array[InlineKeyboardButton]]
}
object InlineKeyboardMarkup {
  
  inline def apply(inline_keyboard: js.Array[js.Array[InlineKeyboardButton]]): InlineKeyboardMarkup = {
    val __obj = js.Dynamic.literal(inline_keyboard = inline_keyboard.asInstanceOf[js.Any])
    __obj.asInstanceOf[InlineKeyboardMarkup]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: InlineKeyboardMarkup] (val x: Self) extends AnyVal {
    
    inline def setInline_keyboard(value: js.Array[js.Array[InlineKeyboardButton]]): Self = StObject.set(x, "inline_keyboard", value.asInstanceOf[js.Any])
    
    inline def setInline_keyboardVarargs(value: js.Array[InlineKeyboardButton]*): Self = StObject.set(x, "inline_keyboard", js.Array(value*))
  }
}
