package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.ReposGetViewsEndpoint
import typings.octokitTypes.endpointsMod.ReposGetViewsRequestOptions
import typings.octokitTypes.endpointsMod.ReposGetViewsResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParametersReposGetViewsEndpoint extends js.Object {
  var parameters: ReposGetViewsEndpoint
  var request: ReposGetViewsRequestOptions
  var response: OctokitResponse[ReposGetViewsResponseData]
}

object ParametersReposGetViewsEndpoint {
  @scala.inline
  def apply(
    parameters: ReposGetViewsEndpoint,
    request: ReposGetViewsRequestOptions,
    response: OctokitResponse[ReposGetViewsResponseData]
  ): ParametersReposGetViewsEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersReposGetViewsEndpoint]
  }
}

