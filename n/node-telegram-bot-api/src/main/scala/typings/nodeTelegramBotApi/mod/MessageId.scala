package typings.nodeTelegramBotApi.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MessageId extends StObject {
  
  var message_id: Double
}
object MessageId {
  
  inline def apply(message_id: Double): MessageId = {
    val __obj = js.Dynamic.literal(message_id = message_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[MessageId]
  }
  
  extension [Self <: MessageId](x: Self) {
    
    inline def setMessage_id(value: Double): Self = StObject.set(x, "message_id", value.asInstanceOf[js.Any])
  }
}
