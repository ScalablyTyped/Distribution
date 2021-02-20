package typings.maximMazurokGapiClientOsconfig.gapi.client.osconfig

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ProjectsResource extends StObject {
  
  var patchDeployments: PatchDeploymentsResource = js.native
  
  var patchJobs: PatchJobsResource = js.native
}
object ProjectsResource {
  
  @scala.inline
  def apply(patchDeployments: PatchDeploymentsResource, patchJobs: PatchJobsResource): ProjectsResource = {
    val __obj = js.Dynamic.literal(patchDeployments = patchDeployments.asInstanceOf[js.Any], patchJobs = patchJobs.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProjectsResource]
  }
  
  @scala.inline
  implicit class ProjectsResourceMutableBuilder[Self <: ProjectsResource] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPatchDeployments(value: PatchDeploymentsResource): Self = StObject.set(x, "patchDeployments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPatchJobs(value: PatchJobsResource): Self = StObject.set(x, "patchJobs", value.asInstanceOf[js.Any])
  }
}
