package typings.maximMazurokGapiClientServicenetworking.gapi.client.servicenetworking

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateDnsRecordSetRequest extends js.Object {
  
  /**
    * Required. The network that the consumer is using to connect with services. Must be in the form of projects/{project}/global/networks/{network} {project} is the project number, as in
    * '12345' {network} is the network name.
    */
  var consumerNetwork: js.UndefOr[String] = js.native
  
  /** Required. The existing DNS record set to update. */
  var existingDnsRecordSet: js.UndefOr[DnsRecordSet] = js.native
  
  /** Required. The new values that the DNS record set should be updated to hold. */
  var newDnsRecordSet: js.UndefOr[DnsRecordSet] = js.native
  
  /** Required. The name of the private DNS zone in the shared producer host project from which the record set will be removed. */
  var zone: js.UndefOr[String] = js.native
}
object UpdateDnsRecordSetRequest {
  
  @scala.inline
  def apply(): UpdateDnsRecordSetRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateDnsRecordSetRequest]
  }
  
  @scala.inline
  implicit class UpdateDnsRecordSetRequestOps[Self <: UpdateDnsRecordSetRequest] (val x: Self) extends AnyVal {
    
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
    def setConsumerNetwork(value: String): Self = this.set("consumerNetwork", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConsumerNetwork: Self = this.set("consumerNetwork", js.undefined)
    
    @scala.inline
    def setExistingDnsRecordSet(value: DnsRecordSet): Self = this.set("existingDnsRecordSet", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExistingDnsRecordSet: Self = this.set("existingDnsRecordSet", js.undefined)
    
    @scala.inline
    def setNewDnsRecordSet(value: DnsRecordSet): Self = this.set("newDnsRecordSet", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNewDnsRecordSet: Self = this.set("newDnsRecordSet", js.undefined)
    
    @scala.inline
    def setZone(value: String): Self = this.set("zone", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteZone: Self = this.set("zone", js.undefined)
  }
}
