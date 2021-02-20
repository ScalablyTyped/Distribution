package typings.maximMazurokGapiClientIam.gapi.client.iam

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LocationsResource extends StObject {
  
  var workloadIdentityPools: WorkloadIdentityPoolsResource = js.native
}
object LocationsResource {
  
  @scala.inline
  def apply(workloadIdentityPools: WorkloadIdentityPoolsResource): LocationsResource = {
    val __obj = js.Dynamic.literal(workloadIdentityPools = workloadIdentityPools.asInstanceOf[js.Any])
    __obj.asInstanceOf[LocationsResource]
  }
  
  @scala.inline
  implicit class LocationsResourceMutableBuilder[Self <: LocationsResource] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setWorkloadIdentityPools(value: WorkloadIdentityPoolsResource): Self = StObject.set(x, "workloadIdentityPools", value.asInstanceOf[js.Any])
  }
}
