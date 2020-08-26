package typings.octokitPluginPaginateRest.anon

import typings.octokitTypes.endpointsMod.ProjectsListForOrgEndpoint
import typings.octokitTypes.endpointsMod.ProjectsListForOrgResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParametersProjectsListForOrgEndpoint extends js.Object {
  var parameters: ProjectsListForOrgEndpoint = js.native
  var response: OctokitResponse[ProjectsListForOrgResponseData] = js.native
}

object ParametersProjectsListForOrgEndpoint {
  @scala.inline
  def apply(parameters: ProjectsListForOrgEndpoint, response: OctokitResponse[ProjectsListForOrgResponseData]): ParametersProjectsListForOrgEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersProjectsListForOrgEndpoint]
  }
  @scala.inline
  implicit class ParametersProjectsListForOrgEndpointOps[Self <: ParametersProjectsListForOrgEndpoint] (val x: Self) extends AnyVal {
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
    def setParameters(value: ProjectsListForOrgEndpoint): Self = this.set("parameters", value.asInstanceOf[js.Any])
    @scala.inline
    def setResponse(value: OctokitResponse[ProjectsListForOrgResponseData]): Self = this.set("response", value.asInstanceOf[js.Any])
  }
  
}

