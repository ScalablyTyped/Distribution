package typings.nodeTelegramBotApi.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReplyKeyboardMarkup extends StObject {
  
  var input_field_placeholder: js.UndefOr[String] = js.undefined
  
  var is_persistent: js.UndefOr[Boolean] = js.undefined
  
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
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ReplyKeyboardMarkup] (val x: Self) extends AnyVal {
    
    inline def setInput_field_placeholder(value: String): Self = StObject.set(x, "input_field_placeholder", value.asInstanceOf[js.Any])
    
    inline def setInput_field_placeholderUndefined: Self = StObject.set(x, "input_field_placeholder", js.undefined)
    
    inline def setIs_persistent(value: Boolean): Self = StObject.set(x, "is_persistent", value.asInstanceOf[js.Any])
    
    inline def setIs_persistentUndefined: Self = StObject.set(x, "is_persistent", js.undefined)
    
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
