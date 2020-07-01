package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.ReposCreateDeployKeyEndpoint
import typings.octokitTypes.endpointsMod.ReposCreateDeployKeyRequestOptions
import typings.octokitTypes.endpointsMod.ReposCreateDeployKeyResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParametersReposCreateDeployKeyEndpoint extends js.Object {
  var parameters: ReposCreateDeployKeyEndpoint
  var request: ReposCreateDeployKeyRequestOptions
  var response: OctokitResponse[ReposCreateDeployKeyResponseData]
}

object ParametersReposCreateDeployKeyEndpoint {
  @scala.inline
  def apply(
    parameters: ReposCreateDeployKeyEndpoint,
    request: ReposCreateDeployKeyRequestOptions,
    response: OctokitResponse[ReposCreateDeployKeyResponseData]
  ): ParametersReposCreateDeployKeyEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersReposCreateDeployKeyEndpoint]
  }
}

