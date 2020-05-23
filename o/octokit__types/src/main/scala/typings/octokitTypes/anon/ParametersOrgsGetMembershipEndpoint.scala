package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.OrgsGetMembershipEndpoint
import typings.octokitTypes.endpointsMod.OrgsGetMembershipRequestOptions
import typings.octokitTypes.endpointsMod.OrgsGetMembershipResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParametersOrgsGetMembershipEndpoint extends js.Object {
  var parameters: OrgsGetMembershipEndpoint
  var request: OrgsGetMembershipRequestOptions
  var response: OctokitResponse[OrgsGetMembershipResponseData]
}

object ParametersOrgsGetMembershipEndpoint {
  @scala.inline
  def apply(
    parameters: OrgsGetMembershipEndpoint,
    request: OrgsGetMembershipRequestOptions,
    response: OctokitResponse[OrgsGetMembershipResponseData]
  ): ParametersOrgsGetMembershipEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersOrgsGetMembershipEndpoint]
  }
}

