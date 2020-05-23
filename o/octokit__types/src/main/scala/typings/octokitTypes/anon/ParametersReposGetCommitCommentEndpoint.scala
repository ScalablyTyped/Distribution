package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.ReposGetCommitCommentEndpoint
import typings.octokitTypes.endpointsMod.ReposGetCommitCommentRequestOptions
import typings.octokitTypes.endpointsMod.ReposGetCommitCommentResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParametersReposGetCommitCommentEndpoint extends js.Object {
  var parameters: ReposGetCommitCommentEndpoint
  var request: ReposGetCommitCommentRequestOptions
  var response: OctokitResponse[ReposGetCommitCommentResponseData]
}

object ParametersReposGetCommitCommentEndpoint {
  @scala.inline
  def apply(
    parameters: ReposGetCommitCommentEndpoint,
    request: ReposGetCommitCommentRequestOptions,
    response: OctokitResponse[ReposGetCommitCommentResponseData]
  ): ParametersReposGetCommitCommentEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersReposGetCommitCommentEndpoint]
  }
}

