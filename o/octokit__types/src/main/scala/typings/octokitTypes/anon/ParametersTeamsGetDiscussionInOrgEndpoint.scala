package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.TeamsGetDiscussionInOrgEndpoint
import typings.octokitTypes.endpointsMod.TeamsGetDiscussionInOrgRequestOptions
import typings.octokitTypes.endpointsMod.TeamsGetDiscussionInOrgResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParametersTeamsGetDiscussionInOrgEndpoint extends js.Object {
  var parameters: TeamsGetDiscussionInOrgEndpoint
  var request: TeamsGetDiscussionInOrgRequestOptions
  var response: OctokitResponse[TeamsGetDiscussionInOrgResponseData]
}

object ParametersTeamsGetDiscussionInOrgEndpoint {
  @scala.inline
  def apply(
    parameters: TeamsGetDiscussionInOrgEndpoint,
    request: TeamsGetDiscussionInOrgRequestOptions,
    response: OctokitResponse[TeamsGetDiscussionInOrgResponseData]
  ): ParametersTeamsGetDiscussionInOrgEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersTeamsGetDiscussionInOrgEndpoint]
  }
}

