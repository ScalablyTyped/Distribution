package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.ReposDeleteDeployKeyEndpoint
import typings.octokitTypes.endpointsMod.ReposDeleteDeployKeyRequestOptions
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParametersReposDeleteDeployKeyEndpoint extends js.Object {
  var parameters: ReposDeleteDeployKeyEndpoint
  var request: ReposDeleteDeployKeyRequestOptions
  var response: OctokitResponse[_]
}

object ParametersReposDeleteDeployKeyEndpoint {
  @scala.inline
  def apply(
    parameters: ReposDeleteDeployKeyEndpoint,
    request: ReposDeleteDeployKeyRequestOptions,
    response: OctokitResponse[_]
  ): ParametersReposDeleteDeployKeyEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersReposDeleteDeployKeyEndpoint]
  }
}

