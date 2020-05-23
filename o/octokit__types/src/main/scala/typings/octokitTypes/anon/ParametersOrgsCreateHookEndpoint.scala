package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.OrgsCreateHookEndpoint
import typings.octokitTypes.endpointsMod.OrgsCreateHookRequestOptions
import typings.octokitTypes.endpointsMod.OrgsCreateHookResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParametersOrgsCreateHookEndpoint extends js.Object {
  var parameters: OrgsCreateHookEndpoint
  var request: OrgsCreateHookRequestOptions
  var response: OctokitResponse[OrgsCreateHookResponseData]
}

object ParametersOrgsCreateHookEndpoint {
  @scala.inline
  def apply(
    parameters: OrgsCreateHookEndpoint,
    request: OrgsCreateHookRequestOptions,
    response: OctokitResponse[OrgsCreateHookResponseData]
  ): ParametersOrgsCreateHookEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersOrgsCreateHookEndpoint]
  }
}

