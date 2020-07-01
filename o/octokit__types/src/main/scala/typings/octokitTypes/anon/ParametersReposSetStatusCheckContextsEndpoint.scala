package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.ReposSetStatusCheckContextsEndpoint
import typings.octokitTypes.endpointsMod.ReposSetStatusCheckContextsRequestOptions
import typings.octokitTypes.endpointsMod.ReposSetStatusCheckContextsResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParametersReposSetStatusCheckContextsEndpoint extends js.Object {
  var parameters: ReposSetStatusCheckContextsEndpoint
  var request: ReposSetStatusCheckContextsRequestOptions
  var response: OctokitResponse[ReposSetStatusCheckContextsResponseData]
}

object ParametersReposSetStatusCheckContextsEndpoint {
  @scala.inline
  def apply(
    parameters: ReposSetStatusCheckContextsEndpoint,
    request: ReposSetStatusCheckContextsRequestOptions,
    response: OctokitResponse[ReposSetStatusCheckContextsResponseData]
  ): ParametersReposSetStatusCheckContextsEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersReposSetStatusCheckContextsEndpoint]
  }
}

