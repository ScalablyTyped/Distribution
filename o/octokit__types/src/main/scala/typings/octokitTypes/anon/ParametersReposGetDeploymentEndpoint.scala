package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.ReposGetDeploymentEndpoint
import typings.octokitTypes.endpointsMod.ReposGetDeploymentRequestOptions
import typings.octokitTypes.endpointsMod.ReposGetDeploymentResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParametersReposGetDeploymentEndpoint extends js.Object {
  var parameters: ReposGetDeploymentEndpoint
  var request: ReposGetDeploymentRequestOptions
  var response: OctokitResponse[ReposGetDeploymentResponseData]
}

object ParametersReposGetDeploymentEndpoint {
  @scala.inline
  def apply(
    parameters: ReposGetDeploymentEndpoint,
    request: ReposGetDeploymentRequestOptions,
    response: OctokitResponse[ReposGetDeploymentResponseData]
  ): ParametersReposGetDeploymentEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersReposGetDeploymentEndpoint]
  }
}

