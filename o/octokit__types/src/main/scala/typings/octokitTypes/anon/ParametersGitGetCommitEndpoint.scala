package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.GitGetCommitEndpoint
import typings.octokitTypes.endpointsMod.GitGetCommitRequestOptions
import typings.octokitTypes.endpointsMod.GitGetCommitResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParametersGitGetCommitEndpoint extends js.Object {
  var parameters: GitGetCommitEndpoint
  var request: GitGetCommitRequestOptions
  var response: OctokitResponse[GitGetCommitResponseData]
}

object ParametersGitGetCommitEndpoint {
  @scala.inline
  def apply(
    parameters: GitGetCommitEndpoint,
    request: GitGetCommitRequestOptions,
    response: OctokitResponse[GitGetCommitResponseData]
  ): ParametersGitGetCommitEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersGitGetCommitEndpoint]
  }
}

