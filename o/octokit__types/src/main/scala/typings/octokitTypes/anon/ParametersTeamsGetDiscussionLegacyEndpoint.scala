package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.TeamsGetDiscussionLegacyEndpoint
import typings.octokitTypes.endpointsMod.TeamsGetDiscussionLegacyRequestOptions
import typings.octokitTypes.endpointsMod.TeamsGetDiscussionLegacyResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParametersTeamsGetDiscussionLegacyEndpoint extends js.Object {
  var parameters: TeamsGetDiscussionLegacyEndpoint
  var request: TeamsGetDiscussionLegacyRequestOptions
  var response: OctokitResponse[TeamsGetDiscussionLegacyResponseData]
}

object ParametersTeamsGetDiscussionLegacyEndpoint {
  @scala.inline
  def apply(
    parameters: TeamsGetDiscussionLegacyEndpoint,
    request: TeamsGetDiscussionLegacyRequestOptions,
    response: OctokitResponse[TeamsGetDiscussionLegacyResponseData]
  ): ParametersTeamsGetDiscussionLegacyEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersTeamsGetDiscussionLegacyEndpoint]
  }
}

