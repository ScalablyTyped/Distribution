package typings.maximMazurokGapiClientIam.gapi.client.iam

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LocationsResource extends StObject {
  
  var workforcePools: WorkforcePoolsResource
  
  var workloadIdentityPools: WorkloadIdentityPoolsResource
}
object LocationsResource {
  
  inline def apply(workforcePools: WorkforcePoolsResource, workloadIdentityPools: WorkloadIdentityPoolsResource): LocationsResource = {
    val __obj = js.Dynamic.literal(workforcePools = workforcePools.asInstanceOf[js.Any], workloadIdentityPools = workloadIdentityPools.asInstanceOf[js.Any])
    __obj.asInstanceOf[LocationsResource]
  }
  
  extension [Self <: LocationsResource](x: Self) {
    
    inline def setWorkforcePools(value: WorkforcePoolsResource): Self = StObject.set(x, "workforcePools", value.asInstanceOf[js.Any])
    
    inline def setWorkloadIdentityPools(value: WorkloadIdentityPoolsResource): Self = StObject.set(x, "workloadIdentityPools", value.asInstanceOf[js.Any])
  }
}
