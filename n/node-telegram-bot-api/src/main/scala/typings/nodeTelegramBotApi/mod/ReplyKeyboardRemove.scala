package typings.nodeTelegramBotApi.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReplyKeyboardRemove extends StObject {
  
  var remove_keyboard: Boolean
  
  var selective: js.UndefOr[Boolean] = js.undefined
}
object ReplyKeyboardRemove {
  
  inline def apply(remove_keyboard: Boolean): ReplyKeyboardRemove = {
    val __obj = js.Dynamic.literal(remove_keyboard = remove_keyboard.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReplyKeyboardRemove]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ReplyKeyboardRemove] (val x: Self) extends AnyVal {
    
    inline def setRemove_keyboard(value: Boolean): Self = StObject.set(x, "remove_keyboard", value.asInstanceOf[js.Any])
    
    inline def setSelective(value: Boolean): Self = StObject.set(x, "selective", value.asInstanceOf[js.Any])
    
    inline def setSelectiveUndefined: Self = StObject.set(x, "selective", js.undefined)
  }
}
