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
  
  @scala.inline
  def apply(keyboard: js.Array[js.Array[KeyboardButton]]): ReplyKeyboardMarkup = {
    val __obj = js.Dynamic.literal(keyboard = keyboard.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReplyKeyboardMarkup]
  }
  
  @scala.inline
  implicit class ReplyKeyboardMarkupMutableBuilder[Self <: ReplyKeyboardMarkup] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setKeyboard(value: js.Array[js.Array[KeyboardButton]]): Self = StObject.set(x, "keyboard", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyboardVarargs(value: js.Array[KeyboardButton]*): Self = StObject.set(x, "keyboard", js.Array(value :_*))
    
    @scala.inline
    def setOne_time_keyboard(value: Boolean): Self = StObject.set(x, "one_time_keyboard", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOne_time_keyboardUndefined: Self = StObject.set(x, "one_time_keyboard", js.undefined)
    
    @scala.inline
    def setResize_keyboard(value: Boolean): Self = StObject.set(x, "resize_keyboard", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResize_keyboardUndefined: Self = StObject.set(x, "resize_keyboard", js.undefined)
    
    @scala.inline
    def setSelective(value: Boolean): Self = StObject.set(x, "selective", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectiveUndefined: Self = StObject.set(x, "selective", js.undefined)
  }
}
