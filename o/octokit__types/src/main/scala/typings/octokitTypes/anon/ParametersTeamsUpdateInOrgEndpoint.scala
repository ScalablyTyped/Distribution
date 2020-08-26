package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.TeamsUpdateInOrgEndpoint
import typings.octokitTypes.endpointsMod.TeamsUpdateInOrgRequestOptions
import typings.octokitTypes.endpointsMod.TeamsUpdateInOrgResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParametersTeamsUpdateInOrgEndpoint extends js.Object {
  var parameters: TeamsUpdateInOrgEndpoint = js.native
  var request: TeamsUpdateInOrgRequestOptions = js.native
  var response: OctokitResponse[TeamsUpdateInOrgResponseData] = js.native
}

object ParametersTeamsUpdateInOrgEndpoint {
  @scala.inline
  def apply(
    parameters: TeamsUpdateInOrgEndpoint,
    request: TeamsUpdateInOrgRequestOptions,
    response: OctokitResponse[TeamsUpdateInOrgResponseData]
  ): ParametersTeamsUpdateInOrgEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersTeamsUpdateInOrgEndpoint]
  }
  @scala.inline
  implicit class ParametersTeamsUpdateInOrgEndpointOps[Self <: ParametersTeamsUpdateInOrgEndpoint] (val x: Self) extends AnyVal {
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
    def setParameters(value: TeamsUpdateInOrgEndpoint): Self = this.set("parameters", value.asInstanceOf[js.Any])
    @scala.inline
    def setRequest(value: TeamsUpdateInOrgRequestOptions): Self = this.set("request", value.asInstanceOf[js.Any])
    @scala.inline
    def setResponse(value: OctokitResponse[TeamsUpdateInOrgResponseData]): Self = this.set("response", value.asInstanceOf[js.Any])
  }
  
}

