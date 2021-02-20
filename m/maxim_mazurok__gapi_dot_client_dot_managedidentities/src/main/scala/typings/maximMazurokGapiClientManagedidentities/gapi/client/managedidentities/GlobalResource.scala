package typings.maximMazurokGapiClientManagedidentities.gapi.client.managedidentities

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GlobalResource extends StObject {
  
  var domains: DomainsResource = js.native
  
  var operations: OperationsResource = js.native
}
object GlobalResource {
  
  @scala.inline
  def apply(domains: DomainsResource, operations: OperationsResource): GlobalResource = {
    val __obj = js.Dynamic.literal(domains = domains.asInstanceOf[js.Any], operations = operations.asInstanceOf[js.Any])
    __obj.asInstanceOf[GlobalResource]
  }
  
  @scala.inline
  implicit class GlobalResourceMutableBuilder[Self <: GlobalResource] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDomains(value: DomainsResource): Self = StObject.set(x, "domains", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOperations(value: OperationsResource): Self = StObject.set(x, "operations", value.asInstanceOf[js.Any])
  }
}
