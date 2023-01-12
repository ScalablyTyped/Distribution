package typings.nodeTelegramBotApi.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StopPollOptions extends StObject {
  
  var reply_markup: js.UndefOr[InlineKeyboardMarkup] = js.undefined
}
object StopPollOptions {
  
  inline def apply(): StopPollOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StopPollOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: StopPollOptions] (val x: Self) extends AnyVal {
    
    inline def setReply_markup(value: InlineKeyboardMarkup): Self = StObject.set(x, "reply_markup", value.asInstanceOf[js.Any])
    
    inline def setReply_markupUndefined: Self = StObject.set(x, "reply_markup", js.undefined)
  }
}
