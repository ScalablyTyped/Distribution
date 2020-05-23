package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.ProjectsUpdateEndpoint
import typings.octokitTypes.endpointsMod.ProjectsUpdateRequestOptions
import typings.octokitTypes.endpointsMod.ProjectsUpdateResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParametersProjectsUpdateEndpoint extends js.Object {
  var parameters: ProjectsUpdateEndpoint
  var request: ProjectsUpdateRequestOptions
  var response: OctokitResponse[ProjectsUpdateResponseData]
}

object ParametersProjectsUpdateEndpoint {
  @scala.inline
  def apply(
    parameters: ProjectsUpdateEndpoint,
    request: ProjectsUpdateRequestOptions,
    response: OctokitResponse[ProjectsUpdateResponseData]
  ): ParametersProjectsUpdateEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersProjectsUpdateEndpoint]
  }
}

