package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.ReposAddDeployKeyEndpoint
import typings.octokitTypes.endpointsMod.ReposAddDeployKeyRequestOptions
import typings.octokitTypes.endpointsMod.ReposAddDeployKeyResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParametersReposAddDeployKeyEndpoint extends js.Object {
  var parameters: ReposAddDeployKeyEndpoint
  var request: ReposAddDeployKeyRequestOptions
  var response: OctokitResponse[ReposAddDeployKeyResponseData]
}

object ParametersReposAddDeployKeyEndpoint {
  @scala.inline
  def apply(
    parameters: ReposAddDeployKeyEndpoint,
    request: ReposAddDeployKeyRequestOptions,
    response: OctokitResponse[ReposAddDeployKeyResponseData]
  ): ParametersReposAddDeployKeyEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersReposAddDeployKeyEndpoint]
  }
}

