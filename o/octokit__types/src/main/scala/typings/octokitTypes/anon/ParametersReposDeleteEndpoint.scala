package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.ReposDeleteEndpoint
import typings.octokitTypes.endpointsMod.ReposDeleteRequestOptions
import typings.octokitTypes.endpointsMod.ReposDeleteResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParametersReposDeleteEndpoint extends js.Object {
  var parameters: ReposDeleteEndpoint
  var request: ReposDeleteRequestOptions
  var response: OctokitResponse[ReposDeleteResponseData]
}

object ParametersReposDeleteEndpoint {
  @scala.inline
  def apply(
    parameters: ReposDeleteEndpoint,
    request: ReposDeleteRequestOptions,
    response: OctokitResponse[ReposDeleteResponseData]
  ): ParametersReposDeleteEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersReposDeleteEndpoint]
  }
}

