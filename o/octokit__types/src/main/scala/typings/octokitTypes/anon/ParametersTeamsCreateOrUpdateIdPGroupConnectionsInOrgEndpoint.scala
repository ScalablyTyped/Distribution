package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.TeamsCreateOrUpdateIdPGroupConnectionsInOrgEndpoint
import typings.octokitTypes.endpointsMod.TeamsCreateOrUpdateIdPGroupConnectionsInOrgRequestOptions
import typings.octokitTypes.endpointsMod.TeamsCreateOrUpdateIdPGroupConnectionsInOrgResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParametersTeamsCreateOrUpdateIdPGroupConnectionsInOrgEndpoint extends js.Object {
  var parameters: TeamsCreateOrUpdateIdPGroupConnectionsInOrgEndpoint = js.native
  var request: TeamsCreateOrUpdateIdPGroupConnectionsInOrgRequestOptions = js.native
  var response: OctokitResponse[TeamsCreateOrUpdateIdPGroupConnectionsInOrgResponseData] = js.native
}

object ParametersTeamsCreateOrUpdateIdPGroupConnectionsInOrgEndpoint {
  @scala.inline
  def apply(
    parameters: TeamsCreateOrUpdateIdPGroupConnectionsInOrgEndpoint,
    request: TeamsCreateOrUpdateIdPGroupConnectionsInOrgRequestOptions,
    response: OctokitResponse[TeamsCreateOrUpdateIdPGroupConnectionsInOrgResponseData]
  ): ParametersTeamsCreateOrUpdateIdPGroupConnectionsInOrgEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersTeamsCreateOrUpdateIdPGroupConnectionsInOrgEndpoint]
  }
  @scala.inline
  implicit class ParametersTeamsCreateOrUpdateIdPGroupConnectionsInOrgEndpointOps[Self <: ParametersTeamsCreateOrUpdateIdPGroupConnectionsInOrgEndpoint] (val x: Self) extends AnyVal {
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
    def setParameters(value: TeamsCreateOrUpdateIdPGroupConnectionsInOrgEndpoint): Self = this.set("parameters", value.asInstanceOf[js.Any])
    @scala.inline
    def setRequest(value: TeamsCreateOrUpdateIdPGroupConnectionsInOrgRequestOptions): Self = this.set("request", value.asInstanceOf[js.Any])
    @scala.inline
    def setResponse(value: OctokitResponse[TeamsCreateOrUpdateIdPGroupConnectionsInOrgResponseData]): Self = this.set("response", value.asInstanceOf[js.Any])
  }
  
}

