package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.TeamsGetDiscussionCommentInOrgEndpoint
import typings.octokitTypes.endpointsMod.TeamsGetDiscussionCommentInOrgRequestOptions
import typings.octokitTypes.endpointsMod.TeamsGetDiscussionCommentInOrgResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParametersTeamsGetDiscussionCommentInOrgEndpoint extends js.Object {
  var parameters: TeamsGetDiscussionCommentInOrgEndpoint
  var request: TeamsGetDiscussionCommentInOrgRequestOptions
  var response: OctokitResponse[TeamsGetDiscussionCommentInOrgResponseData]
}

object ParametersTeamsGetDiscussionCommentInOrgEndpoint {
  @scala.inline
  def apply(
    parameters: TeamsGetDiscussionCommentInOrgEndpoint,
    request: TeamsGetDiscussionCommentInOrgRequestOptions,
    response: OctokitResponse[TeamsGetDiscussionCommentInOrgResponseData]
  ): ParametersTeamsGetDiscussionCommentInOrgEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersTeamsGetDiscussionCommentInOrgEndpoint]
  }
}

