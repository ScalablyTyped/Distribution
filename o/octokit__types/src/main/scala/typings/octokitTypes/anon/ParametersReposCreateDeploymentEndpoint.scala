package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.ReposCreateDeploymentEndpoint
import typings.octokitTypes.endpointsMod.ReposCreateDeploymentRequestOptions
import typings.octokitTypes.endpointsMod.ReposCreateDeploymentResponse202Data
import typings.octokitTypes.endpointsMod.ReposCreateDeploymentResponse409Data
import typings.octokitTypes.endpointsMod.ReposCreateDeploymentResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParametersReposCreateDeploymentEndpoint extends js.Object {
  var parameters: ReposCreateDeploymentEndpoint
  var request: ReposCreateDeploymentRequestOptions
  var response: OctokitResponse[
    ReposCreateDeploymentResponseData | ReposCreateDeploymentResponse202Data | ReposCreateDeploymentResponse409Data
  ]
}

object ParametersReposCreateDeploymentEndpoint {
  @scala.inline
  def apply(
    parameters: ReposCreateDeploymentEndpoint,
    request: ReposCreateDeploymentRequestOptions,
    response: OctokitResponse[
      ReposCreateDeploymentResponseData | ReposCreateDeploymentResponse202Data | ReposCreateDeploymentResponse409Data
    ]
  ): ParametersReposCreateDeploymentEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersReposCreateDeploymentEndpoint]
  }
}

