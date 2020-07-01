package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.ReposRemoveStatusCheckContextsEndpoint
import typings.octokitTypes.endpointsMod.ReposRemoveStatusCheckContextsRequestOptions
import typings.octokitTypes.endpointsMod.ReposRemoveStatusCheckContextsResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParametersReposRemoveStatusCheckContextsEndpoint extends js.Object {
  var parameters: ReposRemoveStatusCheckContextsEndpoint
  var request: ReposRemoveStatusCheckContextsRequestOptions
  var response: OctokitResponse[ReposRemoveStatusCheckContextsResponseData]
}

object ParametersReposRemoveStatusCheckContextsEndpoint {
  @scala.inline
  def apply(
    parameters: ReposRemoveStatusCheckContextsEndpoint,
    request: ReposRemoveStatusCheckContextsRequestOptions,
    response: OctokitResponse[ReposRemoveStatusCheckContextsResponseData]
  ): ParametersReposRemoveStatusCheckContextsEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersReposRemoveStatusCheckContextsEndpoint]
  }
}

