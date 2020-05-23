package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.OrgsUpdateMembershipEndpoint
import typings.octokitTypes.endpointsMod.OrgsUpdateMembershipRequestOptions
import typings.octokitTypes.endpointsMod.OrgsUpdateMembershipResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParametersOrgsUpdateMembershipEndpoint extends js.Object {
  var parameters: OrgsUpdateMembershipEndpoint
  var request: OrgsUpdateMembershipRequestOptions
  var response: OctokitResponse[OrgsUpdateMembershipResponseData]
}

object ParametersOrgsUpdateMembershipEndpoint {
  @scala.inline
  def apply(
    parameters: OrgsUpdateMembershipEndpoint,
    request: OrgsUpdateMembershipRequestOptions,
    response: OctokitResponse[OrgsUpdateMembershipResponseData]
  ): ParametersOrgsUpdateMembershipEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersOrgsUpdateMembershipEndpoint]
  }
}

