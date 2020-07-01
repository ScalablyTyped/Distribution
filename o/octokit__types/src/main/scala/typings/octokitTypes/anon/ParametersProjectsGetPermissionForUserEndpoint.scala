package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.ProjectsGetPermissionForUserEndpoint
import typings.octokitTypes.endpointsMod.ProjectsGetPermissionForUserRequestOptions
import typings.octokitTypes.endpointsMod.ProjectsGetPermissionForUserResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParametersProjectsGetPermissionForUserEndpoint extends js.Object {
  var parameters: ProjectsGetPermissionForUserEndpoint
  var request: ProjectsGetPermissionForUserRequestOptions
  var response: OctokitResponse[ProjectsGetPermissionForUserResponseData]
}

object ParametersProjectsGetPermissionForUserEndpoint {
  @scala.inline
  def apply(
    parameters: ProjectsGetPermissionForUserEndpoint,
    request: ProjectsGetPermissionForUserRequestOptions,
    response: OctokitResponse[ProjectsGetPermissionForUserResponseData]
  ): ParametersProjectsGetPermissionForUserEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersProjectsGetPermissionForUserEndpoint]
  }
}

