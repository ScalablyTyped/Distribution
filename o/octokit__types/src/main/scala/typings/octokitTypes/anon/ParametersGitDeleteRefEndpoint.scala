package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.GitDeleteRefEndpoint
import typings.octokitTypes.endpointsMod.GitDeleteRefRequestOptions
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParametersGitDeleteRefEndpoint extends js.Object {
  var parameters: GitDeleteRefEndpoint
  var request: GitDeleteRefRequestOptions
  var response: OctokitResponse[_]
}

object ParametersGitDeleteRefEndpoint {
  @scala.inline
  def apply(
    parameters: GitDeleteRefEndpoint,
    request: GitDeleteRefRequestOptions,
    response: OctokitResponse[_]
  ): ParametersGitDeleteRefEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersGitDeleteRefEndpoint]
  }
}

