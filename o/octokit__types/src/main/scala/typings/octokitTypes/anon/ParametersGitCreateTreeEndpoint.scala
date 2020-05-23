package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.GitCreateTreeEndpoint
import typings.octokitTypes.endpointsMod.GitCreateTreeRequestOptions
import typings.octokitTypes.endpointsMod.GitCreateTreeResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParametersGitCreateTreeEndpoint extends js.Object {
  var parameters: GitCreateTreeEndpoint
  var request: GitCreateTreeRequestOptions
  var response: OctokitResponse[GitCreateTreeResponseData]
}

object ParametersGitCreateTreeEndpoint {
  @scala.inline
  def apply(
    parameters: GitCreateTreeEndpoint,
    request: GitCreateTreeRequestOptions,
    response: OctokitResponse[GitCreateTreeResponseData]
  ): ParametersGitCreateTreeEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersGitCreateTreeEndpoint]
  }
}

