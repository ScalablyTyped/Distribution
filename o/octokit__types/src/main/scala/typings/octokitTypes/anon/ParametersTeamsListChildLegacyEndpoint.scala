package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.TeamsListChildLegacyEndpoint
import typings.octokitTypes.endpointsMod.TeamsListChildLegacyRequestOptions
import typings.octokitTypes.endpointsMod.TeamsListChildLegacyResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParametersTeamsListChildLegacyEndpoint extends js.Object {
  var parameters: TeamsListChildLegacyEndpoint = js.native
  var request: TeamsListChildLegacyRequestOptions = js.native
  var response: OctokitResponse[TeamsListChildLegacyResponseData] = js.native
}

object ParametersTeamsListChildLegacyEndpoint {
  @scala.inline
  def apply(
    parameters: TeamsListChildLegacyEndpoint,
    request: TeamsListChildLegacyRequestOptions,
    response: OctokitResponse[TeamsListChildLegacyResponseData]
  ): ParametersTeamsListChildLegacyEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersTeamsListChildLegacyEndpoint]
  }
  @scala.inline
  implicit class ParametersTeamsListChildLegacyEndpointOps[Self <: ParametersTeamsListChildLegacyEndpoint] (val x: Self) extends AnyVal {
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
    def setParameters(value: TeamsListChildLegacyEndpoint): Self = this.set("parameters", value.asInstanceOf[js.Any])
    @scala.inline
    def setRequest(value: TeamsListChildLegacyRequestOptions): Self = this.set("request", value.asInstanceOf[js.Any])
    @scala.inline
    def setResponse(value: OctokitResponse[TeamsListChildLegacyResponseData]): Self = this.set("response", value.asInstanceOf[js.Any])
  }
  
}

