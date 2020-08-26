package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.ProjectsCreateForOrgEndpoint
import typings.octokitTypes.endpointsMod.ProjectsCreateForOrgRequestOptions
import typings.octokitTypes.endpointsMod.ProjectsCreateForOrgResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParametersProjectsCreateForOrgEndpoint extends js.Object {
  var parameters: ProjectsCreateForOrgEndpoint = js.native
  var request: ProjectsCreateForOrgRequestOptions = js.native
  var response: OctokitResponse[ProjectsCreateForOrgResponseData] = js.native
}

object ParametersProjectsCreateForOrgEndpoint {
  @scala.inline
  def apply(
    parameters: ProjectsCreateForOrgEndpoint,
    request: ProjectsCreateForOrgRequestOptions,
    response: OctokitResponse[ProjectsCreateForOrgResponseData]
  ): ParametersProjectsCreateForOrgEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersProjectsCreateForOrgEndpoint]
  }
  @scala.inline
  implicit class ParametersProjectsCreateForOrgEndpointOps[Self <: ParametersProjectsCreateForOrgEndpoint] (val x: Self) extends AnyVal {
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
    def setParameters(value: ProjectsCreateForOrgEndpoint): Self = this.set("parameters", value.asInstanceOf[js.Any])
    @scala.inline
    def setRequest(value: ProjectsCreateForOrgRequestOptions): Self = this.set("request", value.asInstanceOf[js.Any])
    @scala.inline
    def setResponse(value: OctokitResponse[ProjectsCreateForOrgResponseData]): Self = this.set("response", value.asInstanceOf[js.Any])
  }
  
}

