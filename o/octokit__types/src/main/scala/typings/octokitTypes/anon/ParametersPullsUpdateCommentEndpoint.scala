package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.PullsUpdateCommentEndpoint
import typings.octokitTypes.endpointsMod.PullsUpdateCommentRequestOptions
import typings.octokitTypes.endpointsMod.PullsUpdateCommentResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParametersPullsUpdateCommentEndpoint extends js.Object {
  var parameters: PullsUpdateCommentEndpoint
  var request: PullsUpdateCommentRequestOptions
  var response: OctokitResponse[PullsUpdateCommentResponseData]
}

object ParametersPullsUpdateCommentEndpoint {
  @scala.inline
  def apply(
    parameters: PullsUpdateCommentEndpoint,
    request: PullsUpdateCommentRequestOptions,
    response: OctokitResponse[PullsUpdateCommentResponseData]
  ): ParametersPullsUpdateCommentEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPullsUpdateCommentEndpoint]
  }
}

