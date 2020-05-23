package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.ReposAcceptInvitationEndpoint
import typings.octokitTypes.endpointsMod.ReposAcceptInvitationRequestOptions
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParametersReposAcceptInvitationEndpoint extends js.Object {
  var parameters: ReposAcceptInvitationEndpoint
  var request: ReposAcceptInvitationRequestOptions
  var response: OctokitResponse[_]
}

object ParametersReposAcceptInvitationEndpoint {
  @scala.inline
  def apply(
    parameters: ReposAcceptInvitationEndpoint,
    request: ReposAcceptInvitationRequestOptions,
    response: OctokitResponse[_]
  ): ParametersReposAcceptInvitationEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersReposAcceptInvitationEndpoint]
  }
}

