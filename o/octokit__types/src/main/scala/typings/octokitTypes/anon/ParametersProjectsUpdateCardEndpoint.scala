package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.ProjectsUpdateCardEndpoint
import typings.octokitTypes.endpointsMod.ProjectsUpdateCardRequestOptions
import typings.octokitTypes.endpointsMod.ProjectsUpdateCardResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParametersProjectsUpdateCardEndpoint extends js.Object {
  var parameters: ProjectsUpdateCardEndpoint
  var request: ProjectsUpdateCardRequestOptions
  var response: OctokitResponse[ProjectsUpdateCardResponseData]
}

object ParametersProjectsUpdateCardEndpoint {
  @scala.inline
  def apply(
    parameters: ProjectsUpdateCardEndpoint,
    request: ProjectsUpdateCardRequestOptions,
    response: OctokitResponse[ProjectsUpdateCardResponseData]
  ): ParametersProjectsUpdateCardEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersProjectsUpdateCardEndpoint]
  }
}

