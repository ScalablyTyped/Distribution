package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.OrgsRemoveOutsideCollaboratorEndpoint
import typings.octokitTypes.endpointsMod.OrgsRemoveOutsideCollaboratorRequestOptions
import typings.octokitTypes.endpointsMod.OrgsRemoveOutsideCollaboratorResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParametersOrgsRemoveOutsideCollaboratorEndpoint extends js.Object {
  var parameters: OrgsRemoveOutsideCollaboratorEndpoint
  var request: OrgsRemoveOutsideCollaboratorRequestOptions
  var response: OctokitResponse[OrgsRemoveOutsideCollaboratorResponseData]
}

object ParametersOrgsRemoveOutsideCollaboratorEndpoint {
  @scala.inline
  def apply(
    parameters: OrgsRemoveOutsideCollaboratorEndpoint,
    request: OrgsRemoveOutsideCollaboratorRequestOptions,
    response: OctokitResponse[OrgsRemoveOutsideCollaboratorResponseData]
  ): ParametersOrgsRemoveOutsideCollaboratorEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersOrgsRemoveOutsideCollaboratorEndpoint]
  }
}

