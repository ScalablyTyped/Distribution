package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.OrgsCheckPublicMembershipForUserEndpoint
import typings.octokitTypes.endpointsMod.OrgsCheckPublicMembershipForUserRequestOptions
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParametersOrgsCheckPublicMembershipForUserEndpoint extends js.Object {
  var parameters: OrgsCheckPublicMembershipForUserEndpoint
  var request: OrgsCheckPublicMembershipForUserRequestOptions
  var response: OctokitResponse[_]
}

object ParametersOrgsCheckPublicMembershipForUserEndpoint {
  @scala.inline
  def apply(
    parameters: OrgsCheckPublicMembershipForUserEndpoint,
    request: OrgsCheckPublicMembershipForUserRequestOptions,
    response: OctokitResponse[_]
  ): ParametersOrgsCheckPublicMembershipForUserEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersOrgsCheckPublicMembershipForUserEndpoint]
  }
}

