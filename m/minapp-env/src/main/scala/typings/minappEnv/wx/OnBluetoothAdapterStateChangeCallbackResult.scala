package typings.minappEnv.wx

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OnBluetoothAdapterStateChangeCallbackResult extends StObject {
  
  /** 蓝牙适配器是否可用 */
  var available: Boolean
  
  /** 蓝牙适配器是否处于搜索状态 */
  var discovering: Boolean
}
object OnBluetoothAdapterStateChangeCallbackResult {
  
  @scala.inline
  def apply(available: Boolean, discovering: Boolean): OnBluetoothAdapterStateChangeCallbackResult = {
    val __obj = js.Dynamic.literal(available = available.asInstanceOf[js.Any], discovering = discovering.asInstanceOf[js.Any])
    __obj.asInstanceOf[OnBluetoothAdapterStateChangeCallbackResult]
  }
  
  @scala.inline
  implicit class OnBluetoothAdapterStateChangeCallbackResultMutableBuilder[Self <: OnBluetoothAdapterStateChangeCallbackResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAvailable(value: Boolean): Self = StObject.set(x, "available", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDiscovering(value: Boolean): Self = StObject.set(x, "discovering", value.asInstanceOf[js.Any])
  }
}
