package typings.maximMazurokGapiClientManagedidentities.gapi.client.managedidentities

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GlobalResource extends StObject {
  
  var domains: DomainsResource
  
  var operations: OperationsResource
  
  var peerings: PeeringsResource
}
object GlobalResource {
  
  inline def apply(domains: DomainsResource, operations: OperationsResource, peerings: PeeringsResource): GlobalResource = {
    val __obj = js.Dynamic.literal(domains = domains.asInstanceOf[js.Any], operations = operations.asInstanceOf[js.Any], peerings = peerings.asInstanceOf[js.Any])
    __obj.asInstanceOf[GlobalResource]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GlobalResource] (val x: Self) extends AnyVal {
    
    inline def setDomains(value: DomainsResource): Self = StObject.set(x, "domains", value.asInstanceOf[js.Any])
    
    inline def setOperations(value: OperationsResource): Self = StObject.set(x, "operations", value.asInstanceOf[js.Any])
    
    inline def setPeerings(value: PeeringsResource): Self = StObject.set(x, "peerings", value.asInstanceOf[js.Any])
  }
}
