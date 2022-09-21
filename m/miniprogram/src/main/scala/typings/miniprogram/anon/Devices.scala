package typings.miniprogram.anon

import typings.miniprogram.BluetoothDevices
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Devices extends StObject {
  
  var devices: js.Array[BluetoothDevices]
}
object Devices {
  
  inline def apply(devices: js.Array[BluetoothDevices]): Devices = {
    val __obj = js.Dynamic.literal(devices = devices.asInstanceOf[js.Any])
    __obj.asInstanceOf[Devices]
  }
  
  extension [Self <: Devices](x: Self) {
    
    inline def setDevices(value: js.Array[BluetoothDevices]): Self = StObject.set(x, "devices", value.asInstanceOf[js.Any])
    
    inline def setDevicesVarargs(value: BluetoothDevices*): Self = StObject.set(x, "devices", js.Array(value*))
  }
}
