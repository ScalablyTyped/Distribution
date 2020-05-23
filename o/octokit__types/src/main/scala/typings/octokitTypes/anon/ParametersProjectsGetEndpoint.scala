package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.ProjectsGetEndpoint
import typings.octokitTypes.endpointsMod.ProjectsGetRequestOptions
import typings.octokitTypes.endpointsMod.ProjectsGetResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParametersProjectsGetEndpoint extends js.Object {
  var parameters: ProjectsGetEndpoint
  var request: ProjectsGetRequestOptions
  var response: OctokitResponse[ProjectsGetResponseData]
}

object ParametersProjectsGetEndpoint {
  @scala.inline
  def apply(
    parameters: ProjectsGetEndpoint,
    request: ProjectsGetRequestOptions,
    response: OctokitResponse[ProjectsGetResponseData]
  ): ParametersProjectsGetEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersProjectsGetEndpoint]
  }
}

