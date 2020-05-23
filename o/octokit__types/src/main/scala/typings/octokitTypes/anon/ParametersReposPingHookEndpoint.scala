package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.ReposPingHookEndpoint
import typings.octokitTypes.endpointsMod.ReposPingHookRequestOptions
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParametersReposPingHookEndpoint extends js.Object {
  var parameters: ReposPingHookEndpoint
  var request: ReposPingHookRequestOptions
  var response: OctokitResponse[_]
}

object ParametersReposPingHookEndpoint {
  @scala.inline
  def apply(
    parameters: ReposPingHookEndpoint,
    request: ReposPingHookRequestOptions,
    response: OctokitResponse[_]
  ): ParametersReposPingHookEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersReposPingHookEndpoint]
  }
}

