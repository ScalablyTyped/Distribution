package typings.maximMazurokGapiClientServicenetworking.gapi.client.servicenetworking

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SecondaryIpRangeSpec extends js.Object {
  
  /**
    * Required. The prefix length of the secondary IP range. Use CIDR range notation, such as `30` to provision a secondary IP range with an `x.x.x.x/30` CIDR range. The IP address range
    * is drawn from a pool of available ranges in the service consumer's allocated range.
    */
  var ipPrefixLength: js.UndefOr[Double] = js.native
  
  /** Required. A name for the secondary IP range. The name must be 1-63 characters long, and comply with RFC1035. The name must be unique within the subnetwork. */
  var rangeName: js.UndefOr[String] = js.native
  
  /**
    * Optional. The starting address of a range. The address must be a valid IPv4 address in the x.x.x.x format. This value combined with the IP prefix range is the CIDR range for the
    * secondary IP range. The range must be within the allocated range that is assigned to the private connection. If the CIDR range isn't available, the call fails.
    */
  var requestedAddress: js.UndefOr[String] = js.native
}
object SecondaryIpRangeSpec {
  
  @scala.inline
  def apply(): SecondaryIpRangeSpec = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SecondaryIpRangeSpec]
  }
  
  @scala.inline
  implicit class SecondaryIpRangeSpecOps[Self <: SecondaryIpRangeSpec] (val x: Self) extends AnyVal {
    
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
    def setIpPrefixLength(value: Double): Self = this.set("ipPrefixLength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIpPrefixLength: Self = this.set("ipPrefixLength", js.undefined)
    
    @scala.inline
    def setRangeName(value: String): Self = this.set("rangeName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRangeName: Self = this.set("rangeName", js.undefined)
    
    @scala.inline
    def setRequestedAddress(value: String): Self = this.set("requestedAddress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRequestedAddress: Self = this.set("requestedAddress", js.undefined)
  }
}
