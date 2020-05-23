package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.OrgsGetMembershipForAuthenticatedUserEndpoint
import typings.octokitTypes.endpointsMod.OrgsGetMembershipForAuthenticatedUserRequestOptions
import typings.octokitTypes.endpointsMod.OrgsGetMembershipForAuthenticatedUserResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParametersOrgsGetMembershipForAuthenticatedUserEndpoint extends js.Object {
  var parameters: OrgsGetMembershipForAuthenticatedUserEndpoint
  var request: OrgsGetMembershipForAuthenticatedUserRequestOptions
  var response: OctokitResponse[OrgsGetMembershipForAuthenticatedUserResponseData]
}

object ParametersOrgsGetMembershipForAuthenticatedUserEndpoint {
  @scala.inline
  def apply(
    parameters: OrgsGetMembershipForAuthenticatedUserEndpoint,
    request: OrgsGetMembershipForAuthenticatedUserRequestOptions,
    response: OctokitResponse[OrgsGetMembershipForAuthenticatedUserResponseData]
  ): ParametersOrgsGetMembershipForAuthenticatedUserEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersOrgsGetMembershipForAuthenticatedUserEndpoint]
  }
}

