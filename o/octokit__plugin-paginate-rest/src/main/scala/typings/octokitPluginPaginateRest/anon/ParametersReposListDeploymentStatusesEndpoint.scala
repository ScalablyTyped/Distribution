package typings.octokitPluginPaginateRest.anon

import typings.octokitTypes.endpointsMod.ReposListDeploymentStatusesEndpoint
import typings.octokitTypes.endpointsMod.ReposListDeploymentStatusesResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParametersReposListDeploymentStatusesEndpoint extends js.Object {
  var parameters: ReposListDeploymentStatusesEndpoint
  var response: OctokitResponse[ReposListDeploymentStatusesResponseData]
}

object ParametersReposListDeploymentStatusesEndpoint {
  @scala.inline
  def apply(
    parameters: ReposListDeploymentStatusesEndpoint,
    response: OctokitResponse[ReposListDeploymentStatusesResponseData]
  ): ParametersReposListDeploymentStatusesEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersReposListDeploymentStatusesEndpoint]
  }
}

