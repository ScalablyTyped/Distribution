package typings.minappEnv.wx

import typings.minappEnv.Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OnGetWifiListCallbackResult extends StObject {
  
  /** Wi-Fi 列表数据 */
  var wifiList: Array[WifiInfo]
}
object OnGetWifiListCallbackResult {
  
  inline def apply(wifiList: Array[WifiInfo]): OnGetWifiListCallbackResult = {
    val __obj = js.Dynamic.literal(wifiList = wifiList.asInstanceOf[js.Any])
    __obj.asInstanceOf[OnGetWifiListCallbackResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: OnGetWifiListCallbackResult] (val x: Self) extends AnyVal {
    
    inline def setWifiList(value: Array[WifiInfo]): Self = StObject.set(x, "wifiList", value.asInstanceOf[js.Any])
  }
}
