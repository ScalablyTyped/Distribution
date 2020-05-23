package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.ReposDeleteInvitationEndpoint
import typings.octokitTypes.endpointsMod.ReposDeleteInvitationRequestOptions
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParametersReposDeleteInvitationEndpoint extends js.Object {
  var parameters: ReposDeleteInvitationEndpoint
  var request: ReposDeleteInvitationRequestOptions
  var response: OctokitResponse[_]
}

object ParametersReposDeleteInvitationEndpoint {
  @scala.inline
  def apply(
    parameters: ReposDeleteInvitationEndpoint,
    request: ReposDeleteInvitationRequestOptions,
    response: OctokitResponse[_]
  ): ParametersReposDeleteInvitationEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersReposDeleteInvitationEndpoint]
  }
}

