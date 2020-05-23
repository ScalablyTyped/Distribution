package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.TeamsUpdateDiscussionCommentInOrgEndpoint
import typings.octokitTypes.endpointsMod.TeamsUpdateDiscussionCommentInOrgRequestOptions
import typings.octokitTypes.endpointsMod.TeamsUpdateDiscussionCommentInOrgResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParametersTeamsUpdateDiscussionCommentInOrgEndpoint extends js.Object {
  var parameters: TeamsUpdateDiscussionCommentInOrgEndpoint
  var request: TeamsUpdateDiscussionCommentInOrgRequestOptions
  var response: OctokitResponse[TeamsUpdateDiscussionCommentInOrgResponseData]
}

object ParametersTeamsUpdateDiscussionCommentInOrgEndpoint {
  @scala.inline
  def apply(
    parameters: TeamsUpdateDiscussionCommentInOrgEndpoint,
    request: TeamsUpdateDiscussionCommentInOrgRequestOptions,
    response: OctokitResponse[TeamsUpdateDiscussionCommentInOrgResponseData]
  ): ParametersTeamsUpdateDiscussionCommentInOrgEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersTeamsUpdateDiscussionCommentInOrgEndpoint]
  }
}

