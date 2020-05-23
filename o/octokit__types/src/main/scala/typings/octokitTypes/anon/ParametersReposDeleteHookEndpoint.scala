package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.ReposDeleteHookEndpoint
import typings.octokitTypes.endpointsMod.ReposDeleteHookRequestOptions
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParametersReposDeleteHookEndpoint extends js.Object {
  var parameters: ReposDeleteHookEndpoint
  var request: ReposDeleteHookRequestOptions
  var response: OctokitResponse[_]
}

object ParametersReposDeleteHookEndpoint {
  @scala.inline
  def apply(
    parameters: ReposDeleteHookEndpoint,
    request: ReposDeleteHookRequestOptions,
    response: OctokitResponse[_]
  ): ParametersReposDeleteHookEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersReposDeleteHookEndpoint]
  }
}

