package typings.netgear.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Settings extends StObject {
  
  var Firmware: String
  
  var InternetConnectionStatus: String
  
  var LoginMethod: String
  
  var Model: String
  
  var ParentalControlSupported: String
  
  var ReadyShareSupportedLevel: String
  
  var Region: String
  
  var RegionTag: String
  
  var SOAPVersion: String
  
  var XCloudSupported: String
  
  var host: String
  
  var port: Double
}
object Settings {
  
  inline def apply(
    Firmware: String,
    InternetConnectionStatus: String,
    LoginMethod: String,
    Model: String,
    ParentalControlSupported: String,
    ReadyShareSupportedLevel: String,
    Region: String,
    RegionTag: String,
    SOAPVersion: String,
    XCloudSupported: String,
    host: String,
    port: Double
  ): Settings = {
    val __obj = js.Dynamic.literal(Firmware = Firmware.asInstanceOf[js.Any], InternetConnectionStatus = InternetConnectionStatus.asInstanceOf[js.Any], LoginMethod = LoginMethod.asInstanceOf[js.Any], Model = Model.asInstanceOf[js.Any], ParentalControlSupported = ParentalControlSupported.asInstanceOf[js.Any], ReadyShareSupportedLevel = ReadyShareSupportedLevel.asInstanceOf[js.Any], Region = Region.asInstanceOf[js.Any], RegionTag = RegionTag.asInstanceOf[js.Any], SOAPVersion = SOAPVersion.asInstanceOf[js.Any], XCloudSupported = XCloudSupported.asInstanceOf[js.Any], host = host.asInstanceOf[js.Any], port = port.asInstanceOf[js.Any])
    __obj.asInstanceOf[Settings]
  }
  
  extension [Self <: Settings](x: Self) {
    
    inline def setFirmware(value: String): Self = StObject.set(x, "Firmware", value.asInstanceOf[js.Any])
    
    inline def setHost(value: String): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
    
    inline def setInternetConnectionStatus(value: String): Self = StObject.set(x, "InternetConnectionStatus", value.asInstanceOf[js.Any])
    
    inline def setLoginMethod(value: String): Self = StObject.set(x, "LoginMethod", value.asInstanceOf[js.Any])
    
    inline def setModel(value: String): Self = StObject.set(x, "Model", value.asInstanceOf[js.Any])
    
    inline def setParentalControlSupported(value: String): Self = StObject.set(x, "ParentalControlSupported", value.asInstanceOf[js.Any])
    
    inline def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
    
    inline def setReadyShareSupportedLevel(value: String): Self = StObject.set(x, "ReadyShareSupportedLevel", value.asInstanceOf[js.Any])
    
    inline def setRegion(value: String): Self = StObject.set(x, "Region", value.asInstanceOf[js.Any])
    
    inline def setRegionTag(value: String): Self = StObject.set(x, "RegionTag", value.asInstanceOf[js.Any])
    
    inline def setSOAPVersion(value: String): Self = StObject.set(x, "SOAPVersion", value.asInstanceOf[js.Any])
    
    inline def setXCloudSupported(value: String): Self = StObject.set(x, "XCloudSupported", value.asInstanceOf[js.Any])
  }
}
