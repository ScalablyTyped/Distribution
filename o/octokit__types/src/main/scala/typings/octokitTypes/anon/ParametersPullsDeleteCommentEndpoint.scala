package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.PullsDeleteCommentEndpoint
import typings.octokitTypes.endpointsMod.PullsDeleteCommentRequestOptions
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParametersPullsDeleteCommentEndpoint extends js.Object {
  var parameters: PullsDeleteCommentEndpoint
  var request: PullsDeleteCommentRequestOptions
  var response: OctokitResponse[_]
}

object ParametersPullsDeleteCommentEndpoint {
  @scala.inline
  def apply(
    parameters: PullsDeleteCommentEndpoint,
    request: PullsDeleteCommentRequestOptions,
    response: OctokitResponse[_]
  ): ParametersPullsDeleteCommentEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPullsDeleteCommentEndpoint]
  }
}

