package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.ProjectsAddCollaboratorEndpoint
import typings.octokitTypes.endpointsMod.ProjectsAddCollaboratorRequestOptions
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersProjectsAddCollaboratorEndpoint extends js.Object {
  
  var parameters: ProjectsAddCollaboratorEndpoint = js.native
  
  var request: ProjectsAddCollaboratorRequestOptions = js.native
  
  var response: OctokitResponse[_] = js.native
}
object ParametersProjectsAddCollaboratorEndpoint {
  
  @scala.inline
  def apply(
    parameters: ProjectsAddCollaboratorEndpoint,
    request: ProjectsAddCollaboratorRequestOptions,
    response: OctokitResponse[_]
  ): ParametersProjectsAddCollaboratorEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersProjectsAddCollaboratorEndpoint]
  }
  
  @scala.inline
  implicit class ParametersProjectsAddCollaboratorEndpointOps[Self <: ParametersProjectsAddCollaboratorEndpoint] (val x: Self) extends AnyVal {
    
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
    def setParameters(value: ProjectsAddCollaboratorEndpoint): Self = this.set("parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: ProjectsAddCollaboratorRequestOptions): Self = this.set("request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[_]): Self = this.set("response", value.asInstanceOf[js.Any])
  }
}
