package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.ProjectsUpdateColumnEndpoint
import typings.octokitTypes.endpointsMod.ProjectsUpdateColumnRequestOptions
import typings.octokitTypes.endpointsMod.ProjectsUpdateColumnResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParametersProjectsUpdateColumnEndpoint extends js.Object {
  var parameters: ProjectsUpdateColumnEndpoint
  var request: ProjectsUpdateColumnRequestOptions
  var response: OctokitResponse[ProjectsUpdateColumnResponseData]
}

object ParametersProjectsUpdateColumnEndpoint {
  @scala.inline
  def apply(
    parameters: ProjectsUpdateColumnEndpoint,
    request: ProjectsUpdateColumnRequestOptions,
    response: OctokitResponse[ProjectsUpdateColumnResponseData]
  ): ParametersProjectsUpdateColumnEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersProjectsUpdateColumnEndpoint]
  }
}

