package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.ReactionsCreateForCommitCommentEndpoint
import typings.octokitTypes.endpointsMod.ReactionsCreateForCommitCommentRequestOptions
import typings.octokitTypes.endpointsMod.ReactionsCreateForCommitCommentResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParametersReactionsCreateForCommitCommentEndpoint extends js.Object {
  var parameters: ReactionsCreateForCommitCommentEndpoint
  var request: ReactionsCreateForCommitCommentRequestOptions
  var response: OctokitResponse[ReactionsCreateForCommitCommentResponseData]
}

object ParametersReactionsCreateForCommitCommentEndpoint {
  @scala.inline
  def apply(
    parameters: ReactionsCreateForCommitCommentEndpoint,
    request: ReactionsCreateForCommitCommentRequestOptions,
    response: OctokitResponse[ReactionsCreateForCommitCommentResponseData]
  ): ParametersReactionsCreateForCommitCommentEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersReactionsCreateForCommitCommentEndpoint]
  }
}

