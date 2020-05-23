package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.GitCreateRefEndpoint
import typings.octokitTypes.endpointsMod.GitCreateRefRequestOptions
import typings.octokitTypes.endpointsMod.GitCreateRefResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParametersGitCreateRefEndpoint extends js.Object {
  var parameters: GitCreateRefEndpoint
  var request: GitCreateRefRequestOptions
  var response: OctokitResponse[GitCreateRefResponseData]
}

object ParametersGitCreateRefEndpoint {
  @scala.inline
  def apply(
    parameters: GitCreateRefEndpoint,
    request: GitCreateRefRequestOptions,
    response: OctokitResponse[GitCreateRefResponseData]
  ): ParametersGitCreateRefEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersGitCreateRefEndpoint]
  }
}

