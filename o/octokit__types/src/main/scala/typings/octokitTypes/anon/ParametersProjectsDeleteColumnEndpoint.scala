package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.ProjectsDeleteColumnEndpoint
import typings.octokitTypes.endpointsMod.ProjectsDeleteColumnRequestOptions
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParametersProjectsDeleteColumnEndpoint extends js.Object {
  var parameters: ProjectsDeleteColumnEndpoint
  var request: ProjectsDeleteColumnRequestOptions
  var response: OctokitResponse[_]
}

object ParametersProjectsDeleteColumnEndpoint {
  @scala.inline
  def apply(
    parameters: ProjectsDeleteColumnEndpoint,
    request: ProjectsDeleteColumnRequestOptions,
    response: OctokitResponse[_]
  ): ParametersProjectsDeleteColumnEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersProjectsDeleteColumnEndpoint]
  }
}

