package typings.miniprogram

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetNetworkTypeCallbackValue extends StObject {
  
  var networkAvailable: Boolean
  
  /**
    * Network type, UNKNOWN / NOTREACHABLE / WIFI / 3G / 2G / 4G / WWAN.
    */
  var networkType: String
}
object GetNetworkTypeCallbackValue {
  
  inline def apply(networkAvailable: Boolean, networkType: String): GetNetworkTypeCallbackValue = {
    val __obj = js.Dynamic.literal(networkAvailable = networkAvailable.asInstanceOf[js.Any], networkType = networkType.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetNetworkTypeCallbackValue]
  }
  
  extension [Self <: GetNetworkTypeCallbackValue](x: Self) {
    
    inline def setNetworkAvailable(value: Boolean): Self = StObject.set(x, "networkAvailable", value.asInstanceOf[js.Any])
    
    inline def setNetworkType(value: String): Self = StObject.set(x, "networkType", value.asInstanceOf[js.Any])
  }
}
