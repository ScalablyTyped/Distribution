package typings.netgear.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LANConfig extends StObject {
  
  var NewDHCPEnabled: String
  
  var NewLANIP: String
  
  var NewLANMACAddress: String
  
  var NewLANSubnet: String
  
  var NewWANLAN_Subnet_Match: String
}
object LANConfig {
  
  inline def apply(
    NewDHCPEnabled: String,
    NewLANIP: String,
    NewLANMACAddress: String,
    NewLANSubnet: String,
    NewWANLAN_Subnet_Match: String
  ): LANConfig = {
    val __obj = js.Dynamic.literal(NewDHCPEnabled = NewDHCPEnabled.asInstanceOf[js.Any], NewLANIP = NewLANIP.asInstanceOf[js.Any], NewLANMACAddress = NewLANMACAddress.asInstanceOf[js.Any], NewLANSubnet = NewLANSubnet.asInstanceOf[js.Any], NewWANLAN_Subnet_Match = NewWANLAN_Subnet_Match.asInstanceOf[js.Any])
    __obj.asInstanceOf[LANConfig]
  }
  
  extension [Self <: LANConfig](x: Self) {
    
    inline def setNewDHCPEnabled(value: String): Self = StObject.set(x, "NewDHCPEnabled", value.asInstanceOf[js.Any])
    
    inline def setNewLANIP(value: String): Self = StObject.set(x, "NewLANIP", value.asInstanceOf[js.Any])
    
    inline def setNewLANMACAddress(value: String): Self = StObject.set(x, "NewLANMACAddress", value.asInstanceOf[js.Any])
    
    inline def setNewLANSubnet(value: String): Self = StObject.set(x, "NewLANSubnet", value.asInstanceOf[js.Any])
    
    inline def setNewWANLAN_Subnet_Match(value: String): Self = StObject.set(x, "NewWANLAN_Subnet_Match", value.asInstanceOf[js.Any])
  }
}
