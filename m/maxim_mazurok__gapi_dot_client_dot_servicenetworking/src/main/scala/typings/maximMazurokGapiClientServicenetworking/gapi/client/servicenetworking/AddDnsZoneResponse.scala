package typings.maximMazurokGapiClientServicenetworking.gapi.client.servicenetworking

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AddDnsZoneResponse extends StObject {
  
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
  implicit class AddDnsZoneResponseMutableBuilder[Self <: AddDnsZoneResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConsumerPeeringZone(value: DnsZone): Self = StObject.set(x, "consumerPeeringZone", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConsumerPeeringZoneUndefined: Self = StObject.set(x, "consumerPeeringZone", js.undefined)
    
    @scala.inline
    def setProducerPrivateZone(value: DnsZone): Self = StObject.set(x, "producerPrivateZone", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProducerPrivateZoneUndefined: Self = StObject.set(x, "producerPrivateZone", js.undefined)
  }
}
