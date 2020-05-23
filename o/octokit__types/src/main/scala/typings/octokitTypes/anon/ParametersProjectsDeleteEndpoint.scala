package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.ProjectsDeleteEndpoint
import typings.octokitTypes.endpointsMod.ProjectsDeleteRequestOptions
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParametersProjectsDeleteEndpoint extends js.Object {
  var parameters: ProjectsDeleteEndpoint
  var request: ProjectsDeleteRequestOptions
  var response: OctokitResponse[_]
}

object ParametersProjectsDeleteEndpoint {
  @scala.inline
  def apply(
    parameters: ProjectsDeleteEndpoint,
    request: ProjectsDeleteRequestOptions,
    response: OctokitResponse[_]
  ): ParametersProjectsDeleteEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersProjectsDeleteEndpoint]
  }
}

