package typings.maximMazurokGapiClientServicenetworking.gapi.client.servicenetworking

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleCloudServicenetworkingV1ConsumerConfigReservedRange extends js.Object {
  
  /**
    * The starting address of the reserved range. The address must be a valid IPv4 address in the x.x.x.x format. This value combined with the IP prefix length is the CIDR range for the
    * reserved range.
    */
  var address: js.UndefOr[String] = js.native
  
  /** The prefix length of the reserved range. */
  var ipPrefixLength: js.UndefOr[Double] = js.native
  
  /** The name of the reserved range. */
  var name: js.UndefOr[String] = js.native
}
object GoogleCloudServicenetworkingV1ConsumerConfigReservedRange {
  
  @scala.inline
  def apply(): GoogleCloudServicenetworkingV1ConsumerConfigReservedRange = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudServicenetworkingV1ConsumerConfigReservedRange]
  }
  
  @scala.inline
  implicit class GoogleCloudServicenetworkingV1ConsumerConfigReservedRangeOps[Self <: GoogleCloudServicenetworkingV1ConsumerConfigReservedRange] (val x: Self) extends AnyVal {
    
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
    def setAddress(value: String): Self = this.set("address", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAddress: Self = this.set("address", js.undefined)
    
    @scala.inline
    def setIpPrefixLength(value: Double): Self = this.set("ipPrefixLength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIpPrefixLength: Self = this.set("ipPrefixLength", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
  }
}
