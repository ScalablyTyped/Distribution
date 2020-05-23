package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.TeamsCreateDiscussionInOrgEndpoint
import typings.octokitTypes.endpointsMod.TeamsCreateDiscussionInOrgRequestOptions
import typings.octokitTypes.endpointsMod.TeamsCreateDiscussionInOrgResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParametersTeamsCreateDiscussionInOrgEndpoint extends js.Object {
  var parameters: TeamsCreateDiscussionInOrgEndpoint
  var request: TeamsCreateDiscussionInOrgRequestOptions
  var response: OctokitResponse[TeamsCreateDiscussionInOrgResponseData]
}

object ParametersTeamsCreateDiscussionInOrgEndpoint {
  @scala.inline
  def apply(
    parameters: TeamsCreateDiscussionInOrgEndpoint,
    request: TeamsCreateDiscussionInOrgRequestOptions,
    response: OctokitResponse[TeamsCreateDiscussionInOrgResponseData]
  ): ParametersTeamsCreateDiscussionInOrgEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersTeamsCreateDiscussionInOrgEndpoint]
  }
}

