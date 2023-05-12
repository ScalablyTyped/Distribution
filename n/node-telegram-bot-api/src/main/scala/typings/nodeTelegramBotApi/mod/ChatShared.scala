package typings.nodeTelegramBotApi.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ChatShared extends StObject {
  
  var chat_id: Double
  
  var request_id: Double
}
object ChatShared {
  
  inline def apply(chat_id: Double, request_id: Double): ChatShared = {
    val __obj = js.Dynamic.literal(chat_id = chat_id.asInstanceOf[js.Any], request_id = request_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChatShared]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ChatShared] (val x: Self) extends AnyVal {
    
    inline def setChat_id(value: Double): Self = StObject.set(x, "chat_id", value.asInstanceOf[js.Any])
    
    inline def setRequest_id(value: Double): Self = StObject.set(x, "request_id", value.asInstanceOf[js.Any])
  }
}
