package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.OrgsCheckMembershipEndpoint
import typings.octokitTypes.endpointsMod.OrgsCheckMembershipRequestOptions
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParametersOrgsCheckMembershipEndpoint extends js.Object {
  var parameters: OrgsCheckMembershipEndpoint
  var request: OrgsCheckMembershipRequestOptions
  var response: OctokitResponse[_]
}

object ParametersOrgsCheckMembershipEndpoint {
  @scala.inline
  def apply(
    parameters: OrgsCheckMembershipEndpoint,
    request: OrgsCheckMembershipRequestOptions,
    response: OctokitResponse[_]
  ): ParametersOrgsCheckMembershipEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersOrgsCheckMembershipEndpoint]
  }
}

