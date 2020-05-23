package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.ReposGetDeployKeyEndpoint
import typings.octokitTypes.endpointsMod.ReposGetDeployKeyRequestOptions
import typings.octokitTypes.endpointsMod.ReposGetDeployKeyResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParametersReposGetDeployKeyEndpoint extends js.Object {
  var parameters: ReposGetDeployKeyEndpoint
  var request: ReposGetDeployKeyRequestOptions
  var response: OctokitResponse[ReposGetDeployKeyResponseData]
}

object ParametersReposGetDeployKeyEndpoint {
  @scala.inline
  def apply(
    parameters: ReposGetDeployKeyEndpoint,
    request: ReposGetDeployKeyRequestOptions,
    response: OctokitResponse[ReposGetDeployKeyResponseData]
  ): ParametersReposGetDeployKeyEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersReposGetDeployKeyEndpoint]
  }
}

