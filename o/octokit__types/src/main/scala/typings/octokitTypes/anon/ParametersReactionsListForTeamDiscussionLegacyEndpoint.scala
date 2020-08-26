package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.ReactionsListForTeamDiscussionLegacyEndpoint
import typings.octokitTypes.endpointsMod.ReactionsListForTeamDiscussionLegacyRequestOptions
import typings.octokitTypes.endpointsMod.ReactionsListForTeamDiscussionLegacyResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParametersReactionsListForTeamDiscussionLegacyEndpoint extends js.Object {
  var parameters: ReactionsListForTeamDiscussionLegacyEndpoint = js.native
  var request: ReactionsListForTeamDiscussionLegacyRequestOptions = js.native
  var response: OctokitResponse[ReactionsListForTeamDiscussionLegacyResponseData] = js.native
}

object ParametersReactionsListForTeamDiscussionLegacyEndpoint {
  @scala.inline
  def apply(
    parameters: ReactionsListForTeamDiscussionLegacyEndpoint,
    request: ReactionsListForTeamDiscussionLegacyRequestOptions,
    response: OctokitResponse[ReactionsListForTeamDiscussionLegacyResponseData]
  ): ParametersReactionsListForTeamDiscussionLegacyEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersReactionsListForTeamDiscussionLegacyEndpoint]
  }
  @scala.inline
  implicit class ParametersReactionsListForTeamDiscussionLegacyEndpointOps[Self <: ParametersReactionsListForTeamDiscussionLegacyEndpoint] (val x: Self) extends AnyVal {
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
    def setParameters(value: ReactionsListForTeamDiscussionLegacyEndpoint): Self = this.set("parameters", value.asInstanceOf[js.Any])
    @scala.inline
    def setRequest(value: ReactionsListForTeamDiscussionLegacyRequestOptions): Self = this.set("request", value.asInstanceOf[js.Any])
    @scala.inline
    def setResponse(value: OctokitResponse[ReactionsListForTeamDiscussionLegacyResponseData]): Self = this.set("response", value.asInstanceOf[js.Any])
  }
  
}

