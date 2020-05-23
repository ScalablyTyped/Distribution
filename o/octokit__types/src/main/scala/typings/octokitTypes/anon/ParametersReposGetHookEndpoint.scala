package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.ReposGetHookEndpoint
import typings.octokitTypes.endpointsMod.ReposGetHookRequestOptions
import typings.octokitTypes.endpointsMod.ReposGetHookResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParametersReposGetHookEndpoint extends js.Object {
  var parameters: ReposGetHookEndpoint
  var request: ReposGetHookRequestOptions
  var response: OctokitResponse[ReposGetHookResponseData]
}

object ParametersReposGetHookEndpoint {
  @scala.inline
  def apply(
    parameters: ReposGetHookEndpoint,
    request: ReposGetHookRequestOptions,
    response: OctokitResponse[ReposGetHookResponseData]
  ): ParametersReposGetHookEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersReposGetHookEndpoint]
  }
}

