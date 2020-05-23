package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.ProjectsListForUserEndpoint
import typings.octokitTypes.endpointsMod.ProjectsListForUserRequestOptions
import typings.octokitTypes.endpointsMod.ProjectsListForUserResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParametersProjectsListForUserEndpoint extends js.Object {
  var parameters: ProjectsListForUserEndpoint
  var request: ProjectsListForUserRequestOptions
  var response: OctokitResponse[ProjectsListForUserResponseData]
}

object ParametersProjectsListForUserEndpoint {
  @scala.inline
  def apply(
    parameters: ProjectsListForUserEndpoint,
    request: ProjectsListForUserRequestOptions,
    response: OctokitResponse[ProjectsListForUserResponseData]
  ): ParametersProjectsListForUserEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersProjectsListForUserEndpoint]
  }
}

