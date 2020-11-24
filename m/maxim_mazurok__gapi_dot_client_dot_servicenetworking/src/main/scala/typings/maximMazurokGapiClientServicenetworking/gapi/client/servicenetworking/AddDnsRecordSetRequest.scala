package typings.maximMazurokGapiClientServicenetworking.gapi.client.servicenetworking

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AddDnsRecordSetRequest extends js.Object {
  
  /**
    * Required. The network that the consumer is using to connect with services. Must be in the form of projects/{project}/global/networks/{network} {project} is the project number, as in
    * '12345' {network} is the network name.
    */
  var consumerNetwork: js.UndefOr[String] = js.native
  
  /** Required. The DNS record set to add. */
  var dnsRecordSet: js.UndefOr[DnsRecordSet] = js.native
  
  /** Required. The name of the private DNS zone in the shared producer host project to which the record set will be added. */
  var zone: js.UndefOr[String] = js.native
}
object AddDnsRecordSetRequest {
  
  @scala.inline
  def apply(): AddDnsRecordSetRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AddDnsRecordSetRequest]
  }
  
  @scala.inline
  implicit class AddDnsRecordSetRequestOps[Self <: AddDnsRecordSetRequest] (val x: Self) extends AnyVal {
    
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
    def setDnsRecordSet(value: DnsRecordSet): Self = this.set("dnsRecordSet", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDnsRecordSet: Self = this.set("dnsRecordSet", js.undefined)
    
    @scala.inline
    def setZone(value: String): Self = this.set("zone", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteZone: Self = this.set("zone", js.undefined)
  }
}
