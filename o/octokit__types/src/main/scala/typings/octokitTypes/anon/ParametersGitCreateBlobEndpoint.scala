package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.GitCreateBlobEndpoint
import typings.octokitTypes.endpointsMod.GitCreateBlobRequestOptions
import typings.octokitTypes.endpointsMod.GitCreateBlobResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParametersGitCreateBlobEndpoint extends js.Object {
  var parameters: GitCreateBlobEndpoint
  var request: GitCreateBlobRequestOptions
  var response: OctokitResponse[GitCreateBlobResponseData]
}

object ParametersGitCreateBlobEndpoint {
  @scala.inline
  def apply(
    parameters: GitCreateBlobEndpoint,
    request: GitCreateBlobRequestOptions,
    response: OctokitResponse[GitCreateBlobResponseData]
  ): ParametersGitCreateBlobEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersGitCreateBlobEndpoint]
  }
}

