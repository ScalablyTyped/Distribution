package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.GitCreateCommitEndpoint
import typings.octokitTypes.endpointsMod.GitCreateCommitRequestOptions
import typings.octokitTypes.endpointsMod.GitCreateCommitResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParametersGitCreateCommitEndpoint extends js.Object {
  var parameters: GitCreateCommitEndpoint
  var request: GitCreateCommitRequestOptions
  var response: OctokitResponse[GitCreateCommitResponseData]
}

object ParametersGitCreateCommitEndpoint {
  @scala.inline
  def apply(
    parameters: GitCreateCommitEndpoint,
    request: GitCreateCommitRequestOptions,
    response: OctokitResponse[GitCreateCommitResponseData]
  ): ParametersGitCreateCommitEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersGitCreateCommitEndpoint]
  }
}

