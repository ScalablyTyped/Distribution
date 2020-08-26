package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.TeamsRemoveProjectLegacyEndpoint
import typings.octokitTypes.endpointsMod.TeamsRemoveProjectLegacyRequestOptions
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParametersTeamsRemoveProjectLegacyEndpoint extends js.Object {
  var parameters: TeamsRemoveProjectLegacyEndpoint = js.native
  var request: TeamsRemoveProjectLegacyRequestOptions = js.native
  var response: OctokitResponse[_] = js.native
}

object ParametersTeamsRemoveProjectLegacyEndpoint {
  @scala.inline
  def apply(
    parameters: TeamsRemoveProjectLegacyEndpoint,
    request: TeamsRemoveProjectLegacyRequestOptions,
    response: OctokitResponse[_]
  ): ParametersTeamsRemoveProjectLegacyEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersTeamsRemoveProjectLegacyEndpoint]
  }
  @scala.inline
  implicit class ParametersTeamsRemoveProjectLegacyEndpointOps[Self <: ParametersTeamsRemoveProjectLegacyEndpoint] (val x: Self) extends AnyVal {
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
    def setParameters(value: TeamsRemoveProjectLegacyEndpoint): Self = this.set("parameters", value.asInstanceOf[js.Any])
    @scala.inline
    def setRequest(value: TeamsRemoveProjectLegacyRequestOptions): Self = this.set("request", value.asInstanceOf[js.Any])
    @scala.inline
    def setResponse(value: OctokitResponse[_]): Self = this.set("response", value.asInstanceOf[js.Any])
  }
  
}

