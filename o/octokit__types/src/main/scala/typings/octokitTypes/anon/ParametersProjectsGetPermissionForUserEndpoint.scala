package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.ProjectsGetPermissionForUserEndpoint
import typings.octokitTypes.endpointsMod.ProjectsGetPermissionForUserRequestOptions
import typings.octokitTypes.endpointsMod.ProjectsGetPermissionForUserResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParametersProjectsGetPermissionForUserEndpoint extends js.Object {
  var parameters: ProjectsGetPermissionForUserEndpoint = js.native
  var request: ProjectsGetPermissionForUserRequestOptions = js.native
  var response: OctokitResponse[ProjectsGetPermissionForUserResponseData] = js.native
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
  @scala.inline
  implicit class ParametersProjectsGetPermissionForUserEndpointOps[Self <: ParametersProjectsGetPermissionForUserEndpoint] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setParameters(value: ProjectsGetPermissionForUserEndpoint): Self = this.set("parameters", value.asInstanceOf[js.Any])
    @scala.inline
    def setRequest(value: ProjectsGetPermissionForUserRequestOptions): Self = this.set("request", value.asInstanceOf[js.Any])
    @scala.inline
    def setResponse(value: OctokitResponse[ProjectsGetPermissionForUserResponseData]): Self = this.set("response", value.asInstanceOf[js.Any])
  }
  
}

