package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.OrgsRemoveMembershipForUserEndpoint
import typings.octokitTypes.endpointsMod.OrgsRemoveMembershipForUserRequestOptions
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParametersOrgsRemoveMembershipForUserEndpoint extends js.Object {
  var parameters: OrgsRemoveMembershipForUserEndpoint
  var request: OrgsRemoveMembershipForUserRequestOptions
  var response: OctokitResponse[_]
}

object ParametersOrgsRemoveMembershipForUserEndpoint {
  @scala.inline
  def apply(
    parameters: OrgsRemoveMembershipForUserEndpoint,
    request: OrgsRemoveMembershipForUserRequestOptions,
    response: OctokitResponse[_]
  ): ParametersOrgsRemoveMembershipForUserEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersOrgsRemoveMembershipForUserEndpoint]
  }
}

