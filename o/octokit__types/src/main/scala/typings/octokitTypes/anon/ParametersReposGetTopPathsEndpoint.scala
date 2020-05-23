package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.ReposGetTopPathsEndpoint
import typings.octokitTypes.endpointsMod.ReposGetTopPathsRequestOptions
import typings.octokitTypes.endpointsMod.ReposGetTopPathsResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParametersReposGetTopPathsEndpoint extends js.Object {
  var parameters: ReposGetTopPathsEndpoint
  var request: ReposGetTopPathsRequestOptions
  var response: OctokitResponse[ReposGetTopPathsResponseData]
}

object ParametersReposGetTopPathsEndpoint {
  @scala.inline
  def apply(
    parameters: ReposGetTopPathsEndpoint,
    request: ReposGetTopPathsRequestOptions,
    response: OctokitResponse[ReposGetTopPathsResponseData]
  ): ParametersReposGetTopPathsEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersReposGetTopPathsEndpoint]
  }
}

