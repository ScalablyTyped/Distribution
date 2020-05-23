package typings.octokitPluginPaginateRest.anon

import typings.octokitTypes.endpointsMod.ReactionsListForTeamDiscussionLegacyEndpoint
import typings.octokitTypes.endpointsMod.ReactionsListForTeamDiscussionLegacyResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParametersReactionsListForTeamDiscussionLegacyEndpoint extends js.Object {
  var parameters: ReactionsListForTeamDiscussionLegacyEndpoint
  var response: OctokitResponse[ReactionsListForTeamDiscussionLegacyResponseData]
}

object ParametersReactionsListForTeamDiscussionLegacyEndpoint {
  @scala.inline
  def apply(
    parameters: ReactionsListForTeamDiscussionLegacyEndpoint,
    response: OctokitResponse[ReactionsListForTeamDiscussionLegacyResponseData]
  ): ParametersReactionsListForTeamDiscussionLegacyEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersReactionsListForTeamDiscussionLegacyEndpoint]
  }
}

