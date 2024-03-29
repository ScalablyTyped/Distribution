package typings.maximMazurokGapiClientServicenetworking.gapi.client.servicenetworking

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AddDnsRecordSetRequest extends StObject {
  
  /**
    * Required. The network that the consumer is using to connect with services. Must be in the form of projects/{project}/global/networks/{network} {project} is the project number, as in
    * '12345' {network} is the network name.
    */
  var consumerNetwork: js.UndefOr[String] = js.undefined
  
  /** Required. The DNS record set to add. */
  var dnsRecordSet: js.UndefOr[DnsRecordSet] = js.undefined
  
  /** Required. The name of the private DNS zone in the shared producer host project to which the record set will be added. */
  var zone: js.UndefOr[String] = js.undefined
}
object AddDnsRecordSetRequest {
  
  inline def apply(): AddDnsRecordSetRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AddDnsRecordSetRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AddDnsRecordSetRequest] (val x: Self) extends AnyVal {
    
    inline def setConsumerNetwork(value: String): Self = StObject.set(x, "consumerNetwork", value.asInstanceOf[js.Any])
    
    inline def setConsumerNetworkUndefined: Self = StObject.set(x, "consumerNetwork", js.undefined)
    
    inline def setDnsRecordSet(value: DnsRecordSet): Self = StObject.set(x, "dnsRecordSet", value.asInstanceOf[js.Any])
    
    inline def setDnsRecordSetUndefined: Self = StObject.set(x, "dnsRecordSet", js.undefined)
    
    inline def setZone(value: String): Self = StObject.set(x, "zone", value.asInstanceOf[js.Any])
    
    inline def setZoneUndefined: Self = StObject.set(x, "zone", js.undefined)
  }
}
