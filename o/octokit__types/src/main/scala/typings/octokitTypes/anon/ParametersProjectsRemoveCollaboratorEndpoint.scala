package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.ProjectsRemoveCollaboratorEndpoint
import typings.octokitTypes.endpointsMod.ProjectsRemoveCollaboratorRequestOptions
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParametersProjectsRemoveCollaboratorEndpoint extends js.Object {
  var parameters: ProjectsRemoveCollaboratorEndpoint
  var request: ProjectsRemoveCollaboratorRequestOptions
  var response: OctokitResponse[_]
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
}

