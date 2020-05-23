package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.PullsListCommentsEndpoint
import typings.octokitTypes.endpointsMod.PullsListCommentsRequestOptions
import typings.octokitTypes.endpointsMod.PullsListCommentsResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParametersPullsListCommentsEndpoint extends js.Object {
  var parameters: PullsListCommentsEndpoint
  var request: PullsListCommentsRequestOptions
  var response: OctokitResponse[PullsListCommentsResponseData]
}

object ParametersPullsListCommentsEndpoint {
  @scala.inline
  def apply(
    parameters: PullsListCommentsEndpoint,
    request: PullsListCommentsRequestOptions,
    response: OctokitResponse[PullsListCommentsResponseData]
  ): ParametersPullsListCommentsEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPullsListCommentsEndpoint]
  }
}

