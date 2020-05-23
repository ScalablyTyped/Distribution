package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.ReactionsCreateForTeamDiscussionInOrgEndpoint
import typings.octokitTypes.endpointsMod.ReactionsCreateForTeamDiscussionInOrgRequestOptions
import typings.octokitTypes.endpointsMod.ReactionsCreateForTeamDiscussionInOrgResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParametersReactionsCreateForTeamDiscussionInOrgEndpoint extends js.Object {
  var parameters: ReactionsCreateForTeamDiscussionInOrgEndpoint
  var request: ReactionsCreateForTeamDiscussionInOrgRequestOptions
  var response: OctokitResponse[ReactionsCreateForTeamDiscussionInOrgResponseData]
}

object ParametersReactionsCreateForTeamDiscussionInOrgEndpoint {
  @scala.inline
  def apply(
    parameters: ReactionsCreateForTeamDiscussionInOrgEndpoint,
    request: ReactionsCreateForTeamDiscussionInOrgRequestOptions,
    response: OctokitResponse[ReactionsCreateForTeamDiscussionInOrgResponseData]
  ): ParametersReactionsCreateForTeamDiscussionInOrgEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersReactionsCreateForTeamDiscussionInOrgEndpoint]
  }
}

