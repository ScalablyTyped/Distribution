package typings.minappEnv.wx

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetBLEDeviceCharacteristicsOption extends StObject {
  
  /** 接口调用结束的回调函数（调用成功、失败都会执行） */
  var complete: js.UndefOr[GetBLEDeviceCharacteristicsCompleteCallback] = js.native
  
  /** 蓝牙设备 id */
  var deviceId: String = js.native
  
  /** 接口调用失败的回调函数 */
  var fail: js.UndefOr[GetBLEDeviceCharacteristicsFailCallback] = js.native
  
  /** 蓝牙服务 uuid，需要使用 `getBLEDeviceServices` 获取 */
  var serviceId: String = js.native
  
  /** 接口调用成功的回调函数 */
  var success: js.UndefOr[GetBLEDeviceCharacteristicsSuccessCallback] = js.native
}
object GetBLEDeviceCharacteristicsOption {
  
  @scala.inline
  def apply(deviceId: String, serviceId: String): GetBLEDeviceCharacteristicsOption = {
    val __obj = js.Dynamic.literal(deviceId = deviceId.asInstanceOf[js.Any], serviceId = serviceId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetBLEDeviceCharacteristicsOption]
  }
  
  @scala.inline
  implicit class GetBLEDeviceCharacteristicsOptionMutableBuilder[Self <: GetBLEDeviceCharacteristicsOption] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setComplete(value: /* res */ GeneralCallbackResult => Unit): Self = StObject.set(x, "complete", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCompleteUndefined: Self = StObject.set(x, "complete", js.undefined)
    
    @scala.inline
    def setDeviceId(value: String): Self = StObject.set(x, "deviceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFail(value: /* res */ GeneralCallbackResult => Unit): Self = StObject.set(x, "fail", js.Any.fromFunction1(value))
    
    @scala.inline
    def setFailUndefined: Self = StObject.set(x, "fail", js.undefined)
    
    @scala.inline
    def setServiceId(value: String): Self = StObject.set(x, "serviceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSuccess(value: /* result */ GetBLEDeviceCharacteristicsSuccessCallbackResult => Unit): Self = StObject.set(x, "success", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSuccessUndefined: Self = StObject.set(x, "success", js.undefined)
  }
}
