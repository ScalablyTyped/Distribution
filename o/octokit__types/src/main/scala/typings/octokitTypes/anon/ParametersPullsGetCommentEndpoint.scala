package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.PullsGetCommentEndpoint
import typings.octokitTypes.endpointsMod.PullsGetCommentRequestOptions
import typings.octokitTypes.endpointsMod.PullsGetCommentResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParametersPullsGetCommentEndpoint extends js.Object {
  var parameters: PullsGetCommentEndpoint
  var request: PullsGetCommentRequestOptions
  var response: OctokitResponse[PullsGetCommentResponseData]
}

object ParametersPullsGetCommentEndpoint {
  @scala.inline
  def apply(
    parameters: PullsGetCommentEndpoint,
    request: PullsGetCommentRequestOptions,
    response: OctokitResponse[PullsGetCommentResponseData]
  ): ParametersPullsGetCommentEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPullsGetCommentEndpoint]
  }
}

