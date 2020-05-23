package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.ReposCreateHookEndpoint
import typings.octokitTypes.endpointsMod.ReposCreateHookRequestOptions
import typings.octokitTypes.endpointsMod.ReposCreateHookResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParametersReposCreateHookEndpoint extends js.Object {
  var parameters: ReposCreateHookEndpoint
  var request: ReposCreateHookRequestOptions
  var response: OctokitResponse[ReposCreateHookResponseData]
}

object ParametersReposCreateHookEndpoint {
  @scala.inline
  def apply(
    parameters: ReposCreateHookEndpoint,
    request: ReposCreateHookRequestOptions,
    response: OctokitResponse[ReposCreateHookResponseData]
  ): ParametersReposCreateHookEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersReposCreateHookEndpoint]
  }
}

