package typings.miniprogram.anon

import typings.miniprogram.AsyncCallbackFailObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined {  deviceId :string} & miniprogram.AsyncCallback<{  services :std.Array<{  isPrimary :boolean,   serviceId :string}>}> */
trait deviceIdstringAsyncCallbaComplete extends StObject {
  
  var complete: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  var deviceId: String
  
  var fail: js.UndefOr[js.Function1[/* err */ AsyncCallbackFailObject, Unit]] = js.undefined
  
  var success: js.UndefOr[js.Function1[/* res */ Services, Unit]] = js.undefined
}
object deviceIdstringAsyncCallbaComplete {
  
  inline def apply(deviceId: String): deviceIdstringAsyncCallbaComplete = {
    val __obj = js.Dynamic.literal(deviceId = deviceId.asInstanceOf[js.Any])
    __obj.asInstanceOf[deviceIdstringAsyncCallbaComplete]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: deviceIdstringAsyncCallbaComplete] (val x: Self) extends AnyVal {
    
    inline def setComplete(value: () => Unit): Self = StObject.set(x, "complete", js.Any.fromFunction0(value))
    
    inline def setCompleteUndefined: Self = StObject.set(x, "complete", js.undefined)
    
    inline def setDeviceId(value: String): Self = StObject.set(x, "deviceId", value.asInstanceOf[js.Any])
    
    inline def setFail(value: /* err */ AsyncCallbackFailObject => Unit): Self = StObject.set(x, "fail", js.Any.fromFunction1(value))
    
    inline def setFailUndefined: Self = StObject.set(x, "fail", js.undefined)
    
    inline def setSuccess(value: /* res */ Services => Unit): Self = StObject.set(x, "success", js.Any.fromFunction1(value))
    
    inline def setSuccessUndefined: Self = StObject.set(x, "success", js.undefined)
  }
}
