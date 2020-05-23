package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.ReposDeclineInvitationEndpoint
import typings.octokitTypes.endpointsMod.ReposDeclineInvitationRequestOptions
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParametersReposDeclineInvitationEndpoint extends js.Object {
  var parameters: ReposDeclineInvitationEndpoint
  var request: ReposDeclineInvitationRequestOptions
  var response: OctokitResponse[_]
}

object ParametersReposDeclineInvitationEndpoint {
  @scala.inline
  def apply(
    parameters: ReposDeclineInvitationEndpoint,
    request: ReposDeclineInvitationRequestOptions,
    response: OctokitResponse[_]
  ): ParametersReposDeclineInvitationEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersReposDeclineInvitationEndpoint]
  }
}

