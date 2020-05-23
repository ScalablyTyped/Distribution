package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.GitUpdateRefEndpoint
import typings.octokitTypes.endpointsMod.GitUpdateRefRequestOptions
import typings.octokitTypes.endpointsMod.GitUpdateRefResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParametersGitUpdateRefEndpoint extends js.Object {
  var parameters: GitUpdateRefEndpoint
  var request: GitUpdateRefRequestOptions
  var response: OctokitResponse[GitUpdateRefResponseData]
}

object ParametersGitUpdateRefEndpoint {
  @scala.inline
  def apply(
    parameters: GitUpdateRefEndpoint,
    request: GitUpdateRefRequestOptions,
    response: OctokitResponse[GitUpdateRefResponseData]
  ): ParametersGitUpdateRefEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersGitUpdateRefEndpoint]
  }
}

