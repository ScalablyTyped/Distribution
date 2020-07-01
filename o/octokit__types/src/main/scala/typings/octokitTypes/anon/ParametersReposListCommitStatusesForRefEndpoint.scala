package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.ReposListCommitStatusesForRefEndpoint
import typings.octokitTypes.endpointsMod.ReposListCommitStatusesForRefRequestOptions
import typings.octokitTypes.endpointsMod.ReposListCommitStatusesForRefResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParametersReposListCommitStatusesForRefEndpoint extends js.Object {
  var parameters: ReposListCommitStatusesForRefEndpoint
  var request: ReposListCommitStatusesForRefRequestOptions
  var response: OctokitResponse[ReposListCommitStatusesForRefResponseData]
}

object ParametersReposListCommitStatusesForRefEndpoint {
  @scala.inline
  def apply(
    parameters: ReposListCommitStatusesForRefEndpoint,
    request: ReposListCommitStatusesForRefRequestOptions,
    response: OctokitResponse[ReposListCommitStatusesForRefResponseData]
  ): ParametersReposListCommitStatusesForRefEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersReposListCommitStatusesForRefEndpoint]
  }
}

