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
  
  @scala.inline
  def apply(): GetGameHighScoresOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetGameHighScoresOptions]
  }
  
  @scala.inline
  implicit class GetGameHighScoresOptionsMutableBuilder[Self <: GetGameHighScoresOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChat_id(value: Double): Self = StObject.set(x, "chat_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChat_idUndefined: Self = StObject.set(x, "chat_id", js.undefined)
    
    @scala.inline
    def setInline_message_id(value: String): Self = StObject.set(x, "inline_message_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInline_message_idUndefined: Self = StObject.set(x, "inline_message_id", js.undefined)
    
    @scala.inline
    def setMessage_id(value: Double): Self = StObject.set(x, "message_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessage_idUndefined: Self = StObject.set(x, "message_id", js.undefined)
  }
}
