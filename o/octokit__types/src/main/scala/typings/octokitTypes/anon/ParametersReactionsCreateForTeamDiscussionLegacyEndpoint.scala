package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.ReactionsCreateForTeamDiscussionLegacyEndpoint
import typings.octokitTypes.endpointsMod.ReactionsCreateForTeamDiscussionLegacyRequestOptions
import typings.octokitTypes.endpointsMod.ReactionsCreateForTeamDiscussionLegacyResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParametersReactionsCreateForTeamDiscussionLegacyEndpoint extends js.Object {
  var parameters: ReactionsCreateForTeamDiscussionLegacyEndpoint
  var request: ReactionsCreateForTeamDiscussionLegacyRequestOptions
  var response: OctokitResponse[ReactionsCreateForTeamDiscussionLegacyResponseData]
}

object ParametersReactionsCreateForTeamDiscussionLegacyEndpoint {
  @scala.inline
  def apply(
    parameters: ReactionsCreateForTeamDiscussionLegacyEndpoint,
    request: ReactionsCreateForTeamDiscussionLegacyRequestOptions,
    response: OctokitResponse[ReactionsCreateForTeamDiscussionLegacyResponseData]
  ): ParametersReactionsCreateForTeamDiscussionLegacyEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersReactionsCreateForTeamDiscussionLegacyEndpoint]
  }
}

