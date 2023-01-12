package typings.nodeTelegramBotApi.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StopPollingOptions extends StObject {
  
  var cancel: js.UndefOr[Boolean] = js.undefined
  
  var reason: js.UndefOr[String] = js.undefined
}
object StopPollingOptions {
  
  inline def apply(): StopPollingOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StopPollingOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: StopPollingOptions] (val x: Self) extends AnyVal {
    
    inline def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
    
    inline def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
    
    inline def setReason(value: String): Self = StObject.set(x, "reason", value.asInstanceOf[js.Any])
    
    inline def setReasonUndefined: Self = StObject.set(x, "reason", js.undefined)
  }
}
