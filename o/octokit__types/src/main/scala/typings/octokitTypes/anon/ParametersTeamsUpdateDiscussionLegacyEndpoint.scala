package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.TeamsUpdateDiscussionLegacyEndpoint
import typings.octokitTypes.endpointsMod.TeamsUpdateDiscussionLegacyRequestOptions
import typings.octokitTypes.endpointsMod.TeamsUpdateDiscussionLegacyResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParametersTeamsUpdateDiscussionLegacyEndpoint extends js.Object {
  var parameters: TeamsUpdateDiscussionLegacyEndpoint
  var request: TeamsUpdateDiscussionLegacyRequestOptions
  var response: OctokitResponse[TeamsUpdateDiscussionLegacyResponseData]
}

object ParametersTeamsUpdateDiscussionLegacyEndpoint {
  @scala.inline
  def apply(
    parameters: TeamsUpdateDiscussionLegacyEndpoint,
    request: TeamsUpdateDiscussionLegacyRequestOptions,
    response: OctokitResponse[TeamsUpdateDiscussionLegacyResponseData]
  ): ParametersTeamsUpdateDiscussionLegacyEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersTeamsUpdateDiscussionLegacyEndpoint]
  }
}

