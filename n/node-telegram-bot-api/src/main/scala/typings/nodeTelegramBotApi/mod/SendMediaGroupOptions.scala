package typings.nodeTelegramBotApi.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SendMediaGroupOptions extends StObject {
  
  var disable_notification: js.UndefOr[Boolean] = js.undefined
  
  var reply_to_message_id: js.UndefOr[Double] = js.undefined
}
object SendMediaGroupOptions {
  
  inline def apply(): SendMediaGroupOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SendMediaGroupOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SendMediaGroupOptions] (val x: Self) extends AnyVal {
    
    inline def setDisable_notification(value: Boolean): Self = StObject.set(x, "disable_notification", value.asInstanceOf[js.Any])
    
    inline def setDisable_notificationUndefined: Self = StObject.set(x, "disable_notification", js.undefined)
    
    inline def setReply_to_message_id(value: Double): Self = StObject.set(x, "reply_to_message_id", value.asInstanceOf[js.Any])
    
    inline def setReply_to_message_idUndefined: Self = StObject.set(x, "reply_to_message_id", js.undefined)
  }
}
