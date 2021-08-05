package typings.maximMazurokGapiClientIam.gapi.client.iam

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LocationsResource extends StObject {
  
  var workloadIdentityPools: WorkloadIdentityPoolsResource
}
object LocationsResource {
  
  inline def apply(workloadIdentityPools: WorkloadIdentityPoolsResource): LocationsResource = {
    val __obj = js.Dynamic.literal(workloadIdentityPools = workloadIdentityPools.asInstanceOf[js.Any])
    __obj.asInstanceOf[LocationsResource]
  }
  
  extension [Self <: LocationsResource](x: Self) {
    
    inline def setWorkloadIdentityPools(value: WorkloadIdentityPoolsResource): Self = StObject.set(x, "workloadIdentityPools", value.asInstanceOf[js.Any])
  }
}
