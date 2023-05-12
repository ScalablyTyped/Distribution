package typings.nodeTelegramBotApi.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PinChatMessageOptions extends StObject {
  
  var disable_notification: js.UndefOr[Boolean] = js.undefined
}
object PinChatMessageOptions {
  
  inline def apply(): PinChatMessageOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PinChatMessageOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PinChatMessageOptions] (val x: Self) extends AnyVal {
    
    inline def setDisable_notification(value: Boolean): Self = StObject.set(x, "disable_notification", value.asInstanceOf[js.Any])
    
    inline def setDisable_notificationUndefined: Self = StObject.set(x, "disable_notification", js.undefined)
  }
}
