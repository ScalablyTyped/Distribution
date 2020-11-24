package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.ProjectsCreateForRepoEndpoint
import typings.octokitTypes.endpointsMod.ProjectsCreateForRepoRequestOptions
import typings.octokitTypes.endpointsMod.ProjectsCreateForRepoResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersProjectsCreateForRepoEndpoint extends js.Object {
  
  var parameters: ProjectsCreateForRepoEndpoint = js.native
  
  var request: ProjectsCreateForRepoRequestOptions = js.native
  
  var response: OctokitResponse[ProjectsCreateForRepoResponseData] = js.native
}
object ParametersProjectsCreateForRepoEndpoint {
  
  @scala.inline
  def apply(
    parameters: ProjectsCreateForRepoEndpoint,
    request: ProjectsCreateForRepoRequestOptions,
    response: OctokitResponse[ProjectsCreateForRepoResponseData]
  ): ParametersProjectsCreateForRepoEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersProjectsCreateForRepoEndpoint]
  }
  
  @scala.inline
  implicit class ParametersProjectsCreateForRepoEndpointOps[Self <: ParametersProjectsCreateForRepoEndpoint] (val x: Self) extends AnyVal {
    
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
    def setParameters(value: ProjectsCreateForRepoEndpoint): Self = this.set("parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: ProjectsCreateForRepoRequestOptions): Self = this.set("request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[ProjectsCreateForRepoResponseData]): Self = this.set("response", value.asInstanceOf[js.Any])
  }
}
