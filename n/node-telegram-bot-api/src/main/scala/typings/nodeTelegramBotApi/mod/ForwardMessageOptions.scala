package typings.nodeTelegramBotApi.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ForwardMessageOptions extends StObject {
  
  var disable_notification: js.UndefOr[Boolean] = js.native
}
object ForwardMessageOptions {
  
  @scala.inline
  def apply(): ForwardMessageOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ForwardMessageOptions]
  }
  
  @scala.inline
  implicit class ForwardMessageOptionsMutableBuilder[Self <: ForwardMessageOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDisable_notification(value: Boolean): Self = StObject.set(x, "disable_notification", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisable_notificationUndefined: Self = StObject.set(x, "disable_notification", js.undefined)
  }
}
