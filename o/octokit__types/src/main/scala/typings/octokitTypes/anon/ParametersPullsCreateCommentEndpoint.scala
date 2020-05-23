package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.PullsCreateCommentEndpoint
import typings.octokitTypes.endpointsMod.PullsCreateCommentRequestOptions
import typings.octokitTypes.endpointsMod.PullsCreateCommentResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParametersPullsCreateCommentEndpoint extends js.Object {
  var parameters: PullsCreateCommentEndpoint
  var request: PullsCreateCommentRequestOptions
  var response: OctokitResponse[PullsCreateCommentResponseData]
}

object ParametersPullsCreateCommentEndpoint {
  @scala.inline
  def apply(
    parameters: PullsCreateCommentEndpoint,
    request: PullsCreateCommentRequestOptions,
    response: OctokitResponse[PullsCreateCommentResponseData]
  ): ParametersPullsCreateCommentEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPullsCreateCommentEndpoint]
  }
}

