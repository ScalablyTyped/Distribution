package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.ReposListDeploymentStatusesEndpoint
import typings.octokitTypes.endpointsMod.ReposListDeploymentStatusesRequestOptions
import typings.octokitTypes.endpointsMod.ReposListDeploymentStatusesResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParametersReposListDeploymentStatusesEndpoint extends js.Object {
  var parameters: ReposListDeploymentStatusesEndpoint
  var request: ReposListDeploymentStatusesRequestOptions
  var response: OctokitResponse[ReposListDeploymentStatusesResponseData]
}

object ParametersReposListDeploymentStatusesEndpoint {
  @scala.inline
  def apply(
    parameters: ReposListDeploymentStatusesEndpoint,
    request: ReposListDeploymentStatusesRequestOptions,
    response: OctokitResponse[ReposListDeploymentStatusesResponseData]
  ): ParametersReposListDeploymentStatusesEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersReposListDeploymentStatusesEndpoint]
  }
}

