package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.GitCreateTagEndpoint
import typings.octokitTypes.endpointsMod.GitCreateTagRequestOptions
import typings.octokitTypes.endpointsMod.GitCreateTagResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParametersGitCreateTagEndpoint extends js.Object {
  var parameters: GitCreateTagEndpoint
  var request: GitCreateTagRequestOptions
  var response: OctokitResponse[GitCreateTagResponseData]
}

object ParametersGitCreateTagEndpoint {
  @scala.inline
  def apply(
    parameters: GitCreateTagEndpoint,
    request: GitCreateTagRequestOptions,
    response: OctokitResponse[GitCreateTagResponseData]
  ): ParametersGitCreateTagEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersGitCreateTagEndpoint]
  }
}

