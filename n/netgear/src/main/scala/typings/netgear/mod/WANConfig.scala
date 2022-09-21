package typings.netgear.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WANConfig extends StObject {
  
  var NewAddressingType: String
  
  var NewConnectionType: String
  
  var NewDNSEnabled: String
  
  var NewDNSServers: String
  
  var NewDefaultGateway: String
  
  var NewEnable: String
  
  var NewExternalIPAddress: String
  
  var NewMACAddress: String
  
  var NewMACAddressOverride: String
  
  var NewMaxMTUSize: String
  
  var NewSubnetMask: String
}
object WANConfig {
  
  inline def apply(
    NewAddressingType: String,
    NewConnectionType: String,
    NewDNSEnabled: String,
    NewDNSServers: String,
    NewDefaultGateway: String,
    NewEnable: String,
    NewExternalIPAddress: String,
    NewMACAddress: String,
    NewMACAddressOverride: String,
    NewMaxMTUSize: String,
    NewSubnetMask: String
  ): WANConfig = {
    val __obj = js.Dynamic.literal(NewAddressingType = NewAddressingType.asInstanceOf[js.Any], NewConnectionType = NewConnectionType.asInstanceOf[js.Any], NewDNSEnabled = NewDNSEnabled.asInstanceOf[js.Any], NewDNSServers = NewDNSServers.asInstanceOf[js.Any], NewDefaultGateway = NewDefaultGateway.asInstanceOf[js.Any], NewEnable = NewEnable.asInstanceOf[js.Any], NewExternalIPAddress = NewExternalIPAddress.asInstanceOf[js.Any], NewMACAddress = NewMACAddress.asInstanceOf[js.Any], NewMACAddressOverride = NewMACAddressOverride.asInstanceOf[js.Any], NewMaxMTUSize = NewMaxMTUSize.asInstanceOf[js.Any], NewSubnetMask = NewSubnetMask.asInstanceOf[js.Any])
    __obj.asInstanceOf[WANConfig]
  }
  
  extension [Self <: WANConfig](x: Self) {
    
    inline def setNewAddressingType(value: String): Self = StObject.set(x, "NewAddressingType", value.asInstanceOf[js.Any])
    
    inline def setNewConnectionType(value: String): Self = StObject.set(x, "NewConnectionType", value.asInstanceOf[js.Any])
    
    inline def setNewDNSEnabled(value: String): Self = StObject.set(x, "NewDNSEnabled", value.asInstanceOf[js.Any])
    
    inline def setNewDNSServers(value: String): Self = StObject.set(x, "NewDNSServers", value.asInstanceOf[js.Any])
    
    inline def setNewDefaultGateway(value: String): Self = StObject.set(x, "NewDefaultGateway", value.asInstanceOf[js.Any])
    
    inline def setNewEnable(value: String): Self = StObject.set(x, "NewEnable", value.asInstanceOf[js.Any])
    
    inline def setNewExternalIPAddress(value: String): Self = StObject.set(x, "NewExternalIPAddress", value.asInstanceOf[js.Any])
    
    inline def setNewMACAddress(value: String): Self = StObject.set(x, "NewMACAddress", value.asInstanceOf[js.Any])
    
    inline def setNewMACAddressOverride(value: String): Self = StObject.set(x, "NewMACAddressOverride", value.asInstanceOf[js.Any])
    
    inline def setNewMaxMTUSize(value: String): Self = StObject.set(x, "NewMaxMTUSize", value.asInstanceOf[js.Any])
    
    inline def setNewSubnetMask(value: String): Self = StObject.set(x, "NewSubnetMask", value.asInstanceOf[js.Any])
  }
}
