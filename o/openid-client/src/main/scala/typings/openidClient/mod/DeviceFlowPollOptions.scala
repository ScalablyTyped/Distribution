package typings.openidClient.mod

import typings.std.AbortSignal
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeviceFlowPollOptions extends StObject {
  
  // @ts-ignore
  var signal: js.UndefOr[AbortSignal] = js.undefined
}
object DeviceFlowPollOptions {
  
  inline def apply(): DeviceFlowPollOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeviceFlowPollOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeviceFlowPollOptions] (val x: Self) extends AnyVal {
    
    inline def setSignal(value: AbortSignal): Self = StObject.set(x, "signal", value.asInstanceOf[js.Any])
    
    inline def setSignalUndefined: Self = StObject.set(x, "signal", js.undefined)
  }
}
