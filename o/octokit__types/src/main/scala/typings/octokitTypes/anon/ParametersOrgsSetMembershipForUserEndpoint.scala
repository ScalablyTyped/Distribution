package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.OrgsSetMembershipForUserEndpoint
import typings.octokitTypes.endpointsMod.OrgsSetMembershipForUserRequestOptions
import typings.octokitTypes.endpointsMod.OrgsSetMembershipForUserResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParametersOrgsSetMembershipForUserEndpoint extends js.Object {
  var parameters: OrgsSetMembershipForUserEndpoint
  var request: OrgsSetMembershipForUserRequestOptions
  var response: OctokitResponse[OrgsSetMembershipForUserResponseData]
}

object ParametersOrgsSetMembershipForUserEndpoint {
  @scala.inline
  def apply(
    parameters: OrgsSetMembershipForUserEndpoint,
    request: OrgsSetMembershipForUserRequestOptions,
    response: OctokitResponse[OrgsSetMembershipForUserResponseData]
  ): ParametersOrgsSetMembershipForUserEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersOrgsSetMembershipForUserEndpoint]
  }
}

