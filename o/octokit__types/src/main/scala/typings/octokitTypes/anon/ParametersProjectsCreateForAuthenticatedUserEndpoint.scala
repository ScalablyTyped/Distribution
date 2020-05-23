package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.ProjectsCreateForAuthenticatedUserEndpoint
import typings.octokitTypes.endpointsMod.ProjectsCreateForAuthenticatedUserRequestOptions
import typings.octokitTypes.endpointsMod.ProjectsCreateForAuthenticatedUserResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParametersProjectsCreateForAuthenticatedUserEndpoint extends js.Object {
  var parameters: ProjectsCreateForAuthenticatedUserEndpoint
  var request: ProjectsCreateForAuthenticatedUserRequestOptions
  var response: OctokitResponse[ProjectsCreateForAuthenticatedUserResponseData]
}

object ParametersProjectsCreateForAuthenticatedUserEndpoint {
  @scala.inline
  def apply(
    parameters: ProjectsCreateForAuthenticatedUserEndpoint,
    request: ProjectsCreateForAuthenticatedUserRequestOptions,
    response: OctokitResponse[ProjectsCreateForAuthenticatedUserResponseData]
  ): ParametersProjectsCreateForAuthenticatedUserEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersProjectsCreateForAuthenticatedUserEndpoint]
  }
}

