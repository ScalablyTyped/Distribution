package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.OrgsUnblockUserEndpoint
import typings.octokitTypes.endpointsMod.OrgsUnblockUserRequestOptions
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParametersOrgsUnblockUserEndpoint extends js.Object {
  var parameters: OrgsUnblockUserEndpoint
  var request: OrgsUnblockUserRequestOptions
  var response: OctokitResponse[_]
}

object ParametersOrgsUnblockUserEndpoint {
  @scala.inline
  def apply(
    parameters: OrgsUnblockUserEndpoint,
    request: OrgsUnblockUserRequestOptions,
    response: OctokitResponse[_]
  ): ParametersOrgsUnblockUserEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersOrgsUnblockUserEndpoint]
  }
}

