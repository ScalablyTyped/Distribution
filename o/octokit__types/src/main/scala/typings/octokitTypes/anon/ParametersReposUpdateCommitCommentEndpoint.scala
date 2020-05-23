package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.ReposUpdateCommitCommentEndpoint
import typings.octokitTypes.endpointsMod.ReposUpdateCommitCommentRequestOptions
import typings.octokitTypes.endpointsMod.ReposUpdateCommitCommentResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParametersReposUpdateCommitCommentEndpoint extends js.Object {
  var parameters: ReposUpdateCommitCommentEndpoint
  var request: ReposUpdateCommitCommentRequestOptions
  var response: OctokitResponse[ReposUpdateCommitCommentResponseData]
}

object ParametersReposUpdateCommitCommentEndpoint {
  @scala.inline
  def apply(
    parameters: ReposUpdateCommitCommentEndpoint,
    request: ReposUpdateCommitCommentRequestOptions,
    response: OctokitResponse[ReposUpdateCommitCommentResponseData]
  ): ParametersReposUpdateCommitCommentEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersReposUpdateCommitCommentEndpoint]
  }
}

