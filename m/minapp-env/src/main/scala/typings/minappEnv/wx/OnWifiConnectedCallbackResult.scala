package typings.minappEnv.wx

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OnWifiConnectedCallbackResult extends StObject {
  
  /** [WifiInfo](https://developers.weixin.qq.com/miniprogram/dev/api/device/wifi/WifiInfo.html)
    *
    * Wi-Fi 信息 */
  var wifi: WifiInfo
}
object OnWifiConnectedCallbackResult {
  
  inline def apply(wifi: WifiInfo): OnWifiConnectedCallbackResult = {
    val __obj = js.Dynamic.literal(wifi = wifi.asInstanceOf[js.Any])
    __obj.asInstanceOf[OnWifiConnectedCallbackResult]
  }
  
  extension [Self <: OnWifiConnectedCallbackResult](x: Self) {
    
    inline def setWifi(value: WifiInfo): Self = StObject.set(x, "wifi", value.asInstanceOf[js.Any])
  }
}
