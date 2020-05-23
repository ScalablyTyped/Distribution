package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.ReposDeleteFileEndpoint
import typings.octokitTypes.endpointsMod.ReposDeleteFileRequestOptions
import typings.octokitTypes.endpointsMod.ReposDeleteFileResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParametersReposDeleteFileEndpoint extends js.Object {
  var parameters: ReposDeleteFileEndpoint
  var request: ReposDeleteFileRequestOptions
  var response: OctokitResponse[ReposDeleteFileResponseData]
}

object ParametersReposDeleteFileEndpoint {
  @scala.inline
  def apply(
    parameters: ReposDeleteFileEndpoint,
    request: ReposDeleteFileRequestOptions,
    response: OctokitResponse[ReposDeleteFileResponseData]
  ): ParametersReposDeleteFileEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersReposDeleteFileEndpoint]
  }
}

