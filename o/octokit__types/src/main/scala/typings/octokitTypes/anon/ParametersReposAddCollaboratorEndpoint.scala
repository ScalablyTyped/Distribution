package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.ReposAddCollaboratorEndpoint
import typings.octokitTypes.endpointsMod.ReposAddCollaboratorRequestOptions
import typings.octokitTypes.endpointsMod.ReposAddCollaboratorResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParametersReposAddCollaboratorEndpoint extends js.Object {
  var parameters: ReposAddCollaboratorEndpoint
  var request: ReposAddCollaboratorRequestOptions
  var response: OctokitResponse[ReposAddCollaboratorResponseData]
}

object ParametersReposAddCollaboratorEndpoint {
  @scala.inline
  def apply(
    parameters: ReposAddCollaboratorEndpoint,
    request: ReposAddCollaboratorRequestOptions,
    response: OctokitResponse[ReposAddCollaboratorResponseData]
  ): ParametersReposAddCollaboratorEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersReposAddCollaboratorEndpoint]
  }
}

