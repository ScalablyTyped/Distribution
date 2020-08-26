package typings.octokitPluginPaginateRest.anon

import typings.octokitTypes.endpointsMod.ReactionsListForTeamDiscussionCommentInOrgEndpoint
import typings.octokitTypes.endpointsMod.ReactionsListForTeamDiscussionCommentInOrgResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParametersReactionsListForTeamDiscussionCommentInOrgEndpoint extends js.Object {
  var parameters: ReactionsListForTeamDiscussionCommentInOrgEndpoint = js.native
  var response: OctokitResponse[ReactionsListForTeamDiscussionCommentInOrgResponseData] = js.native
}

object ParametersReactionsListForTeamDiscussionCommentInOrgEndpoint {
  @scala.inline
  def apply(
    parameters: ReactionsListForTeamDiscussionCommentInOrgEndpoint,
    response: OctokitResponse[ReactionsListForTeamDiscussionCommentInOrgResponseData]
  ): ParametersReactionsListForTeamDiscussionCommentInOrgEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersReactionsListForTeamDiscussionCommentInOrgEndpoint]
  }
  @scala.inline
  implicit class ParametersReactionsListForTeamDiscussionCommentInOrgEndpointOps[Self <: ParametersReactionsListForTeamDiscussionCommentInOrgEndpoint] (val x: Self) extends AnyVal {
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
    def setParameters(value: ReactionsListForTeamDiscussionCommentInOrgEndpoint): Self = this.set("parameters", value.asInstanceOf[js.Any])
    @scala.inline
    def setResponse(value: OctokitResponse[ReactionsListForTeamDiscussionCommentInOrgResponseData]): Self = this.set("response", value.asInstanceOf[js.Any])
  }
  
}

