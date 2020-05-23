package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.ReposCreateDeploymentStatusEndpoint
import typings.octokitTypes.endpointsMod.ReposCreateDeploymentStatusRequestOptions
import typings.octokitTypes.endpointsMod.ReposCreateDeploymentStatusResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParametersReposCreateDeploymentStatusEndpoint extends js.Object {
  var parameters: ReposCreateDeploymentStatusEndpoint
  var request: ReposCreateDeploymentStatusRequestOptions
  var response: OctokitResponse[ReposCreateDeploymentStatusResponseData]
}

object ParametersReposCreateDeploymentStatusEndpoint {
  @scala.inline
  def apply(
    parameters: ReposCreateDeploymentStatusEndpoint,
    request: ReposCreateDeploymentStatusRequestOptions,
    response: OctokitResponse[ReposCreateDeploymentStatusResponseData]
  ): ParametersReposCreateDeploymentStatusEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersReposCreateDeploymentStatusEndpoint]
  }
}

