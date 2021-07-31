package typings.minappEnv.wx

import typings.minappEnv.Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetConnectedBluetoothDevicesOption extends StObject {
  
  /** 接口调用结束的回调函数（调用成功、失败都会执行） */
  var complete: js.UndefOr[GetConnectedBluetoothDevicesCompleteCallback] = js.undefined
  
  /** 接口调用失败的回调函数 */
  var fail: js.UndefOr[GetConnectedBluetoothDevicesFailCallback] = js.undefined
  
  /** 蓝牙设备主 service 的 uuid 列表 */
  var services: Array[String]
  
  /** 接口调用成功的回调函数 */
  var success: js.UndefOr[GetConnectedBluetoothDevicesSuccessCallback] = js.undefined
}
object GetConnectedBluetoothDevicesOption {
  
  @scala.inline
  def apply(services: Array[String]): GetConnectedBluetoothDevicesOption = {
    val __obj = js.Dynamic.literal(services = services.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetConnectedBluetoothDevicesOption]
  }
  
  @scala.inline
  implicit class GetConnectedBluetoothDevicesOptionMutableBuilder[Self <: GetConnectedBluetoothDevicesOption] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setComplete(value: /* res */ GeneralCallbackResult => Unit): Self = StObject.set(x, "complete", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCompleteUndefined: Self = StObject.set(x, "complete", js.undefined)
    
    @scala.inline
    def setFail(value: /* res */ GeneralCallbackResult => Unit): Self = StObject.set(x, "fail", js.Any.fromFunction1(value))
    
    @scala.inline
    def setFailUndefined: Self = StObject.set(x, "fail", js.undefined)
    
    @scala.inline
    def setServices(value: Array[String]): Self = StObject.set(x, "services", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSuccess(value: /* result */ GetConnectedBluetoothDevicesSuccessCallbackResult => Unit): Self = StObject.set(x, "success", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSuccessUndefined: Self = StObject.set(x, "success", js.undefined)
  }
}
