package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.OrgsDeleteHookEndpoint
import typings.octokitTypes.endpointsMod.OrgsDeleteHookRequestOptions
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParametersOrgsDeleteHookEndpoint extends js.Object {
  var parameters: OrgsDeleteHookEndpoint
  var request: OrgsDeleteHookRequestOptions
  var response: OctokitResponse[_]
}

object ParametersOrgsDeleteHookEndpoint {
  @scala.inline
  def apply(
    parameters: OrgsDeleteHookEndpoint,
    request: OrgsDeleteHookRequestOptions,
    response: OctokitResponse[_]
  ): ParametersOrgsDeleteHookEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersOrgsDeleteHookEndpoint]
  }
}

