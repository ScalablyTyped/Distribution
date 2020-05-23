package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.ReposListCommentsForCommitEndpoint
import typings.octokitTypes.endpointsMod.ReposListCommentsForCommitRequestOptions
import typings.octokitTypes.endpointsMod.ReposListCommentsForCommitResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParametersReposListCommentsForCommitEndpoint extends js.Object {
  var parameters: ReposListCommentsForCommitEndpoint
  var request: ReposListCommentsForCommitRequestOptions
  var response: OctokitResponse[ReposListCommentsForCommitResponseData]
}

object ParametersReposListCommentsForCommitEndpoint {
  @scala.inline
  def apply(
    parameters: ReposListCommentsForCommitEndpoint,
    request: ReposListCommentsForCommitRequestOptions,
    response: OctokitResponse[ReposListCommentsForCommitResponseData]
  ): ParametersReposListCommentsForCommitEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersReposListCommentsForCommitEndpoint]
  }
}

