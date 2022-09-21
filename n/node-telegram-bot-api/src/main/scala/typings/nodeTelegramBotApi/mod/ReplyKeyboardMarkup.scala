package typings.nodeTelegramBotApi.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReplyKeyboardMarkup extends StObject {
  
  var keyboard: js.Array[js.Array[KeyboardButton]]
  
  var one_time_keyboard: js.UndefOr[Boolean] = js.undefined
  
  var resize_keyboard: js.UndefOr[Boolean] = js.undefined
  
  var selective: js.UndefOr[Boolean] = js.undefined
}
object ReplyKeyboardMarkup {
  
  inline def apply(keyboard: js.Array[js.Array[KeyboardButton]]): ReplyKeyboardMarkup = {
    val __obj = js.Dynamic.literal(keyboard = keyboard.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReplyKeyboardMarkup]
  }
  
  extension [Self <: ReplyKeyboardMarkup](x: Self) {
    
    inline def setKeyboard(value: js.Array[js.Array[KeyboardButton]]): Self = StObject.set(x, "keyboard", value.asInstanceOf[js.Any])
    
    inline def setKeyboardVarargs(value: js.Array[KeyboardButton]*): Self = StObject.set(x, "keyboard", js.Array(value*))
    
    inline def setOne_time_keyboard(value: Boolean): Self = StObject.set(x, "one_time_keyboard", value.asInstanceOf[js.Any])
    
    inline def setOne_time_keyboardUndefined: Self = StObject.set(x, "one_time_keyboard", js.undefined)
    
    inline def setResize_keyboard(value: Boolean): Self = StObject.set(x, "resize_keyboard", value.asInstanceOf[js.Any])
    
    inline def setResize_keyboardUndefined: Self = StObject.set(x, "resize_keyboard", js.undefined)
    
    inline def setSelective(value: Boolean): Self = StObject.set(x, "selective", value.asInstanceOf[js.Any])
    
    inline def setSelectiveUndefined: Self = StObject.set(x, "selective", js.undefined)
  }
}
