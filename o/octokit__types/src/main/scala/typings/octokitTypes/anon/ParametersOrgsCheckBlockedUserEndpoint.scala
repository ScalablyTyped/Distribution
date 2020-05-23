package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.OrgsCheckBlockedUserEndpoint
import typings.octokitTypes.endpointsMod.OrgsCheckBlockedUserRequestOptions
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParametersOrgsCheckBlockedUserEndpoint extends js.Object {
  var parameters: OrgsCheckBlockedUserEndpoint
  var request: OrgsCheckBlockedUserRequestOptions
  var response: OctokitResponse[_]
}

object ParametersOrgsCheckBlockedUserEndpoint {
  @scala.inline
  def apply(
    parameters: OrgsCheckBlockedUserEndpoint,
    request: OrgsCheckBlockedUserRequestOptions,
    response: OctokitResponse[_]
  ): ParametersOrgsCheckBlockedUserEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersOrgsCheckBlockedUserEndpoint]
  }
}

