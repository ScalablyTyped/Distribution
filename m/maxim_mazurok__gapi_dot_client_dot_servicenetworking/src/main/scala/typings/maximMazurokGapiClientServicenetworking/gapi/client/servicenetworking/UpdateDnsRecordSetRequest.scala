package typings.maximMazurokGapiClientServicenetworking.gapi.client.servicenetworking

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateDnsRecordSetRequest extends StObject {
  
  /**
    * Required. The network that the consumer is using to connect with services. Must be in the form of projects/{project}/global/networks/{network} {project} is the project number, as in
    * '12345' {network} is the network name.
    */
  var consumerNetwork: js.UndefOr[String] = js.undefined
  
  /** Required. The existing DNS record set to update. */
  var existingDnsRecordSet: js.UndefOr[DnsRecordSet] = js.undefined
  
  /** Required. The new values that the DNS record set should be updated to hold. */
  var newDnsRecordSet: js.UndefOr[DnsRecordSet] = js.undefined
  
  /** Required. The name of the private DNS zone in the shared producer host project from which the record set will be removed. */
  var zone: js.UndefOr[String] = js.undefined
}
object UpdateDnsRecordSetRequest {
  
  inline def apply(): UpdateDnsRecordSetRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateDnsRecordSetRequest]
  }
  
  extension [Self <: UpdateDnsRecordSetRequest](x: Self) {
    
    inline def setConsumerNetwork(value: String): Self = StObject.set(x, "consumerNetwork", value.asInstanceOf[js.Any])
    
    inline def setConsumerNetworkUndefined: Self = StObject.set(x, "consumerNetwork", js.undefined)
    
    inline def setExistingDnsRecordSet(value: DnsRecordSet): Self = StObject.set(x, "existingDnsRecordSet", value.asInstanceOf[js.Any])
    
    inline def setExistingDnsRecordSetUndefined: Self = StObject.set(x, "existingDnsRecordSet", js.undefined)
    
    inline def setNewDnsRecordSet(value: DnsRecordSet): Self = StObject.set(x, "newDnsRecordSet", value.asInstanceOf[js.Any])
    
    inline def setNewDnsRecordSetUndefined: Self = StObject.set(x, "newDnsRecordSet", js.undefined)
    
    inline def setZone(value: String): Self = StObject.set(x, "zone", value.asInstanceOf[js.Any])
    
    inline def setZoneUndefined: Self = StObject.set(x, "zone", js.undefined)
  }
}
