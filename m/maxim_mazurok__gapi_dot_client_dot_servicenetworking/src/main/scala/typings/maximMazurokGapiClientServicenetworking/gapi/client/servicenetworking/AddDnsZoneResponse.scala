package typings.maximMazurokGapiClientServicenetworking.gapi.client.servicenetworking

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AddDnsZoneResponse extends js.Object {
  
  /** The DNS peering zone created in the consumer project. */
  var consumerPeeringZone: js.UndefOr[DnsZone] = js.native
  
  /** The private DNS zone created in the shared producer host project. */
  var producerPrivateZone: js.UndefOr[DnsZone] = js.native
}
object AddDnsZoneResponse {
  
  @scala.inline
  def apply(): AddDnsZoneResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AddDnsZoneResponse]
  }
  
  @scala.inline
  implicit class AddDnsZoneResponseOps[Self <: AddDnsZoneResponse] (val x: Self) extends AnyVal {
    
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
    def setConsumerPeeringZone(value: DnsZone): Self = this.set("consumerPeeringZone", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConsumerPeeringZone: Self = this.set("consumerPeeringZone", js.undefined)
    
    @scala.inline
    def setProducerPrivateZone(value: DnsZone): Self = this.set("producerPrivateZone", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProducerPrivateZone: Self = this.set("producerPrivateZone", js.undefined)
  }
}
