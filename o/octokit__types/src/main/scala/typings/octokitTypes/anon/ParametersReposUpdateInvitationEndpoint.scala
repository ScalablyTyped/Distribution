package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.ReposUpdateInvitationEndpoint
import typings.octokitTypes.endpointsMod.ReposUpdateInvitationRequestOptions
import typings.octokitTypes.endpointsMod.ReposUpdateInvitationResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParametersReposUpdateInvitationEndpoint extends js.Object {
  var parameters: ReposUpdateInvitationEndpoint
  var request: ReposUpdateInvitationRequestOptions
  var response: OctokitResponse[ReposUpdateInvitationResponseData]
}

object ParametersReposUpdateInvitationEndpoint {
  @scala.inline
  def apply(
    parameters: ReposUpdateInvitationEndpoint,
    request: ReposUpdateInvitationRequestOptions,
    response: OctokitResponse[ReposUpdateInvitationResponseData]
  ): ParametersReposUpdateInvitationEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersReposUpdateInvitationEndpoint]
  }
}

