package typings.miniprogram

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StartBluetoothDevicesDiscoveryArgs
  extends StObject
     with AsyncCallback[Any] {
  
  var allowDuplicatesKey: js.UndefOr[Boolean] = js.undefined
  
  var interval: js.UndefOr[Double] = js.undefined
  
  var services: js.UndefOr[js.Array[String]] = js.undefined
}
object StartBluetoothDevicesDiscoveryArgs {
  
  inline def apply(): StartBluetoothDevicesDiscoveryArgs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StartBluetoothDevicesDiscoveryArgs]
  }
  
  extension [Self <: StartBluetoothDevicesDiscoveryArgs](x: Self) {
    
    inline def setAllowDuplicatesKey(value: Boolean): Self = StObject.set(x, "allowDuplicatesKey", value.asInstanceOf[js.Any])
    
    inline def setAllowDuplicatesKeyUndefined: Self = StObject.set(x, "allowDuplicatesKey", js.undefined)
    
    inline def setInterval(value: Double): Self = StObject.set(x, "interval", value.asInstanceOf[js.Any])
    
    inline def setIntervalUndefined: Self = StObject.set(x, "interval", js.undefined)
    
    inline def setServices(value: js.Array[String]): Self = StObject.set(x, "services", value.asInstanceOf[js.Any])
    
    inline def setServicesUndefined: Self = StObject.set(x, "services", js.undefined)
    
    inline def setServicesVarargs(value: String*): Self = StObject.set(x, "services", js.Array(value*))
  }
}
