package typings.nodeTelegramBotApi.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EditMessageReplyMarkupOptions extends StObject {
  
  var chat_id: js.UndefOr[Double | String] = js.native
  
  var inline_message_id: js.UndefOr[String] = js.native
  
  var message_id: js.UndefOr[Double] = js.native
}
object EditMessageReplyMarkupOptions {
  
  @scala.inline
  def apply(): EditMessageReplyMarkupOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EditMessageReplyMarkupOptions]
  }
  
  @scala.inline
  implicit class EditMessageReplyMarkupOptionsMutableBuilder[Self <: EditMessageReplyMarkupOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChat_id(value: Double | String): Self = StObject.set(x, "chat_id", value.asInstanceOf[js.Any])
    
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
