package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.ReposDeleteDeploymentEndpoint
import typings.octokitTypes.endpointsMod.ReposDeleteDeploymentRequestOptions
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParametersReposDeleteDeploymentEndpoint extends js.Object {
  var parameters: ReposDeleteDeploymentEndpoint
  var request: ReposDeleteDeploymentRequestOptions
  var response: OctokitResponse[_]
}

object ParametersReposDeleteDeploymentEndpoint {
  @scala.inline
  def apply(
    parameters: ReposDeleteDeploymentEndpoint,
    request: ReposDeleteDeploymentRequestOptions,
    response: OctokitResponse[_]
  ): ParametersReposDeleteDeploymentEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersReposDeleteDeploymentEndpoint]
  }
}

