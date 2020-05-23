package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.ReactionsListForTeamDiscussionLegacyEndpoint
import typings.octokitTypes.endpointsMod.ReactionsListForTeamDiscussionLegacyRequestOptions
import typings.octokitTypes.endpointsMod.ReactionsListForTeamDiscussionLegacyResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParametersReactionsListForTeamDiscussionLegacyEndpoint extends js.Object {
  var parameters: ReactionsListForTeamDiscussionLegacyEndpoint
  var request: ReactionsListForTeamDiscussionLegacyRequestOptions
  var response: OctokitResponse[ReactionsListForTeamDiscussionLegacyResponseData]
}

object ParametersReactionsListForTeamDiscussionLegacyEndpoint {
  @scala.inline
  def apply(
    parameters: ReactionsListForTeamDiscussionLegacyEndpoint,
    request: ReactionsListForTeamDiscussionLegacyRequestOptions,
    response: OctokitResponse[ReactionsListForTeamDiscussionLegacyResponseData]
  ): ParametersReactionsListForTeamDiscussionLegacyEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersReactionsListForTeamDiscussionLegacyEndpoint]
  }
}

