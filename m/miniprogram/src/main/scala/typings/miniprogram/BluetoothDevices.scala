package typings.miniprogram

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BluetoothDevices extends StObject {
  
  var RSSI: Double
  
  var advertisData: String
  
  var deviceId: String
  
  var deviceName: String
  
  var localName: String
  
  var manufacturerData: String
  
  var name: String
}
object BluetoothDevices {
  
  inline def apply(
    RSSI: Double,
    advertisData: String,
    deviceId: String,
    deviceName: String,
    localName: String,
    manufacturerData: String,
    name: String
  ): BluetoothDevices = {
    val __obj = js.Dynamic.literal(RSSI = RSSI.asInstanceOf[js.Any], advertisData = advertisData.asInstanceOf[js.Any], deviceId = deviceId.asInstanceOf[js.Any], deviceName = deviceName.asInstanceOf[js.Any], localName = localName.asInstanceOf[js.Any], manufacturerData = manufacturerData.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[BluetoothDevices]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BluetoothDevices] (val x: Self) extends AnyVal {
    
    inline def setAdvertisData(value: String): Self = StObject.set(x, "advertisData", value.asInstanceOf[js.Any])
    
    inline def setDeviceId(value: String): Self = StObject.set(x, "deviceId", value.asInstanceOf[js.Any])
    
    inline def setDeviceName(value: String): Self = StObject.set(x, "deviceName", value.asInstanceOf[js.Any])
    
    inline def setLocalName(value: String): Self = StObject.set(x, "localName", value.asInstanceOf[js.Any])
    
    inline def setManufacturerData(value: String): Self = StObject.set(x, "manufacturerData", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setRSSI(value: Double): Self = StObject.set(x, "RSSI", value.asInstanceOf[js.Any])
  }
}
