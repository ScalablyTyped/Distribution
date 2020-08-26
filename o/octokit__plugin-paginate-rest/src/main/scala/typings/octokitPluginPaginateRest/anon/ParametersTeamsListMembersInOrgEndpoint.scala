package typings.octokitPluginPaginateRest.anon

import typings.octokitTypes.endpointsMod.TeamsListMembersInOrgEndpoint
import typings.octokitTypes.endpointsMod.TeamsListMembersInOrgResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParametersTeamsListMembersInOrgEndpoint extends js.Object {
  var parameters: TeamsListMembersInOrgEndpoint = js.native
  var response: OctokitResponse[TeamsListMembersInOrgResponseData] = js.native
}

object ParametersTeamsListMembersInOrgEndpoint {
  @scala.inline
  def apply(
    parameters: TeamsListMembersInOrgEndpoint,
    response: OctokitResponse[TeamsListMembersInOrgResponseData]
  ): ParametersTeamsListMembersInOrgEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersTeamsListMembersInOrgEndpoint]
  }
  @scala.inline
  implicit class ParametersTeamsListMembersInOrgEndpointOps[Self <: ParametersTeamsListMembersInOrgEndpoint] (val x: Self) extends AnyVal {
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
    def setParameters(value: TeamsListMembersInOrgEndpoint): Self = this.set("parameters", value.asInstanceOf[js.Any])
    @scala.inline
    def setResponse(value: OctokitResponse[TeamsListMembersInOrgResponseData]): Self = this.set("response", value.asInstanceOf[js.Any])
  }
  
}

