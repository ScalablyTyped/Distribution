package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.TeamsCreateDiscussionLegacyEndpoint
import typings.octokitTypes.endpointsMod.TeamsCreateDiscussionLegacyRequestOptions
import typings.octokitTypes.endpointsMod.TeamsCreateDiscussionLegacyResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParametersTeamsCreateDiscussionLegacyEndpoint extends js.Object {
  var parameters: TeamsCreateDiscussionLegacyEndpoint
  var request: TeamsCreateDiscussionLegacyRequestOptions
  var response: OctokitResponse[TeamsCreateDiscussionLegacyResponseData]
}

object ParametersTeamsCreateDiscussionLegacyEndpoint {
  @scala.inline
  def apply(
    parameters: TeamsCreateDiscussionLegacyEndpoint,
    request: TeamsCreateDiscussionLegacyRequestOptions,
    response: OctokitResponse[TeamsCreateDiscussionLegacyResponseData]
  ): ParametersTeamsCreateDiscussionLegacyEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersTeamsCreateDiscussionLegacyEndpoint]
  }
}

