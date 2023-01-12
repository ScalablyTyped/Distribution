package typings.maximMazurokGapiClientServicenetworking.gapi.client.servicenetworking

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AddDnsZoneResponse extends StObject {
  
  /** The DNS peering zone created in the consumer project. */
  var consumerPeeringZone: js.UndefOr[DnsZone] = js.undefined
  
  /** The private DNS zone created in the shared producer host project. */
  var producerPrivateZone: js.UndefOr[DnsZone] = js.undefined
}
object AddDnsZoneResponse {
  
  inline def apply(): AddDnsZoneResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AddDnsZoneResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AddDnsZoneResponse] (val x: Self) extends AnyVal {
    
    inline def setConsumerPeeringZone(value: DnsZone): Self = StObject.set(x, "consumerPeeringZone", value.asInstanceOf[js.Any])
    
    inline def setConsumerPeeringZoneUndefined: Self = StObject.set(x, "consumerPeeringZone", js.undefined)
    
    inline def setProducerPrivateZone(value: DnsZone): Self = StObject.set(x, "producerPrivateZone", value.asInstanceOf[js.Any])
    
    inline def setProducerPrivateZoneUndefined: Self = StObject.set(x, "producerPrivateZone", js.undefined)
  }
}
