package typings.nodeTelegramBotApi.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetGameHighScoresOptions extends StObject {
  
  var chat_id: js.UndefOr[Double] = js.undefined
  
  var inline_message_id: js.UndefOr[String] = js.undefined
  
  var message_id: js.UndefOr[Double] = js.undefined
}
object GetGameHighScoresOptions {
  
  inline def apply(): GetGameHighScoresOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetGameHighScoresOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetGameHighScoresOptions] (val x: Self) extends AnyVal {
    
    inline def setChat_id(value: Double): Self = StObject.set(x, "chat_id", value.asInstanceOf[js.Any])
    
    inline def setChat_idUndefined: Self = StObject.set(x, "chat_id", js.undefined)
    
    inline def setInline_message_id(value: String): Self = StObject.set(x, "inline_message_id", value.asInstanceOf[js.Any])
    
    inline def setInline_message_idUndefined: Self = StObject.set(x, "inline_message_id", js.undefined)
    
    inline def setMessage_id(value: Double): Self = StObject.set(x, "message_id", value.asInstanceOf[js.Any])
    
    inline def setMessage_idUndefined: Self = StObject.set(x, "message_id", js.undefined)
  }
}
