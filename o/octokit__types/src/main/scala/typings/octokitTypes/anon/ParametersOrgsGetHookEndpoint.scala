package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.OrgsGetHookEndpoint
import typings.octokitTypes.endpointsMod.OrgsGetHookRequestOptions
import typings.octokitTypes.endpointsMod.OrgsGetHookResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParametersOrgsGetHookEndpoint extends js.Object {
  var parameters: OrgsGetHookEndpoint
  var request: OrgsGetHookRequestOptions
  var response: OctokitResponse[OrgsGetHookResponseData]
}

object ParametersOrgsGetHookEndpoint {
  @scala.inline
  def apply(
    parameters: OrgsGetHookEndpoint,
    request: OrgsGetHookRequestOptions,
    response: OctokitResponse[OrgsGetHookResponseData]
  ): ParametersOrgsGetHookEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersOrgsGetHookEndpoint]
  }
}

