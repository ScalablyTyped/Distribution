package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.TeamsGetMembershipForUserLegacyEndpoint
import typings.octokitTypes.endpointsMod.TeamsGetMembershipForUserLegacyRequestOptions
import typings.octokitTypes.endpointsMod.TeamsGetMembershipForUserLegacyResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParametersTeamsGetMembershipForUserLegacyEndpoint extends js.Object {
  var parameters: TeamsGetMembershipForUserLegacyEndpoint = js.native
  var request: TeamsGetMembershipForUserLegacyRequestOptions = js.native
  var response: OctokitResponse[TeamsGetMembershipForUserLegacyResponseData] = js.native
}

object ParametersTeamsGetMembershipForUserLegacyEndpoint {
  @scala.inline
  def apply(
    parameters: TeamsGetMembershipForUserLegacyEndpoint,
    request: TeamsGetMembershipForUserLegacyRequestOptions,
    response: OctokitResponse[TeamsGetMembershipForUserLegacyResponseData]
  ): ParametersTeamsGetMembershipForUserLegacyEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersTeamsGetMembershipForUserLegacyEndpoint]
  }
  @scala.inline
  implicit class ParametersTeamsGetMembershipForUserLegacyEndpointOps[Self <: ParametersTeamsGetMembershipForUserLegacyEndpoint] (val x: Self) extends AnyVal {
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
    def setParameters(value: TeamsGetMembershipForUserLegacyEndpoint): Self = this.set("parameters", value.asInstanceOf[js.Any])
    @scala.inline
    def setRequest(value: TeamsGetMembershipForUserLegacyRequestOptions): Self = this.set("request", value.asInstanceOf[js.Any])
    @scala.inline
    def setResponse(value: OctokitResponse[TeamsGetMembershipForUserLegacyResponseData]): Self = this.set("response", value.asInstanceOf[js.Any])
  }
  
}

