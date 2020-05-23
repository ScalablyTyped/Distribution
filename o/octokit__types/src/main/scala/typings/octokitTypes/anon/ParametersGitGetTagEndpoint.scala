package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.GitGetTagEndpoint
import typings.octokitTypes.endpointsMod.GitGetTagRequestOptions
import typings.octokitTypes.endpointsMod.GitGetTagResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParametersGitGetTagEndpoint extends js.Object {
  var parameters: GitGetTagEndpoint
  var request: GitGetTagRequestOptions
  var response: OctokitResponse[GitGetTagResponseData]
}

object ParametersGitGetTagEndpoint {
  @scala.inline
  def apply(
    parameters: GitGetTagEndpoint,
    request: GitGetTagRequestOptions,
    response: OctokitResponse[GitGetTagResponseData]
  ): ParametersGitGetTagEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersGitGetTagEndpoint]
  }
}

