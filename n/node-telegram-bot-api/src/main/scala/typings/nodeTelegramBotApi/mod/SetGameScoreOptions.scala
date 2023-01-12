package typings.nodeTelegramBotApi.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SetGameScoreOptions extends StObject {
  
  var chat_id: js.UndefOr[Double] = js.undefined
  
  var disable_edit_message: js.UndefOr[Boolean] = js.undefined
  
  var force: js.UndefOr[Boolean] = js.undefined
  
  var inline_message_id: js.UndefOr[String] = js.undefined
  
  var message_id: js.UndefOr[Double] = js.undefined
}
object SetGameScoreOptions {
  
  inline def apply(): SetGameScoreOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SetGameScoreOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SetGameScoreOptions] (val x: Self) extends AnyVal {
    
    inline def setChat_id(value: Double): Self = StObject.set(x, "chat_id", value.asInstanceOf[js.Any])
    
    inline def setChat_idUndefined: Self = StObject.set(x, "chat_id", js.undefined)
    
    inline def setDisable_edit_message(value: Boolean): Self = StObject.set(x, "disable_edit_message", value.asInstanceOf[js.Any])
    
    inline def setDisable_edit_messageUndefined: Self = StObject.set(x, "disable_edit_message", js.undefined)
    
    inline def setForce(value: Boolean): Self = StObject.set(x, "force", value.asInstanceOf[js.Any])
    
    inline def setForceUndefined: Self = StObject.set(x, "force", js.undefined)
    
    inline def setInline_message_id(value: String): Self = StObject.set(x, "inline_message_id", value.asInstanceOf[js.Any])
    
    inline def setInline_message_idUndefined: Self = StObject.set(x, "inline_message_id", js.undefined)
    
    inline def setMessage_id(value: Double): Self = StObject.set(x, "message_id", value.asInstanceOf[js.Any])
    
    inline def setMessage_idUndefined: Self = StObject.set(x, "message_id", js.undefined)
  }
}
