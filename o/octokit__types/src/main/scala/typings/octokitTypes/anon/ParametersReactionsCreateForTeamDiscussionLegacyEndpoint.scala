package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.ReactionsCreateForTeamDiscussionLegacyEndpoint
import typings.octokitTypes.endpointsMod.ReactionsCreateForTeamDiscussionLegacyRequestOptions
import typings.octokitTypes.endpointsMod.ReactionsCreateForTeamDiscussionLegacyResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParametersReactionsCreateForTeamDiscussionLegacyEndpoint extends js.Object {
  var parameters: ReactionsCreateForTeamDiscussionLegacyEndpoint = js.native
  var request: ReactionsCreateForTeamDiscussionLegacyRequestOptions = js.native
  var response: OctokitResponse[ReactionsCreateForTeamDiscussionLegacyResponseData] = js.native
}

object ParametersReactionsCreateForTeamDiscussionLegacyEndpoint {
  @scala.inline
  def apply(
    parameters: ReactionsCreateForTeamDiscussionLegacyEndpoint,
    request: ReactionsCreateForTeamDiscussionLegacyRequestOptions,
    response: OctokitResponse[ReactionsCreateForTeamDiscussionLegacyResponseData]
  ): ParametersReactionsCreateForTeamDiscussionLegacyEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersReactionsCreateForTeamDiscussionLegacyEndpoint]
  }
  @scala.inline
  implicit class ParametersReactionsCreateForTeamDiscussionLegacyEndpointOps[Self <: ParametersReactionsCreateForTeamDiscussionLegacyEndpoint] (val x: Self) extends AnyVal {
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
    def setParameters(value: ReactionsCreateForTeamDiscussionLegacyEndpoint): Self = this.set("parameters", value.asInstanceOf[js.Any])
    @scala.inline
    def setRequest(value: ReactionsCreateForTeamDiscussionLegacyRequestOptions): Self = this.set("request", value.asInstanceOf[js.Any])
    @scala.inline
    def setResponse(value: OctokitResponse[ReactionsCreateForTeamDiscussionLegacyResponseData]): Self = this.set("response", value.asInstanceOf[js.Any])
  }
  
}

