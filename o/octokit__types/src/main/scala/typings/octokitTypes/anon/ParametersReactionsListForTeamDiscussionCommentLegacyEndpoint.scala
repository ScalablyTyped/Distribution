package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.ReactionsListForTeamDiscussionCommentLegacyEndpoint
import typings.octokitTypes.endpointsMod.ReactionsListForTeamDiscussionCommentLegacyRequestOptions
import typings.octokitTypes.endpointsMod.ReactionsListForTeamDiscussionCommentLegacyResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParametersReactionsListForTeamDiscussionCommentLegacyEndpoint extends js.Object {
  var parameters: ReactionsListForTeamDiscussionCommentLegacyEndpoint = js.native
  var request: ReactionsListForTeamDiscussionCommentLegacyRequestOptions = js.native
  var response: OctokitResponse[ReactionsListForTeamDiscussionCommentLegacyResponseData] = js.native
}

object ParametersReactionsListForTeamDiscussionCommentLegacyEndpoint {
  @scala.inline
  def apply(
    parameters: ReactionsListForTeamDiscussionCommentLegacyEndpoint,
    request: ReactionsListForTeamDiscussionCommentLegacyRequestOptions,
    response: OctokitResponse[ReactionsListForTeamDiscussionCommentLegacyResponseData]
  ): ParametersReactionsListForTeamDiscussionCommentLegacyEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersReactionsListForTeamDiscussionCommentLegacyEndpoint]
  }
  @scala.inline
  implicit class ParametersReactionsListForTeamDiscussionCommentLegacyEndpointOps[Self <: ParametersReactionsListForTeamDiscussionCommentLegacyEndpoint] (val x: Self) extends AnyVal {
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
    def setParameters(value: ReactionsListForTeamDiscussionCommentLegacyEndpoint): Self = this.set("parameters", value.asInstanceOf[js.Any])
    @scala.inline
    def setRequest(value: ReactionsListForTeamDiscussionCommentLegacyRequestOptions): Self = this.set("request", value.asInstanceOf[js.Any])
    @scala.inline
    def setResponse(value: OctokitResponse[ReactionsListForTeamDiscussionCommentLegacyResponseData]): Self = this.set("response", value.asInstanceOf[js.Any])
  }
  
}

