package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.TeamsListMembersLegacyEndpoint
import typings.octokitTypes.endpointsMod.TeamsListMembersLegacyRequestOptions
import typings.octokitTypes.endpointsMod.TeamsListMembersLegacyResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParametersTeamsListMembersLegacyEndpoint extends js.Object {
  var parameters: TeamsListMembersLegacyEndpoint = js.native
  var request: TeamsListMembersLegacyRequestOptions = js.native
  var response: OctokitResponse[TeamsListMembersLegacyResponseData] = js.native
}

object ParametersTeamsListMembersLegacyEndpoint {
  @scala.inline
  def apply(
    parameters: TeamsListMembersLegacyEndpoint,
    request: TeamsListMembersLegacyRequestOptions,
    response: OctokitResponse[TeamsListMembersLegacyResponseData]
  ): ParametersTeamsListMembersLegacyEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersTeamsListMembersLegacyEndpoint]
  }
  @scala.inline
  implicit class ParametersTeamsListMembersLegacyEndpointOps[Self <: ParametersTeamsListMembersLegacyEndpoint] (val x: Self) extends AnyVal {
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
    def setParameters(value: TeamsListMembersLegacyEndpoint): Self = this.set("parameters", value.asInstanceOf[js.Any])
    @scala.inline
    def setRequest(value: TeamsListMembersLegacyRequestOptions): Self = this.set("request", value.asInstanceOf[js.Any])
    @scala.inline
    def setResponse(value: OctokitResponse[TeamsListMembersLegacyResponseData]): Self = this.set("response", value.asInstanceOf[js.Any])
  }
  
}

