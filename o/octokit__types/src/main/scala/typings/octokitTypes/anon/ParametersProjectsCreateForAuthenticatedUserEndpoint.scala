package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.ProjectsCreateForAuthenticatedUserEndpoint
import typings.octokitTypes.endpointsMod.ProjectsCreateForAuthenticatedUserRequestOptions
import typings.octokitTypes.endpointsMod.ProjectsCreateForAuthenticatedUserResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParametersProjectsCreateForAuthenticatedUserEndpoint extends js.Object {
  var parameters: ProjectsCreateForAuthenticatedUserEndpoint = js.native
  var request: ProjectsCreateForAuthenticatedUserRequestOptions = js.native
  var response: OctokitResponse[ProjectsCreateForAuthenticatedUserResponseData] = js.native
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
  @scala.inline
  implicit class ParametersProjectsCreateForAuthenticatedUserEndpointOps[Self <: ParametersProjectsCreateForAuthenticatedUserEndpoint] (val x: Self) extends AnyVal {
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
    def setParameters(value: ProjectsCreateForAuthenticatedUserEndpoint): Self = this.set("parameters", value.asInstanceOf[js.Any])
    @scala.inline
    def setRequest(value: ProjectsCreateForAuthenticatedUserRequestOptions): Self = this.set("request", value.asInstanceOf[js.Any])
    @scala.inline
    def setResponse(value: OctokitResponse[ProjectsCreateForAuthenticatedUserResponseData]): Self = this.set("response", value.asInstanceOf[js.Any])
  }
  
}

