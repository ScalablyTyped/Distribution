package typings.miniprogram.anon

import typings.miniprogram.AsyncCallbackFailObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined {  deviceId :string,   serviceId :string} & miniprogram.AsyncCallback<{  characteristic :std.Array<{  characteristicId :string,   serviceId :string,   value :string,   properties :{  read :boolean,   write :boolean,   notify :boolean,   indicate :boolean}}>}> */
trait deviceIdstringserviceIdst extends StObject {
  
  var complete: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  var deviceId: String
  
  var fail: js.UndefOr[js.Function1[/* err */ AsyncCallbackFailObject, Unit]] = js.undefined
  
  var serviceId: String
  
  var success: js.UndefOr[js.Function1[/* res */ CharacteristicArray, Unit]] = js.undefined
}
object deviceIdstringserviceIdst {
  
  inline def apply(deviceId: String, serviceId: String): deviceIdstringserviceIdst = {
    val __obj = js.Dynamic.literal(deviceId = deviceId.asInstanceOf[js.Any], serviceId = serviceId.asInstanceOf[js.Any])
    __obj.asInstanceOf[deviceIdstringserviceIdst]
  }
  
  extension [Self <: deviceIdstringserviceIdst](x: Self) {
    
    inline def setComplete(value: () => Unit): Self = StObject.set(x, "complete", js.Any.fromFunction0(value))
    
    inline def setCompleteUndefined: Self = StObject.set(x, "complete", js.undefined)
    
    inline def setDeviceId(value: String): Self = StObject.set(x, "deviceId", value.asInstanceOf[js.Any])
    
    inline def setFail(value: /* err */ AsyncCallbackFailObject => Unit): Self = StObject.set(x, "fail", js.Any.fromFunction1(value))
    
    inline def setFailUndefined: Self = StObject.set(x, "fail", js.undefined)
    
    inline def setServiceId(value: String): Self = StObject.set(x, "serviceId", value.asInstanceOf[js.Any])
    
    inline def setSuccess(value: /* res */ CharacteristicArray => Unit): Self = StObject.set(x, "success", js.Any.fromFunction1(value))
    
    inline def setSuccessUndefined: Self = StObject.set(x, "success", js.undefined)
  }
}
