package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.OrgsRemovePublicMembershipForAuthenticatedUserEndpoint
import typings.octokitTypes.endpointsMod.OrgsRemovePublicMembershipForAuthenticatedUserRequestOptions
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParametersOrgsRemovePublicMembershipForAuthenticatedUserEndpoint extends js.Object {
  var parameters: OrgsRemovePublicMembershipForAuthenticatedUserEndpoint
  var request: OrgsRemovePublicMembershipForAuthenticatedUserRequestOptions
  var response: OctokitResponse[_]
}

object ParametersOrgsRemovePublicMembershipForAuthenticatedUserEndpoint {
  @scala.inline
  def apply(
    parameters: OrgsRemovePublicMembershipForAuthenticatedUserEndpoint,
    request: OrgsRemovePublicMembershipForAuthenticatedUserRequestOptions,
    response: OctokitResponse[_]
  ): ParametersOrgsRemovePublicMembershipForAuthenticatedUserEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersOrgsRemovePublicMembershipForAuthenticatedUserEndpoint]
  }
}

