package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.OrgsCheckMembershipForUserEndpoint
import typings.octokitTypes.endpointsMod.OrgsCheckMembershipForUserRequestOptions
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParametersOrgsCheckMembershipForUserEndpoint extends js.Object {
  var parameters: OrgsCheckMembershipForUserEndpoint
  var request: OrgsCheckMembershipForUserRequestOptions
  var response: OctokitResponse[_]
}

object ParametersOrgsCheckMembershipForUserEndpoint {
  @scala.inline
  def apply(
    parameters: OrgsCheckMembershipForUserEndpoint,
    request: OrgsCheckMembershipForUserRequestOptions,
    response: OctokitResponse[_]
  ): ParametersOrgsCheckMembershipForUserEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersOrgsCheckMembershipForUserEndpoint]
  }
}

