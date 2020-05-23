package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.GitGetRefEndpoint
import typings.octokitTypes.endpointsMod.GitGetRefRequestOptions
import typings.octokitTypes.endpointsMod.GitGetRefResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParametersGitGetRefEndpoint extends js.Object {
  var parameters: GitGetRefEndpoint
  var request: GitGetRefRequestOptions
  var response: OctokitResponse[GitGetRefResponseData]
}

object ParametersGitGetRefEndpoint {
  @scala.inline
  def apply(
    parameters: GitGetRefEndpoint,
    request: GitGetRefRequestOptions,
    response: OctokitResponse[GitGetRefResponseData]
  ): ParametersGitGetRefEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersGitGetRefEndpoint]
  }
}

