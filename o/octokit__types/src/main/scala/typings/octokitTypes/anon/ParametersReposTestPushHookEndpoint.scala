package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.ReposTestPushHookEndpoint
import typings.octokitTypes.endpointsMod.ReposTestPushHookRequestOptions
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParametersReposTestPushHookEndpoint extends js.Object {
  var parameters: ReposTestPushHookEndpoint
  var request: ReposTestPushHookRequestOptions
  var response: OctokitResponse[_]
}

object ParametersReposTestPushHookEndpoint {
  @scala.inline
  def apply(
    parameters: ReposTestPushHookEndpoint,
    request: ReposTestPushHookRequestOptions,
    response: OctokitResponse[_]
  ): ParametersReposTestPushHookEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersReposTestPushHookEndpoint]
  }
}

