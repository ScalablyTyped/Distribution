package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.OrgsCreateInvitationEndpoint
import typings.octokitTypes.endpointsMod.OrgsCreateInvitationRequestOptions
import typings.octokitTypes.endpointsMod.OrgsCreateInvitationResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParametersOrgsCreateInvitationEndpoint extends js.Object {
  var parameters: OrgsCreateInvitationEndpoint
  var request: OrgsCreateInvitationRequestOptions
  var response: OctokitResponse[OrgsCreateInvitationResponseData]
}

object ParametersOrgsCreateInvitationEndpoint {
  @scala.inline
  def apply(
    parameters: OrgsCreateInvitationEndpoint,
    request: OrgsCreateInvitationRequestOptions,
    response: OctokitResponse[OrgsCreateInvitationResponseData]
  ): ParametersOrgsCreateInvitationEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersOrgsCreateInvitationEndpoint]
  }
}

