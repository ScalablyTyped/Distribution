package typings.netgear.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Device extends StObject {
  
  var AllowOrBlock: String
  
  var ConnAPMAC: String
  
  var ConnectionType: String
  
  var DeviceModel: String
  
  var DeviceModelUserSet: Boolean
  
  var DeviceType: String
  
  var DeviceTypeName: String
  
  var DeviceTypeNameV2: String
  
  var DeviceTypeUserSet: Boolean
  
  var DeviceTypeV2: String
  
  var Download: String
  
  var Grouping: String
  
  var IP: String
  
  var Linkspeed: Double
  
  var MAC: String
  
  var Name: String
  
  var NameUserSet: String
  
  var QosPriority: String
  
  var SSID: String
  
  var Schedule: Boolean
  
  var SchedulePeriod: Double
  
  var SignalStrength: Double
  
  var Upload: String
}
object Device {
  
  inline def apply(
    AllowOrBlock: String,
    ConnAPMAC: String,
    ConnectionType: String,
    DeviceModel: String,
    DeviceModelUserSet: Boolean,
    DeviceType: String,
    DeviceTypeName: String,
    DeviceTypeNameV2: String,
    DeviceTypeUserSet: Boolean,
    DeviceTypeV2: String,
    Download: String,
    Grouping: String,
    IP: String,
    Linkspeed: Double,
    MAC: String,
    Name: String,
    NameUserSet: String,
    QosPriority: String,
    SSID: String,
    Schedule: Boolean,
    SchedulePeriod: Double,
    SignalStrength: Double,
    Upload: String
  ): Device = {
    val __obj = js.Dynamic.literal(AllowOrBlock = AllowOrBlock.asInstanceOf[js.Any], ConnAPMAC = ConnAPMAC.asInstanceOf[js.Any], ConnectionType = ConnectionType.asInstanceOf[js.Any], DeviceModel = DeviceModel.asInstanceOf[js.Any], DeviceModelUserSet = DeviceModelUserSet.asInstanceOf[js.Any], DeviceType = DeviceType.asInstanceOf[js.Any], DeviceTypeName = DeviceTypeName.asInstanceOf[js.Any], DeviceTypeNameV2 = DeviceTypeNameV2.asInstanceOf[js.Any], DeviceTypeUserSet = DeviceTypeUserSet.asInstanceOf[js.Any], DeviceTypeV2 = DeviceTypeV2.asInstanceOf[js.Any], Download = Download.asInstanceOf[js.Any], Grouping = Grouping.asInstanceOf[js.Any], IP = IP.asInstanceOf[js.Any], Linkspeed = Linkspeed.asInstanceOf[js.Any], MAC = MAC.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], NameUserSet = NameUserSet.asInstanceOf[js.Any], QosPriority = QosPriority.asInstanceOf[js.Any], SSID = SSID.asInstanceOf[js.Any], Schedule = Schedule.asInstanceOf[js.Any], SchedulePeriod = SchedulePeriod.asInstanceOf[js.Any], SignalStrength = SignalStrength.asInstanceOf[js.Any], Upload = Upload.asInstanceOf[js.Any])
    __obj.asInstanceOf[Device]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Device] (val x: Self) extends AnyVal {
    
    inline def setAllowOrBlock(value: String): Self = StObject.set(x, "AllowOrBlock", value.asInstanceOf[js.Any])
    
    inline def setConnAPMAC(value: String): Self = StObject.set(x, "ConnAPMAC", value.asInstanceOf[js.Any])
    
    inline def setConnectionType(value: String): Self = StObject.set(x, "ConnectionType", value.asInstanceOf[js.Any])
    
    inline def setDeviceModel(value: String): Self = StObject.set(x, "DeviceModel", value.asInstanceOf[js.Any])
    
    inline def setDeviceModelUserSet(value: Boolean): Self = StObject.set(x, "DeviceModelUserSet", value.asInstanceOf[js.Any])
    
    inline def setDeviceType(value: String): Self = StObject.set(x, "DeviceType", value.asInstanceOf[js.Any])
    
    inline def setDeviceTypeName(value: String): Self = StObject.set(x, "DeviceTypeName", value.asInstanceOf[js.Any])
    
    inline def setDeviceTypeNameV2(value: String): Self = StObject.set(x, "DeviceTypeNameV2", value.asInstanceOf[js.Any])
    
    inline def setDeviceTypeUserSet(value: Boolean): Self = StObject.set(x, "DeviceTypeUserSet", value.asInstanceOf[js.Any])
    
    inline def setDeviceTypeV2(value: String): Self = StObject.set(x, "DeviceTypeV2", value.asInstanceOf[js.Any])
    
    inline def setDownload(value: String): Self = StObject.set(x, "Download", value.asInstanceOf[js.Any])
    
    inline def setGrouping(value: String): Self = StObject.set(x, "Grouping", value.asInstanceOf[js.Any])
    
    inline def setIP(value: String): Self = StObject.set(x, "IP", value.asInstanceOf[js.Any])
    
    inline def setLinkspeed(value: Double): Self = StObject.set(x, "Linkspeed", value.asInstanceOf[js.Any])
    
    inline def setMAC(value: String): Self = StObject.set(x, "MAC", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNameUserSet(value: String): Self = StObject.set(x, "NameUserSet", value.asInstanceOf[js.Any])
    
    inline def setQosPriority(value: String): Self = StObject.set(x, "QosPriority", value.asInstanceOf[js.Any])
    
    inline def setSSID(value: String): Self = StObject.set(x, "SSID", value.asInstanceOf[js.Any])
    
    inline def setSchedule(value: Boolean): Self = StObject.set(x, "Schedule", value.asInstanceOf[js.Any])
    
    inline def setSchedulePeriod(value: Double): Self = StObject.set(x, "SchedulePeriod", value.asInstanceOf[js.Any])
    
    inline def setSignalStrength(value: Double): Self = StObject.set(x, "SignalStrength", value.asInstanceOf[js.Any])
    
    inline def setUpload(value: String): Self = StObject.set(x, "Upload", value.asInstanceOf[js.Any])
  }
}
