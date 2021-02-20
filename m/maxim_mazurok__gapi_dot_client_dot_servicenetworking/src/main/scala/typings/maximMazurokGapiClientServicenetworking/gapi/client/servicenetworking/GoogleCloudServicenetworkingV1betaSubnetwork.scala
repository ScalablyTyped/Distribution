package typings.maximMazurokGapiClientServicenetworking.gapi.client.servicenetworking

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleCloudServicenetworkingV1betaSubnetwork extends StObject {
  
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
  implicit class GoogleCloudServicenetworkingV1betaSubnetworkMutableBuilder[Self <: GoogleCloudServicenetworkingV1betaSubnetwork] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIpCidrRange(value: String): Self = StObject.set(x, "ipCidrRange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIpCidrRangeUndefined: Self = StObject.set(x, "ipCidrRange", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setNetwork(value: String): Self = StObject.set(x, "network", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNetworkUndefined: Self = StObject.set(x, "network", js.undefined)
    
    @scala.inline
    def setOutsideAllocation(value: Boolean): Self = StObject.set(x, "outsideAllocation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutsideAllocationUndefined: Self = StObject.set(x, "outsideAllocation", js.undefined)
  }
}
