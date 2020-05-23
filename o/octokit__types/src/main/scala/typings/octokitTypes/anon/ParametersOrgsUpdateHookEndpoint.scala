package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.OrgsUpdateHookEndpoint
import typings.octokitTypes.endpointsMod.OrgsUpdateHookRequestOptions
import typings.octokitTypes.endpointsMod.OrgsUpdateHookResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParametersOrgsUpdateHookEndpoint extends js.Object {
  var parameters: OrgsUpdateHookEndpoint
  var request: OrgsUpdateHookRequestOptions
  var response: OctokitResponse[OrgsUpdateHookResponseData]
}

object ParametersOrgsUpdateHookEndpoint {
  @scala.inline
  def apply(
    parameters: OrgsUpdateHookEndpoint,
    request: OrgsUpdateHookRequestOptions,
    response: OctokitResponse[OrgsUpdateHookResponseData]
  ): ParametersOrgsUpdateHookEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersOrgsUpdateHookEndpoint]
  }
}

