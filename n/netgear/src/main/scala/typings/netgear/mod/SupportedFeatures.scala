package typings.netgear.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SupportedFeatures extends StObject {
  
  var AccessControl: String
  
  var AttachedDevice: String
  
  var DeviceTypeIdentification: String
  
  var DynamicQoS: String
  
  var GuestNetworkSchedule: String
  
  var MaxMonthlyTrafficLimitation: String
  
  var NameNTGRDevice: String
  
  var OpenDNSParentalControl: String
  
  var SmartConnect: String
  
  var SpeedTest: String
  
  var TCAcceptance: String
}
object SupportedFeatures {
  
  inline def apply(
    AccessControl: String,
    AttachedDevice: String,
    DeviceTypeIdentification: String,
    DynamicQoS: String,
    GuestNetworkSchedule: String,
    MaxMonthlyTrafficLimitation: String,
    NameNTGRDevice: String,
    OpenDNSParentalControl: String,
    SmartConnect: String,
    SpeedTest: String,
    TCAcceptance: String
  ): SupportedFeatures = {
    val __obj = js.Dynamic.literal(AccessControl = AccessControl.asInstanceOf[js.Any], AttachedDevice = AttachedDevice.asInstanceOf[js.Any], DeviceTypeIdentification = DeviceTypeIdentification.asInstanceOf[js.Any], DynamicQoS = DynamicQoS.asInstanceOf[js.Any], GuestNetworkSchedule = GuestNetworkSchedule.asInstanceOf[js.Any], MaxMonthlyTrafficLimitation = MaxMonthlyTrafficLimitation.asInstanceOf[js.Any], NameNTGRDevice = NameNTGRDevice.asInstanceOf[js.Any], OpenDNSParentalControl = OpenDNSParentalControl.asInstanceOf[js.Any], SmartConnect = SmartConnect.asInstanceOf[js.Any], SpeedTest = SpeedTest.asInstanceOf[js.Any], TCAcceptance = TCAcceptance.asInstanceOf[js.Any])
    __obj.asInstanceOf[SupportedFeatures]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SupportedFeatures] (val x: Self) extends AnyVal {
    
    inline def setAccessControl(value: String): Self = StObject.set(x, "AccessControl", value.asInstanceOf[js.Any])
    
    inline def setAttachedDevice(value: String): Self = StObject.set(x, "AttachedDevice", value.asInstanceOf[js.Any])
    
    inline def setDeviceTypeIdentification(value: String): Self = StObject.set(x, "DeviceTypeIdentification", value.asInstanceOf[js.Any])
    
    inline def setDynamicQoS(value: String): Self = StObject.set(x, "DynamicQoS", value.asInstanceOf[js.Any])
    
    inline def setGuestNetworkSchedule(value: String): Self = StObject.set(x, "GuestNetworkSchedule", value.asInstanceOf[js.Any])
    
    inline def setMaxMonthlyTrafficLimitation(value: String): Self = StObject.set(x, "MaxMonthlyTrafficLimitation", value.asInstanceOf[js.Any])
    
    inline def setNameNTGRDevice(value: String): Self = StObject.set(x, "NameNTGRDevice", value.asInstanceOf[js.Any])
    
    inline def setOpenDNSParentalControl(value: String): Self = StObject.set(x, "OpenDNSParentalControl", value.asInstanceOf[js.Any])
    
    inline def setSmartConnect(value: String): Self = StObject.set(x, "SmartConnect", value.asInstanceOf[js.Any])
    
    inline def setSpeedTest(value: String): Self = StObject.set(x, "SpeedTest", value.asInstanceOf[js.Any])
    
    inline def setTCAcceptance(value: String): Self = StObject.set(x, "TCAcceptance", value.asInstanceOf[js.Any])
  }
}
