package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.OrgsUpdateMembershipForAuthenticatedUserEndpoint
import typings.octokitTypes.endpointsMod.OrgsUpdateMembershipForAuthenticatedUserRequestOptions
import typings.octokitTypes.endpointsMod.OrgsUpdateMembershipForAuthenticatedUserResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParametersOrgsUpdateMembershipForAuthenticatedUserEndpoint extends js.Object {
  var parameters: OrgsUpdateMembershipForAuthenticatedUserEndpoint
  var request: OrgsUpdateMembershipForAuthenticatedUserRequestOptions
  var response: OctokitResponse[OrgsUpdateMembershipForAuthenticatedUserResponseData]
}

object ParametersOrgsUpdateMembershipForAuthenticatedUserEndpoint {
  @scala.inline
  def apply(
    parameters: OrgsUpdateMembershipForAuthenticatedUserEndpoint,
    request: OrgsUpdateMembershipForAuthenticatedUserRequestOptions,
    response: OctokitResponse[OrgsUpdateMembershipForAuthenticatedUserResponseData]
  ): ParametersOrgsUpdateMembershipForAuthenticatedUserEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersOrgsUpdateMembershipForAuthenticatedUserEndpoint]
  }
}

