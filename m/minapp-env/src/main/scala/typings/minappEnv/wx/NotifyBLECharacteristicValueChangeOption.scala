package typings.minappEnv.wx

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NotifyBLECharacteristicValueChangeOption extends StObject {
  
  /** 蓝牙特征值的 uuid */
  var characteristicId: String
  
  /** 接口调用结束的回调函数（调用成功、失败都会执行） */
  var complete: js.UndefOr[NotifyBLECharacteristicValueChangeCompleteCallback] = js.undefined
  
  /** 蓝牙设备 id */
  var deviceId: String
  
  /** 接口调用失败的回调函数 */
  var fail: js.UndefOr[NotifyBLECharacteristicValueChangeFailCallback] = js.undefined
  
  /** 蓝牙特征值对应服务的 uuid */
  var serviceId: String
  
  /** 是否启用 notify */
  var state: Boolean
  
  /** 接口调用成功的回调函数 */
  var success: js.UndefOr[NotifyBLECharacteristicValueChangeSuccessCallback] = js.undefined
}
object NotifyBLECharacteristicValueChangeOption {
  
  inline def apply(characteristicId: String, deviceId: String, serviceId: String, state: Boolean): NotifyBLECharacteristicValueChangeOption = {
    val __obj = js.Dynamic.literal(characteristicId = characteristicId.asInstanceOf[js.Any], deviceId = deviceId.asInstanceOf[js.Any], serviceId = serviceId.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any])
    __obj.asInstanceOf[NotifyBLECharacteristicValueChangeOption]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: NotifyBLECharacteristicValueChangeOption] (val x: Self) extends AnyVal {
    
    inline def setCharacteristicId(value: String): Self = StObject.set(x, "characteristicId", value.asInstanceOf[js.Any])
    
    inline def setComplete(value: /* res */ GeneralCallbackResult => Unit): Self = StObject.set(x, "complete", js.Any.fromFunction1(value))
    
    inline def setCompleteUndefined: Self = StObject.set(x, "complete", js.undefined)
    
    inline def setDeviceId(value: String): Self = StObject.set(x, "deviceId", value.asInstanceOf[js.Any])
    
    inline def setFail(value: /* res */ GeneralCallbackResult => Unit): Self = StObject.set(x, "fail", js.Any.fromFunction1(value))
    
    inline def setFailUndefined: Self = StObject.set(x, "fail", js.undefined)
    
    inline def setServiceId(value: String): Self = StObject.set(x, "serviceId", value.asInstanceOf[js.Any])
    
    inline def setState(value: Boolean): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setSuccess(value: /* res */ GeneralCallbackResult => Unit): Self = StObject.set(x, "success", js.Any.fromFunction1(value))
    
    inline def setSuccessUndefined: Self = StObject.set(x, "success", js.undefined)
  }
}
