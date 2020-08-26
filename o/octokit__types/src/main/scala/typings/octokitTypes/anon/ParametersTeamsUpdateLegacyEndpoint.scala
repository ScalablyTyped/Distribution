package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.TeamsUpdateLegacyEndpoint
import typings.octokitTypes.endpointsMod.TeamsUpdateLegacyRequestOptions
import typings.octokitTypes.endpointsMod.TeamsUpdateLegacyResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParametersTeamsUpdateLegacyEndpoint extends js.Object {
  var parameters: TeamsUpdateLegacyEndpoint = js.native
  var request: TeamsUpdateLegacyRequestOptions = js.native
  var response: OctokitResponse[TeamsUpdateLegacyResponseData] = js.native
}

object ParametersTeamsUpdateLegacyEndpoint {
  @scala.inline
  def apply(
    parameters: TeamsUpdateLegacyEndpoint,
    request: TeamsUpdateLegacyRequestOptions,
    response: OctokitResponse[TeamsUpdateLegacyResponseData]
  ): ParametersTeamsUpdateLegacyEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersTeamsUpdateLegacyEndpoint]
  }
  @scala.inline
  implicit class ParametersTeamsUpdateLegacyEndpointOps[Self <: ParametersTeamsUpdateLegacyEndpoint] (val x: Self) extends AnyVal {
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
    def setParameters(value: TeamsUpdateLegacyEndpoint): Self = this.set("parameters", value.asInstanceOf[js.Any])
    @scala.inline
    def setRequest(value: TeamsUpdateLegacyRequestOptions): Self = this.set("request", value.asInstanceOf[js.Any])
    @scala.inline
    def setResponse(value: OctokitResponse[TeamsUpdateLegacyResponseData]): Self = this.set("response", value.asInstanceOf[js.Any])
  }
  
}

