package typings.nodeTelegramBotApi.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StopPollingOptions extends StObject {
  
  var cancel: js.UndefOr[Boolean] = js.native
  
  var reason: js.UndefOr[String] = js.native
}
object StopPollingOptions {
  
  @scala.inline
  def apply(): StopPollingOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StopPollingOptions]
  }
  
  @scala.inline
  implicit class StopPollingOptionsMutableBuilder[Self <: StopPollingOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
    
    @scala.inline
    def setReason(value: String): Self = StObject.set(x, "reason", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReasonUndefined: Self = StObject.set(x, "reason", js.undefined)
  }
}
