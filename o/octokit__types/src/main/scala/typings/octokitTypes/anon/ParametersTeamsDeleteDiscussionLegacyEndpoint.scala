package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.TeamsDeleteDiscussionLegacyEndpoint
import typings.octokitTypes.endpointsMod.TeamsDeleteDiscussionLegacyRequestOptions
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParametersTeamsDeleteDiscussionLegacyEndpoint extends js.Object {
  var parameters: TeamsDeleteDiscussionLegacyEndpoint
  var request: TeamsDeleteDiscussionLegacyRequestOptions
  var response: OctokitResponse[_]
}

object ParametersTeamsDeleteDiscussionLegacyEndpoint {
  @scala.inline
  def apply(
    parameters: TeamsDeleteDiscussionLegacyEndpoint,
    request: TeamsDeleteDiscussionLegacyRequestOptions,
    response: OctokitResponse[_]
  ): ParametersTeamsDeleteDiscussionLegacyEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersTeamsDeleteDiscussionLegacyEndpoint]
  }
}

