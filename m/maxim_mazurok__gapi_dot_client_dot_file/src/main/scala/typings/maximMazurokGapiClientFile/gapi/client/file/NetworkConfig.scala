package typings.maximMazurokGapiClientFile.gapi.client.file

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NetworkConfig extends js.Object {
  
  /**
    * Output only. IPv4 addresses in the format {octet 1}.{octet 2}.{octet 3}.{octet 4} or IPv6 addresses in the format {block 1}:{block 2}:{block 3}:{block 4}:{block 5}:{block 6}:{block
    * 7}:{block 8}.
    */
  var ipAddresses: js.UndefOr[js.Array[String]] = js.native
  
  /** Internet protocol versions for which the instance has IP addresses assigned. For this version, only MODE_IPV4 is supported. */
  var modes: js.UndefOr[js.Array[String]] = js.native
  
  /** The name of the Google Compute Engine [VPC network](/compute/docs/networks-and-firewalls#networks) to which the instance is connected. */
  var network: js.UndefOr[String] = js.native
  
  /**
    * A /29 CIDR block in one of the [internal IP address ranges](https://www.arin.net/knowledge/address_filters.html) that identifies the range of IP addresses reserved for this
    * instance. For example, 10.0.0.0/29 or 192.168.0.0/29. The range you specify can't overlap with either existing subnets or assigned IP address ranges for other Cloud Filestore
    * instances in the selected VPC network.
    */
  var reservedIpRange: js.UndefOr[String] = js.native
}
object NetworkConfig {
  
  @scala.inline
  def apply(): NetworkConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NetworkConfig]
  }
  
  @scala.inline
  implicit class NetworkConfigOps[Self <: NetworkConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setIpAddressesVarargs(value: String*): Self = this.set("ipAddresses", js.Array(value :_*))
    
    @scala.inline
    def setIpAddresses(value: js.Array[String]): Self = this.set("ipAddresses", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIpAddresses: Self = this.set("ipAddresses", js.undefined)
    
    @scala.inline
    def setModesVarargs(value: String*): Self = this.set("modes", js.Array(value :_*))
    
    @scala.inline
    def setModes(value: js.Array[String]): Self = this.set("modes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteModes: Self = this.set("modes", js.undefined)
    
    @scala.inline
    def setNetwork(value: String): Self = this.set("network", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNetwork: Self = this.set("network", js.undefined)
    
    @scala.inline
    def setReservedIpRange(value: String): Self = this.set("reservedIpRange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReservedIpRange: Self = this.set("reservedIpRange", js.undefined)
  }
}
