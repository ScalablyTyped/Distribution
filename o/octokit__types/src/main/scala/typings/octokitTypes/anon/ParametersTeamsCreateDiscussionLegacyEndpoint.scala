package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.TeamsCreateDiscussionLegacyEndpoint
import typings.octokitTypes.endpointsMod.TeamsCreateDiscussionLegacyRequestOptions
import typings.octokitTypes.endpointsMod.TeamsCreateDiscussionLegacyResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParametersTeamsCreateDiscussionLegacyEndpoint extends js.Object {
  var parameters: TeamsCreateDiscussionLegacyEndpoint = js.native
  var request: TeamsCreateDiscussionLegacyRequestOptions = js.native
  var response: OctokitResponse[TeamsCreateDiscussionLegacyResponseData] = js.native
}

object ParametersTeamsCreateDiscussionLegacyEndpoint {
  @scala.inline
  def apply(
    parameters: TeamsCreateDiscussionLegacyEndpoint,
    request: TeamsCreateDiscussionLegacyRequestOptions,
    response: OctokitResponse[TeamsCreateDiscussionLegacyResponseData]
  ): ParametersTeamsCreateDiscussionLegacyEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersTeamsCreateDiscussionLegacyEndpoint]
  }
  @scala.inline
  implicit class ParametersTeamsCreateDiscussionLegacyEndpointOps[Self <: ParametersTeamsCreateDiscussionLegacyEndpoint] (val x: Self) extends AnyVal {
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
    def setParameters(value: TeamsCreateDiscussionLegacyEndpoint): Self = this.set("parameters", value.asInstanceOf[js.Any])
    @scala.inline
    def setRequest(value: TeamsCreateDiscussionLegacyRequestOptions): Self = this.set("request", value.asInstanceOf[js.Any])
    @scala.inline
    def setResponse(value: OctokitResponse[TeamsCreateDiscussionLegacyResponseData]): Self = this.set("response", value.asInstanceOf[js.Any])
  }
  
}

