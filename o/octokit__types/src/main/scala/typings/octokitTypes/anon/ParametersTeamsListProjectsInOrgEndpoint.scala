package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.TeamsListProjectsInOrgEndpoint
import typings.octokitTypes.endpointsMod.TeamsListProjectsInOrgRequestOptions
import typings.octokitTypes.endpointsMod.TeamsListProjectsInOrgResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParametersTeamsListProjectsInOrgEndpoint extends js.Object {
  var parameters: TeamsListProjectsInOrgEndpoint = js.native
  var request: TeamsListProjectsInOrgRequestOptions = js.native
  var response: OctokitResponse[TeamsListProjectsInOrgResponseData] = js.native
}

object ParametersTeamsListProjectsInOrgEndpoint {
  @scala.inline
  def apply(
    parameters: TeamsListProjectsInOrgEndpoint,
    request: TeamsListProjectsInOrgRequestOptions,
    response: OctokitResponse[TeamsListProjectsInOrgResponseData]
  ): ParametersTeamsListProjectsInOrgEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersTeamsListProjectsInOrgEndpoint]
  }
  @scala.inline
  implicit class ParametersTeamsListProjectsInOrgEndpointOps[Self <: ParametersTeamsListProjectsInOrgEndpoint] (val x: Self) extends AnyVal {
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
    def setParameters(value: TeamsListProjectsInOrgEndpoint): Self = this.set("parameters", value.asInstanceOf[js.Any])
    @scala.inline
    def setRequest(value: TeamsListProjectsInOrgRequestOptions): Self = this.set("request", value.asInstanceOf[js.Any])
    @scala.inline
    def setResponse(value: OctokitResponse[TeamsListProjectsInOrgResponseData]): Self = this.set("response", value.asInstanceOf[js.Any])
  }
  
}

