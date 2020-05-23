package typings.octokitPluginPaginateRest.anon

import typings.octokitTypes.endpointsMod.TeamsListDiscussionCommentsLegacyEndpoint
import typings.octokitTypes.endpointsMod.TeamsListDiscussionCommentsLegacyResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParametersTeamsListDiscussionCommentsLegacyEndpoint extends js.Object {
  var parameters: TeamsListDiscussionCommentsLegacyEndpoint
  var response: OctokitResponse[TeamsListDiscussionCommentsLegacyResponseData]
}

object ParametersTeamsListDiscussionCommentsLegacyEndpoint {
  @scala.inline
  def apply(
    parameters: TeamsListDiscussionCommentsLegacyEndpoint,
    response: OctokitResponse[TeamsListDiscussionCommentsLegacyResponseData]
  ): ParametersTeamsListDiscussionCommentsLegacyEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersTeamsListDiscussionCommentsLegacyEndpoint]
  }
}

