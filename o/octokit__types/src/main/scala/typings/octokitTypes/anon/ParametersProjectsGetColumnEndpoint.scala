package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.ProjectsGetColumnEndpoint
import typings.octokitTypes.endpointsMod.ProjectsGetColumnRequestOptions
import typings.octokitTypes.endpointsMod.ProjectsGetColumnResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParametersProjectsGetColumnEndpoint extends js.Object {
  var parameters: ProjectsGetColumnEndpoint
  var request: ProjectsGetColumnRequestOptions
  var response: OctokitResponse[ProjectsGetColumnResponseData]
}

object ParametersProjectsGetColumnEndpoint {
  @scala.inline
  def apply(
    parameters: ProjectsGetColumnEndpoint,
    request: ProjectsGetColumnRequestOptions,
    response: OctokitResponse[ProjectsGetColumnResponseData]
  ): ParametersProjectsGetColumnEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersProjectsGetColumnEndpoint]
  }
}

