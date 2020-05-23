package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.OrgsAddOrUpdateMembershipEndpoint
import typings.octokitTypes.endpointsMod.OrgsAddOrUpdateMembershipRequestOptions
import typings.octokitTypes.endpointsMod.OrgsAddOrUpdateMembershipResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParametersOrgsAddOrUpdateMembershipEndpoint extends js.Object {
  var parameters: OrgsAddOrUpdateMembershipEndpoint
  var request: OrgsAddOrUpdateMembershipRequestOptions
  var response: OctokitResponse[OrgsAddOrUpdateMembershipResponseData]
}

object ParametersOrgsAddOrUpdateMembershipEndpoint {
  @scala.inline
  def apply(
    parameters: OrgsAddOrUpdateMembershipEndpoint,
    request: OrgsAddOrUpdateMembershipRequestOptions,
    response: OctokitResponse[OrgsAddOrUpdateMembershipResponseData]
  ): ParametersOrgsAddOrUpdateMembershipEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersOrgsAddOrUpdateMembershipEndpoint]
  }
}

