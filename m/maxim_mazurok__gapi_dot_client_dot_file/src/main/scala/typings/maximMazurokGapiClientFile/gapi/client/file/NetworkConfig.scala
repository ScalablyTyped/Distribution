package typings.maximMazurokGapiClientFile.gapi.client.file

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NetworkConfig extends StObject {
  
  /**
    * Output only. IPv4 addresses in the format {octet 1}.{octet 2}.{octet 3}.{octet 4} or IPv6 addresses in the format {block 1}:{block 2}:{block 3}:{block 4}:{block 5}:{block 6}:{block
    * 7}:{block 8}.
    */
  var ipAddresses: js.UndefOr[js.Array[String]] = js.undefined
  
  /** Internet protocol versions for which the instance has IP addresses assigned. For this version, only MODE_IPV4 is supported. */
  var modes: js.UndefOr[js.Array[String]] = js.undefined
  
  /** The name of the Google Compute Engine [VPC network](/compute/docs/networks-and-firewalls#networks) to which the instance is connected. */
  var network: js.UndefOr[String] = js.undefined
  
  /**
    * A /29 CIDR block in one of the [internal IP address ranges](https://www.arin.net/knowledge/address_filters.html) that identifies the range of IP addresses reserved for this
    * instance. For example, 10.0.0.0/29 or 192.168.0.0/29. The range you specify can't overlap with either existing subnets or assigned IP address ranges for other Cloud Filestore
    * instances in the selected VPC network.
    */
  var reservedIpRange: js.UndefOr[String] = js.undefined
}
object NetworkConfig {
  
  inline def apply(): NetworkConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NetworkConfig]
  }
  
  extension [Self <: NetworkConfig](x: Self) {
    
    inline def setIpAddresses(value: js.Array[String]): Self = StObject.set(x, "ipAddresses", value.asInstanceOf[js.Any])
    
    inline def setIpAddressesUndefined: Self = StObject.set(x, "ipAddresses", js.undefined)
    
    inline def setIpAddressesVarargs(value: String*): Self = StObject.set(x, "ipAddresses", js.Array(value :_*))
    
    inline def setModes(value: js.Array[String]): Self = StObject.set(x, "modes", value.asInstanceOf[js.Any])
    
    inline def setModesUndefined: Self = StObject.set(x, "modes", js.undefined)
    
    inline def setModesVarargs(value: String*): Self = StObject.set(x, "modes", js.Array(value :_*))
    
    inline def setNetwork(value: String): Self = StObject.set(x, "network", value.asInstanceOf[js.Any])
    
    inline def setNetworkUndefined: Self = StObject.set(x, "network", js.undefined)
    
    inline def setReservedIpRange(value: String): Self = StObject.set(x, "reservedIpRange", value.asInstanceOf[js.Any])
    
    inline def setReservedIpRangeUndefined: Self = StObject.set(x, "reservedIpRange", js.undefined)
  }
}
