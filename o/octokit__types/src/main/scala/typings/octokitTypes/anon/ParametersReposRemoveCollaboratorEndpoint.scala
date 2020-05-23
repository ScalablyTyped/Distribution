package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.ReposRemoveCollaboratorEndpoint
import typings.octokitTypes.endpointsMod.ReposRemoveCollaboratorRequestOptions
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParametersReposRemoveCollaboratorEndpoint extends js.Object {
  var parameters: ReposRemoveCollaboratorEndpoint
  var request: ReposRemoveCollaboratorRequestOptions
  var response: OctokitResponse[_]
}

object ParametersReposRemoveCollaboratorEndpoint {
  @scala.inline
  def apply(
    parameters: ReposRemoveCollaboratorEndpoint,
    request: ReposRemoveCollaboratorRequestOptions,
    response: OctokitResponse[_]
  ): ParametersReposRemoveCollaboratorEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersReposRemoveCollaboratorEndpoint]
  }
}

