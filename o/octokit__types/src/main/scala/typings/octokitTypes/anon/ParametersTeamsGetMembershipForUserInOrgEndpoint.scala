package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.TeamsGetMembershipForUserInOrgEndpoint
import typings.octokitTypes.endpointsMod.TeamsGetMembershipForUserInOrgRequestOptions
import typings.octokitTypes.endpointsMod.TeamsGetMembershipForUserInOrgResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParametersTeamsGetMembershipForUserInOrgEndpoint extends js.Object {
  var parameters: TeamsGetMembershipForUserInOrgEndpoint = js.native
  var request: TeamsGetMembershipForUserInOrgRequestOptions = js.native
  var response: OctokitResponse[TeamsGetMembershipForUserInOrgResponseData] = js.native
}

object ParametersTeamsGetMembershipForUserInOrgEndpoint {
  @scala.inline
  def apply(
    parameters: TeamsGetMembershipForUserInOrgEndpoint,
    request: TeamsGetMembershipForUserInOrgRequestOptions,
    response: OctokitResponse[TeamsGetMembershipForUserInOrgResponseData]
  ): ParametersTeamsGetMembershipForUserInOrgEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersTeamsGetMembershipForUserInOrgEndpoint]
  }
  @scala.inline
  implicit class ParametersTeamsGetMembershipForUserInOrgEndpointOps[Self <: ParametersTeamsGetMembershipForUserInOrgEndpoint] (val x: Self) extends AnyVal {
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
    def setParameters(value: TeamsGetMembershipForUserInOrgEndpoint): Self = this.set("parameters", value.asInstanceOf[js.Any])
    @scala.inline
    def setRequest(value: TeamsGetMembershipForUserInOrgRequestOptions): Self = this.set("request", value.asInstanceOf[js.Any])
    @scala.inline
    def setResponse(value: OctokitResponse[TeamsGetMembershipForUserInOrgResponseData]): Self = this.set("response", value.asInstanceOf[js.Any])
  }
  
}

