package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.GitGetBlobEndpoint
import typings.octokitTypes.endpointsMod.GitGetBlobRequestOptions
import typings.octokitTypes.endpointsMod.GitGetBlobResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParametersGitGetBlobEndpoint extends js.Object {
  var parameters: GitGetBlobEndpoint
  var request: GitGetBlobRequestOptions
  var response: OctokitResponse[GitGetBlobResponseData]
}

object ParametersGitGetBlobEndpoint {
  @scala.inline
  def apply(
    parameters: GitGetBlobEndpoint,
    request: GitGetBlobRequestOptions,
    response: OctokitResponse[GitGetBlobResponseData]
  ): ParametersGitGetBlobEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersGitGetBlobEndpoint]
  }
}

