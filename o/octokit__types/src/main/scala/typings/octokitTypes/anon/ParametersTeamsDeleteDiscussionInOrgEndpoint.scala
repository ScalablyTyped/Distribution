package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.TeamsDeleteDiscussionInOrgEndpoint
import typings.octokitTypes.endpointsMod.TeamsDeleteDiscussionInOrgRequestOptions
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParametersTeamsDeleteDiscussionInOrgEndpoint extends js.Object {
  var parameters: TeamsDeleteDiscussionInOrgEndpoint
  var request: TeamsDeleteDiscussionInOrgRequestOptions
  var response: OctokitResponse[_]
}

object ParametersTeamsDeleteDiscussionInOrgEndpoint {
  @scala.inline
  def apply(
    parameters: TeamsDeleteDiscussionInOrgEndpoint,
    request: TeamsDeleteDiscussionInOrgRequestOptions,
    response: OctokitResponse[_]
  ): ParametersTeamsDeleteDiscussionInOrgEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersTeamsDeleteDiscussionInOrgEndpoint]
  }
}

