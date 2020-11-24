package typings.maximMazurokGapiClientOsconfig.gapi.client.osconfig

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ProjectsResource extends js.Object {
  
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
  implicit class ProjectsResourceOps[Self <: ProjectsResource] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setPatchDeployments(value: PatchDeploymentsResource): Self = this.set("patchDeployments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPatchJobs(value: PatchJobsResource): Self = this.set("patchJobs", value.asInstanceOf[js.Any])
  }
}
