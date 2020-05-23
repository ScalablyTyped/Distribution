package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.ProjectsDeleteCardEndpoint
import typings.octokitTypes.endpointsMod.ProjectsDeleteCardRequestOptions
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParametersProjectsDeleteCardEndpoint extends js.Object {
  var parameters: ProjectsDeleteCardEndpoint
  var request: ProjectsDeleteCardRequestOptions
  var response: OctokitResponse[_]
}

object ParametersProjectsDeleteCardEndpoint {
  @scala.inline
  def apply(
    parameters: ProjectsDeleteCardEndpoint,
    request: ProjectsDeleteCardRequestOptions,
    response: OctokitResponse[_]
  ): ParametersProjectsDeleteCardEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersProjectsDeleteCardEndpoint]
  }
}

