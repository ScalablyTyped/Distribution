package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.ReactionsCreateForTeamDiscussionCommentLegacyEndpoint
import typings.octokitTypes.endpointsMod.ReactionsCreateForTeamDiscussionCommentLegacyRequestOptions
import typings.octokitTypes.endpointsMod.ReactionsCreateForTeamDiscussionCommentLegacyResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParametersReactionsCreateForTeamDiscussionCommentLegacyEndpoint extends js.Object {
  var parameters: ReactionsCreateForTeamDiscussionCommentLegacyEndpoint = js.native
  var request: ReactionsCreateForTeamDiscussionCommentLegacyRequestOptions = js.native
  var response: OctokitResponse[ReactionsCreateForTeamDiscussionCommentLegacyResponseData] = js.native
}

object ParametersReactionsCreateForTeamDiscussionCommentLegacyEndpoint {
  @scala.inline
  def apply(
    parameters: ReactionsCreateForTeamDiscussionCommentLegacyEndpoint,
    request: ReactionsCreateForTeamDiscussionCommentLegacyRequestOptions,
    response: OctokitResponse[ReactionsCreateForTeamDiscussionCommentLegacyResponseData]
  ): ParametersReactionsCreateForTeamDiscussionCommentLegacyEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersReactionsCreateForTeamDiscussionCommentLegacyEndpoint]
  }
  @scala.inline
  implicit class ParametersReactionsCreateForTeamDiscussionCommentLegacyEndpointOps[Self <: ParametersReactionsCreateForTeamDiscussionCommentLegacyEndpoint] (val x: Self) extends AnyVal {
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
    def setParameters(value: ReactionsCreateForTeamDiscussionCommentLegacyEndpoint): Self = this.set("parameters", value.asInstanceOf[js.Any])
    @scala.inline
    def setRequest(value: ReactionsCreateForTeamDiscussionCommentLegacyRequestOptions): Self = this.set("request", value.asInstanceOf[js.Any])
    @scala.inline
    def setResponse(value: OctokitResponse[ReactionsCreateForTeamDiscussionCommentLegacyResponseData]): Self = this.set("response", value.asInstanceOf[js.Any])
  }
  
}

