package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.ReposGetAllStatusCheckContextsEndpoint
import typings.octokitTypes.endpointsMod.ReposGetAllStatusCheckContextsRequestOptions
import typings.octokitTypes.endpointsMod.ReposGetAllStatusCheckContextsResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParametersReposGetAllStatusCheckContextsEndpoint extends js.Object {
  var parameters: ReposGetAllStatusCheckContextsEndpoint
  var request: ReposGetAllStatusCheckContextsRequestOptions
  var response: OctokitResponse[ReposGetAllStatusCheckContextsResponseData]
}

object ParametersReposGetAllStatusCheckContextsEndpoint {
  @scala.inline
  def apply(
    parameters: ReposGetAllStatusCheckContextsEndpoint,
    request: ReposGetAllStatusCheckContextsRequestOptions,
    response: OctokitResponse[ReposGetAllStatusCheckContextsResponseData]
  ): ParametersReposGetAllStatusCheckContextsEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersReposGetAllStatusCheckContextsEndpoint]
  }
}

