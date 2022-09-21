package typings.netgear.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Info extends StObject {
  
  var Description: String
  
  var DeviceMode: String
  
  var DeviceModeCapability: String
  
  var DeviceName: String
  
  var DeviceNameUserSet: String
  
  var FirewallVersion: String
  
  var FirmwareDLmethod: String
  
  var FirmwareLastChecked: String
  
  var FirmwareLastUpdate: String
  
  var Firmwareversion: String
  
  var FirstUseDate: String
  
  var Hardwareversion: String
  
  var ModelName: String
  
  var Otherhardwareversion: String
  
  var OthersoftwareVersion: String
  
  var SerialNumber: String
  
  var SmartAgentversion: String
  
  var VPNVersion: Unit
}
object Info {
  
  inline def apply(
    Description: String,
    DeviceMode: String,
    DeviceModeCapability: String,
    DeviceName: String,
    DeviceNameUserSet: String,
    FirewallVersion: String,
    FirmwareDLmethod: String,
    FirmwareLastChecked: String,
    FirmwareLastUpdate: String,
    Firmwareversion: String,
    FirstUseDate: String,
    Hardwareversion: String,
    ModelName: String,
    Otherhardwareversion: String,
    OthersoftwareVersion: String,
    SerialNumber: String,
    SmartAgentversion: String,
    VPNVersion: Unit
  ): Info = {
    val __obj = js.Dynamic.literal(Description = Description.asInstanceOf[js.Any], DeviceMode = DeviceMode.asInstanceOf[js.Any], DeviceModeCapability = DeviceModeCapability.asInstanceOf[js.Any], DeviceName = DeviceName.asInstanceOf[js.Any], DeviceNameUserSet = DeviceNameUserSet.asInstanceOf[js.Any], FirewallVersion = FirewallVersion.asInstanceOf[js.Any], FirmwareDLmethod = FirmwareDLmethod.asInstanceOf[js.Any], FirmwareLastChecked = FirmwareLastChecked.asInstanceOf[js.Any], FirmwareLastUpdate = FirmwareLastUpdate.asInstanceOf[js.Any], Firmwareversion = Firmwareversion.asInstanceOf[js.Any], FirstUseDate = FirstUseDate.asInstanceOf[js.Any], Hardwareversion = Hardwareversion.asInstanceOf[js.Any], ModelName = ModelName.asInstanceOf[js.Any], Otherhardwareversion = Otherhardwareversion.asInstanceOf[js.Any], OthersoftwareVersion = OthersoftwareVersion.asInstanceOf[js.Any], SerialNumber = SerialNumber.asInstanceOf[js.Any], SmartAgentversion = SmartAgentversion.asInstanceOf[js.Any], VPNVersion = VPNVersion.asInstanceOf[js.Any])
    __obj.asInstanceOf[Info]
  }
  
  extension [Self <: Info](x: Self) {
    
    inline def setDescription(value: String): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setDeviceMode(value: String): Self = StObject.set(x, "DeviceMode", value.asInstanceOf[js.Any])
    
    inline def setDeviceModeCapability(value: String): Self = StObject.set(x, "DeviceModeCapability", value.asInstanceOf[js.Any])
    
    inline def setDeviceName(value: String): Self = StObject.set(x, "DeviceName", value.asInstanceOf[js.Any])
    
    inline def setDeviceNameUserSet(value: String): Self = StObject.set(x, "DeviceNameUserSet", value.asInstanceOf[js.Any])
    
    inline def setFirewallVersion(value: String): Self = StObject.set(x, "FirewallVersion", value.asInstanceOf[js.Any])
    
    inline def setFirmwareDLmethod(value: String): Self = StObject.set(x, "FirmwareDLmethod", value.asInstanceOf[js.Any])
    
    inline def setFirmwareLastChecked(value: String): Self = StObject.set(x, "FirmwareLastChecked", value.asInstanceOf[js.Any])
    
    inline def setFirmwareLastUpdate(value: String): Self = StObject.set(x, "FirmwareLastUpdate", value.asInstanceOf[js.Any])
    
    inline def setFirmwareversion(value: String): Self = StObject.set(x, "Firmwareversion", value.asInstanceOf[js.Any])
    
    inline def setFirstUseDate(value: String): Self = StObject.set(x, "FirstUseDate", value.asInstanceOf[js.Any])
    
    inline def setHardwareversion(value: String): Self = StObject.set(x, "Hardwareversion", value.asInstanceOf[js.Any])
    
    inline def setModelName(value: String): Self = StObject.set(x, "ModelName", value.asInstanceOf[js.Any])
    
    inline def setOtherhardwareversion(value: String): Self = StObject.set(x, "Otherhardwareversion", value.asInstanceOf[js.Any])
    
    inline def setOthersoftwareVersion(value: String): Self = StObject.set(x, "OthersoftwareVersion", value.asInstanceOf[js.Any])
    
    inline def setSerialNumber(value: String): Self = StObject.set(x, "SerialNumber", value.asInstanceOf[js.Any])
    
    inline def setSmartAgentversion(value: String): Self = StObject.set(x, "SmartAgentversion", value.asInstanceOf[js.Any])
    
    inline def setVPNVersion(value: Unit): Self = StObject.set(x, "VPNVersion", value.asInstanceOf[js.Any])
  }
}
