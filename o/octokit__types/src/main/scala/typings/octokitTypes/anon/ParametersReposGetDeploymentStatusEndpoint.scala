package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.ReposGetDeploymentStatusEndpoint
import typings.octokitTypes.endpointsMod.ReposGetDeploymentStatusRequestOptions
import typings.octokitTypes.endpointsMod.ReposGetDeploymentStatusResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParametersReposGetDeploymentStatusEndpoint extends js.Object {
  var parameters: ReposGetDeploymentStatusEndpoint
  var request: ReposGetDeploymentStatusRequestOptions
  var response: OctokitResponse[ReposGetDeploymentStatusResponseData]
}

object ParametersReposGetDeploymentStatusEndpoint {
  @scala.inline
  def apply(
    parameters: ReposGetDeploymentStatusEndpoint,
    request: ReposGetDeploymentStatusRequestOptions,
    response: OctokitResponse[ReposGetDeploymentStatusResponseData]
  ): ParametersReposGetDeploymentStatusEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersReposGetDeploymentStatusEndpoint]
  }
}

