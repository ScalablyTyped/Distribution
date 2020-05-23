package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.OrgsCheckPublicMembershipEndpoint
import typings.octokitTypes.endpointsMod.OrgsCheckPublicMembershipRequestOptions
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParametersOrgsCheckPublicMembershipEndpoint extends js.Object {
  var parameters: OrgsCheckPublicMembershipEndpoint
  var request: OrgsCheckPublicMembershipRequestOptions
  var response: OctokitResponse[_]
}

object ParametersOrgsCheckPublicMembershipEndpoint {
  @scala.inline
  def apply(
    parameters: OrgsCheckPublicMembershipEndpoint,
    request: OrgsCheckPublicMembershipRequestOptions,
    response: OctokitResponse[_]
  ): ParametersOrgsCheckPublicMembershipEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersOrgsCheckPublicMembershipEndpoint]
  }
}

