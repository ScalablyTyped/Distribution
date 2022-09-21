package typings.maximMazurokGapiClientOsconfig.gapi.client.osconfig

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ProjectsResource extends StObject {
  
  var locations: LocationsResource
  
  var patchDeployments: PatchDeploymentsResource
  
  var patchJobs: PatchJobsResource
}
object ProjectsResource {
  
  inline def apply(
    locations: LocationsResource,
    patchDeployments: PatchDeploymentsResource,
    patchJobs: PatchJobsResource
  ): ProjectsResource = {
    val __obj = js.Dynamic.literal(locations = locations.asInstanceOf[js.Any], patchDeployments = patchDeployments.asInstanceOf[js.Any], patchJobs = patchJobs.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProjectsResource]
  }
  
  extension [Self <: ProjectsResource](x: Self) {
    
    inline def setLocations(value: LocationsResource): Self = StObject.set(x, "locations", value.asInstanceOf[js.Any])
    
    inline def setPatchDeployments(value: PatchDeploymentsResource): Self = StObject.set(x, "patchDeployments", value.asInstanceOf[js.Any])
    
    inline def setPatchJobs(value: PatchJobsResource): Self = StObject.set(x, "patchJobs", value.asInstanceOf[js.Any])
  }
}
