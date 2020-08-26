package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.TeamsListForAuthenticatedUserEndpoint
import typings.octokitTypes.endpointsMod.TeamsListForAuthenticatedUserRequestOptions
import typings.octokitTypes.endpointsMod.TeamsListForAuthenticatedUserResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParametersTeamsListForAuthenticatedUserEndpoint extends js.Object {
  var parameters: TeamsListForAuthenticatedUserEndpoint = js.native
  var request: TeamsListForAuthenticatedUserRequestOptions = js.native
  var response: OctokitResponse[TeamsListForAuthenticatedUserResponseData] = js.native
}

object ParametersTeamsListForAuthenticatedUserEndpoint {
  @scala.inline
  def apply(
    parameters: TeamsListForAuthenticatedUserEndpoint,
    request: TeamsListForAuthenticatedUserRequestOptions,
    response: OctokitResponse[TeamsListForAuthenticatedUserResponseData]
  ): ParametersTeamsListForAuthenticatedUserEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersTeamsListForAuthenticatedUserEndpoint]
  }
  @scala.inline
  implicit class ParametersTeamsListForAuthenticatedUserEndpointOps[Self <: ParametersTeamsListForAuthenticatedUserEndpoint] (val x: Self) extends AnyVal {
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
    def setParameters(value: TeamsListForAuthenticatedUserEndpoint): Self = this.set("parameters", value.asInstanceOf[js.Any])
    @scala.inline
    def setRequest(value: TeamsListForAuthenticatedUserRequestOptions): Self = this.set("request", value.asInstanceOf[js.Any])
    @scala.inline
    def setResponse(value: OctokitResponse[TeamsListForAuthenticatedUserResponseData]): Self = this.set("response", value.asInstanceOf[js.Any])
  }
  
}

