package typings.maximMazurokGapiClientServicenetworking.gapi.client.servicenetworking

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleCloudServicenetworkingV1betaSubnetwork extends js.Object {
  
  /** Subnetwork CIDR range in `10.x.x.x/y` format. */
  var ipCidrRange: js.UndefOr[String] = js.native
  
  /** Subnetwork name. See https://cloud.google.com/compute/docs/vpc/ */
  var name: js.UndefOr[String] = js.native
  
  /** In the Shared VPC host project, the VPC network that's peered with the consumer network. For example: `projects/1234321/global/networks/host-network` */
  var network: js.UndefOr[String] = js.native
  
  /** This is a discovered subnet that is not within the current consumer allocated ranges. */
  var outsideAllocation: js.UndefOr[Boolean] = js.native
}
object GoogleCloudServicenetworkingV1betaSubnetwork {
  
  @scala.inline
  def apply(): GoogleCloudServicenetworkingV1betaSubnetwork = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudServicenetworkingV1betaSubnetwork]
  }
  
  @scala.inline
  implicit class GoogleCloudServicenetworkingV1betaSubnetworkOps[Self <: GoogleCloudServicenetworkingV1betaSubnetwork] (val x: Self) extends AnyVal {
    
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
    def setIpCidrRange(value: String): Self = this.set("ipCidrRange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIpCidrRange: Self = this.set("ipCidrRange", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setNetwork(value: String): Self = this.set("network", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNetwork: Self = this.set("network", js.undefined)
    
    @scala.inline
    def setOutsideAllocation(value: Boolean): Self = this.set("outsideAllocation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOutsideAllocation: Self = this.set("outsideAllocation", js.undefined)
  }
}
