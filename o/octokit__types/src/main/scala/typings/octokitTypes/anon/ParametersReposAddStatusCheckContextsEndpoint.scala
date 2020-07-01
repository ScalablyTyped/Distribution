package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.ReposAddStatusCheckContextsEndpoint
import typings.octokitTypes.endpointsMod.ReposAddStatusCheckContextsRequestOptions
import typings.octokitTypes.endpointsMod.ReposAddStatusCheckContextsResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParametersReposAddStatusCheckContextsEndpoint extends js.Object {
  var parameters: ReposAddStatusCheckContextsEndpoint
  var request: ReposAddStatusCheckContextsRequestOptions
  var response: OctokitResponse[ReposAddStatusCheckContextsResponseData]
}

object ParametersReposAddStatusCheckContextsEndpoint {
  @scala.inline
  def apply(
    parameters: ReposAddStatusCheckContextsEndpoint,
    request: ReposAddStatusCheckContextsRequestOptions,
    response: OctokitResponse[ReposAddStatusCheckContextsResponseData]
  ): ParametersReposAddStatusCheckContextsEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersReposAddStatusCheckContextsEndpoint]
  }
}

