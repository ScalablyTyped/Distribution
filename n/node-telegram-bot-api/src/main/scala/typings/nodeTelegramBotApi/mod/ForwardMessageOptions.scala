package typings.nodeTelegramBotApi.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ForwardMessageOptions extends StObject {
  
  var disable_notification: js.UndefOr[Boolean] = js.undefined
  
  var protect_content: js.UndefOr[Boolean] = js.undefined
}
object ForwardMessageOptions {
  
  inline def apply(): ForwardMessageOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ForwardMessageOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ForwardMessageOptions] (val x: Self) extends AnyVal {
    
    inline def setDisable_notification(value: Boolean): Self = StObject.set(x, "disable_notification", value.asInstanceOf[js.Any])
    
    inline def setDisable_notificationUndefined: Self = StObject.set(x, "disable_notification", js.undefined)
    
    inline def setProtect_content(value: Boolean): Self = StObject.set(x, "protect_content", value.asInstanceOf[js.Any])
    
    inline def setProtect_contentUndefined: Self = StObject.set(x, "protect_content", js.undefined)
  }
}
