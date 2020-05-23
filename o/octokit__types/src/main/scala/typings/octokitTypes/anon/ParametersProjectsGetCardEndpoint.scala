package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.ProjectsGetCardEndpoint
import typings.octokitTypes.endpointsMod.ProjectsGetCardRequestOptions
import typings.octokitTypes.endpointsMod.ProjectsGetCardResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParametersProjectsGetCardEndpoint extends js.Object {
  var parameters: ProjectsGetCardEndpoint
  var request: ProjectsGetCardRequestOptions
  var response: OctokitResponse[ProjectsGetCardResponseData]
}

object ParametersProjectsGetCardEndpoint {
  @scala.inline
  def apply(
    parameters: ProjectsGetCardEndpoint,
    request: ProjectsGetCardRequestOptions,
    response: OctokitResponse[ProjectsGetCardResponseData]
  ): ParametersProjectsGetCardEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersProjectsGetCardEndpoint]
  }
}

