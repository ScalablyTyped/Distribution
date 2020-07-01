package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.OrgsGetMembershipForUserEndpoint
import typings.octokitTypes.endpointsMod.OrgsGetMembershipForUserRequestOptions
import typings.octokitTypes.endpointsMod.OrgsGetMembershipForUserResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParametersOrgsGetMembershipForUserEndpoint extends js.Object {
  var parameters: OrgsGetMembershipForUserEndpoint
  var request: OrgsGetMembershipForUserRequestOptions
  var response: OctokitResponse[OrgsGetMembershipForUserResponseData]
}

object ParametersOrgsGetMembershipForUserEndpoint {
  @scala.inline
  def apply(
    parameters: OrgsGetMembershipForUserEndpoint,
    request: OrgsGetMembershipForUserRequestOptions,
    response: OctokitResponse[OrgsGetMembershipForUserResponseData]
  ): ParametersOrgsGetMembershipForUserEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersOrgsGetMembershipForUserEndpoint]
  }
}

