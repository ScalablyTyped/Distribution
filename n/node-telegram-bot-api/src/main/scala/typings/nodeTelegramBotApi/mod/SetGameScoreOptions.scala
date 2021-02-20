package typings.nodeTelegramBotApi.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SetGameScoreOptions extends StObject {
  
  var chat_id: js.UndefOr[Double] = js.native
  
  var disable_edit_message: js.UndefOr[Boolean] = js.native
  
  var force: js.UndefOr[Boolean] = js.native
  
  var inline_message_id: js.UndefOr[String] = js.native
  
  var message_id: js.UndefOr[Double] = js.native
}
object SetGameScoreOptions {
  
  @scala.inline
  def apply(): SetGameScoreOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SetGameScoreOptions]
  }
  
  @scala.inline
  implicit class SetGameScoreOptionsMutableBuilder[Self <: SetGameScoreOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChat_id(value: Double): Self = StObject.set(x, "chat_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChat_idUndefined: Self = StObject.set(x, "chat_id", js.undefined)
    
    @scala.inline
    def setDisable_edit_message(value: Boolean): Self = StObject.set(x, "disable_edit_message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisable_edit_messageUndefined: Self = StObject.set(x, "disable_edit_message", js.undefined)
    
    @scala.inline
    def setForce(value: Boolean): Self = StObject.set(x, "force", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setForceUndefined: Self = StObject.set(x, "force", js.undefined)
    
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
