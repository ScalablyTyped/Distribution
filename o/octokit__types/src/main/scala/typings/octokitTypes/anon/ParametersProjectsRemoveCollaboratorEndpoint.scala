package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.ProjectsRemoveCollaboratorEndpoint
import typings.octokitTypes.endpointsMod.ProjectsRemoveCollaboratorRequestOptions
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParametersProjectsRemoveCollaboratorEndpoint extends js.Object {
  var parameters: ProjectsRemoveCollaboratorEndpoint = js.native
  var request: ProjectsRemoveCollaboratorRequestOptions = js.native
  var response: OctokitResponse[_] = js.native
}

object ParametersProjectsRemoveCollaboratorEndpoint {
  @scala.inline
  def apply(
    parameters: ProjectsRemoveCollaboratorEndpoint,
    request: ProjectsRemoveCollaboratorRequestOptions,
    response: OctokitResponse[_]
  ): ParametersProjectsRemoveCollaboratorEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersProjectsRemoveCollaboratorEndpoint]
  }
  @scala.inline
  implicit class ParametersProjectsRemoveCollaboratorEndpointOps[Self <: ParametersProjectsRemoveCollaboratorEndpoint] (val x: Self) extends AnyVal {
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
    def setParameters(value: ProjectsRemoveCollaboratorEndpoint): Self = this.set("parameters", value.asInstanceOf[js.Any])
    @scala.inline
    def setRequest(value: ProjectsRemoveCollaboratorRequestOptions): Self = this.set("request", value.asInstanceOf[js.Any])
    @scala.inline
    def setResponse(value: OctokitResponse[_]): Self = this.set("response", value.asInstanceOf[js.Any])
  }
  
}

