package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.ReposCheckCollaboratorEndpoint
import typings.octokitTypes.endpointsMod.ReposCheckCollaboratorRequestOptions
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParametersReposCheckCollaboratorEndpoint extends js.Object {
  var parameters: ReposCheckCollaboratorEndpoint
  var request: ReposCheckCollaboratorRequestOptions
  var response: OctokitResponse[_]
}

object ParametersReposCheckCollaboratorEndpoint {
  @scala.inline
  def apply(
    parameters: ReposCheckCollaboratorEndpoint,
    request: ReposCheckCollaboratorRequestOptions,
    response: OctokitResponse[_]
  ): ParametersReposCheckCollaboratorEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersReposCheckCollaboratorEndpoint]
  }
}

