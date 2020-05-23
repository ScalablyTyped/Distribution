package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.ReactionsDeleteForTeamDiscussionEndpoint
import typings.octokitTypes.endpointsMod.ReactionsDeleteForTeamDiscussionRequestOptions
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParametersReactionsDeleteForTeamDiscussionEndpoint extends js.Object {
  var parameters: ReactionsDeleteForTeamDiscussionEndpoint
  var request: ReactionsDeleteForTeamDiscussionRequestOptions
  var response: OctokitResponse[_]
}

object ParametersReactionsDeleteForTeamDiscussionEndpoint {
  @scala.inline
  def apply(
    parameters: ReactionsDeleteForTeamDiscussionEndpoint,
    request: ReactionsDeleteForTeamDiscussionRequestOptions,
    response: OctokitResponse[_]
  ): ParametersReactionsDeleteForTeamDiscussionEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersReactionsDeleteForTeamDiscussionEndpoint]
  }
}

