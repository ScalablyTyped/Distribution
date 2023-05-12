package typings.nodeTelegramBotApi.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SendChatActionOptions extends StObject {
  
  var message_thread_id: js.UndefOr[Double] = js.undefined
}
object SendChatActionOptions {
  
  inline def apply(): SendChatActionOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SendChatActionOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SendChatActionOptions] (val x: Self) extends AnyVal {
    
    inline def setMessage_thread_id(value: Double): Self = StObject.set(x, "message_thread_id", value.asInstanceOf[js.Any])
    
    inline def setMessage_thread_idUndefined: Self = StObject.set(x, "message_thread_id", js.undefined)
  }
}
