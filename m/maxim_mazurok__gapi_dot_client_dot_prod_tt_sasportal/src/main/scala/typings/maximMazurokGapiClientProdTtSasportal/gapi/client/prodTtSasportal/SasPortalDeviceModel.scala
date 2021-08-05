package typings.maximMazurokGapiClientProdTtSasportal.gapi.client.prodTtSasportal

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SasPortalDeviceModel extends StObject {
  
  /** The firmware version of the device. */
  var firmwareVersion: js.UndefOr[String] = js.undefined
  
  /** The hardware version of the device. */
  var hardwareVersion: js.UndefOr[String] = js.undefined
  
  /** The name of the device model. */
  var name: js.UndefOr[String] = js.undefined
  
  /** The software version of the device. */
  var softwareVersion: js.UndefOr[String] = js.undefined
  
  /** The name of the device vendor. */
  var vendor: js.UndefOr[String] = js.undefined
}
object SasPortalDeviceModel {
  
  inline def apply(): SasPortalDeviceModel = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SasPortalDeviceModel]
  }
  
  extension [Self <: SasPortalDeviceModel](x: Self) {
    
    inline def setFirmwareVersion(value: String): Self = StObject.set(x, "firmwareVersion", value.asInstanceOf[js.Any])
    
    inline def setFirmwareVersionUndefined: Self = StObject.set(x, "firmwareVersion", js.undefined)
    
    inline def setHardwareVersion(value: String): Self = StObject.set(x, "hardwareVersion", value.asInstanceOf[js.Any])
    
    inline def setHardwareVersionUndefined: Self = StObject.set(x, "hardwareVersion", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setSoftwareVersion(value: String): Self = StObject.set(x, "softwareVersion", value.asInstanceOf[js.Any])
    
    inline def setSoftwareVersionUndefined: Self = StObject.set(x, "softwareVersion", js.undefined)
    
    inline def setVendor(value: String): Self = StObject.set(x, "vendor", value.asInstanceOf[js.Any])
    
    inline def setVendorUndefined: Self = StObject.set(x, "vendor", js.undefined)
  }
}
