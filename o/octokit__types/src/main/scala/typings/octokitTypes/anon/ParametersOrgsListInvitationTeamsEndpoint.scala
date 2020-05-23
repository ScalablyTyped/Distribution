package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.OrgsListInvitationTeamsEndpoint
import typings.octokitTypes.endpointsMod.OrgsListInvitationTeamsRequestOptions
import typings.octokitTypes.endpointsMod.OrgsListInvitationTeamsResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParametersOrgsListInvitationTeamsEndpoint extends js.Object {
  var parameters: OrgsListInvitationTeamsEndpoint
  var request: OrgsListInvitationTeamsRequestOptions
  var response: OctokitResponse[OrgsListInvitationTeamsResponseData]
}

object ParametersOrgsListInvitationTeamsEndpoint {
  @scala.inline
  def apply(
    parameters: OrgsListInvitationTeamsEndpoint,
    request: OrgsListInvitationTeamsRequestOptions,
    response: OctokitResponse[OrgsListInvitationTeamsResponseData]
  ): ParametersOrgsListInvitationTeamsEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersOrgsListInvitationTeamsEndpoint]
  }
}

