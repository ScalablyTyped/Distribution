package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.OrgsRemoveMembershipEndpoint
import typings.octokitTypes.endpointsMod.OrgsRemoveMembershipRequestOptions
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParametersOrgsRemoveMembershipEndpoint extends js.Object {
  var parameters: OrgsRemoveMembershipEndpoint
  var request: OrgsRemoveMembershipRequestOptions
  var response: OctokitResponse[_]
}

object ParametersOrgsRemoveMembershipEndpoint {
  @scala.inline
  def apply(
    parameters: OrgsRemoveMembershipEndpoint,
    request: OrgsRemoveMembershipRequestOptions,
    response: OctokitResponse[_]
  ): ParametersOrgsRemoveMembershipEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersOrgsRemoveMembershipEndpoint]
  }
}

