package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.TeamsCreateEndpoint
import typings.octokitTypes.endpointsMod.TeamsCreateRequestOptions
import typings.octokitTypes.endpointsMod.TeamsCreateResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParametersTeamsCreateEndpoint extends js.Object {
  var parameters: TeamsCreateEndpoint = js.native
  var request: TeamsCreateRequestOptions = js.native
  var response: OctokitResponse[TeamsCreateResponseData] = js.native
}

object ParametersTeamsCreateEndpoint {
  @scala.inline
  def apply(
    parameters: TeamsCreateEndpoint,
    request: TeamsCreateRequestOptions,
    response: OctokitResponse[TeamsCreateResponseData]
  ): ParametersTeamsCreateEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersTeamsCreateEndpoint]
  }
  @scala.inline
  implicit class ParametersTeamsCreateEndpointOps[Self <: ParametersTeamsCreateEndpoint] (val x: Self) extends AnyVal {
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
    def setParameters(value: TeamsCreateEndpoint): Self = this.set("parameters", value.asInstanceOf[js.Any])
    @scala.inline
    def setRequest(value: TeamsCreateRequestOptions): Self = this.set("request", value.asInstanceOf[js.Any])
    @scala.inline
    def setResponse(value: OctokitResponse[TeamsCreateResponseData]): Self = this.set("response", value.asInstanceOf[js.Any])
  }
  
}

