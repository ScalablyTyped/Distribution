package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.OrgsSetPublicMembershipForAuthenticatedUserEndpoint
import typings.octokitTypes.endpointsMod.OrgsSetPublicMembershipForAuthenticatedUserRequestOptions
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParametersOrgsSetPublicMembershipForAuthenticatedUserEndpoint extends js.Object {
  var parameters: OrgsSetPublicMembershipForAuthenticatedUserEndpoint
  var request: OrgsSetPublicMembershipForAuthenticatedUserRequestOptions
  var response: OctokitResponse[_]
}

object ParametersOrgsSetPublicMembershipForAuthenticatedUserEndpoint {
  @scala.inline
  def apply(
    parameters: OrgsSetPublicMembershipForAuthenticatedUserEndpoint,
    request: OrgsSetPublicMembershipForAuthenticatedUserRequestOptions,
    response: OctokitResponse[_]
  ): ParametersOrgsSetPublicMembershipForAuthenticatedUserEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersOrgsSetPublicMembershipForAuthenticatedUserEndpoint]
  }
}

