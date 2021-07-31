package typings.minappEnv.wx

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetBluetoothAdapterStateSuccessCallbackResult extends StObject {
  
  /** 蓝牙适配器是否可用 */
  var available: Boolean
  
  /** 是否正在搜索设备 */
  var discovering: Boolean
}
object GetBluetoothAdapterStateSuccessCallbackResult {
  
  @scala.inline
  def apply(available: Boolean, discovering: Boolean): GetBluetoothAdapterStateSuccessCallbackResult = {
    val __obj = js.Dynamic.literal(available = available.asInstanceOf[js.Any], discovering = discovering.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetBluetoothAdapterStateSuccessCallbackResult]
  }
  
  @scala.inline
  implicit class GetBluetoothAdapterStateSuccessCallbackResultMutableBuilder[Self <: GetBluetoothAdapterStateSuccessCallbackResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAvailable(value: Boolean): Self = StObject.set(x, "available", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDiscovering(value: Boolean): Self = StObject.set(x, "discovering", value.asInstanceOf[js.Any])
  }
}
