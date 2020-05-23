package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.ReposUpdateHookEndpoint
import typings.octokitTypes.endpointsMod.ReposUpdateHookRequestOptions
import typings.octokitTypes.endpointsMod.ReposUpdateHookResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParametersReposUpdateHookEndpoint extends js.Object {
  var parameters: ReposUpdateHookEndpoint
  var request: ReposUpdateHookRequestOptions
  var response: OctokitResponse[ReposUpdateHookResponseData]
}

object ParametersReposUpdateHookEndpoint {
  @scala.inline
  def apply(
    parameters: ReposUpdateHookEndpoint,
    request: ReposUpdateHookRequestOptions,
    response: OctokitResponse[ReposUpdateHookResponseData]
  ): ParametersReposUpdateHookEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersReposUpdateHookEndpoint]
  }
}

