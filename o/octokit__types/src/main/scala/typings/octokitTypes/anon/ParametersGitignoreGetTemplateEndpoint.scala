package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.GitignoreGetTemplateEndpoint
import typings.octokitTypes.endpointsMod.GitignoreGetTemplateRequestOptions
import typings.octokitTypes.endpointsMod.GitignoreGetTemplateResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParametersGitignoreGetTemplateEndpoint extends js.Object {
  var parameters: GitignoreGetTemplateEndpoint
  var request: GitignoreGetTemplateRequestOptions
  var response: OctokitResponse[GitignoreGetTemplateResponseData]
}

object ParametersGitignoreGetTemplateEndpoint {
  @scala.inline
  def apply(
    parameters: GitignoreGetTemplateEndpoint,
    request: GitignoreGetTemplateRequestOptions,
    response: OctokitResponse[GitignoreGetTemplateResponseData]
  ): ParametersGitignoreGetTemplateEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersGitignoreGetTemplateEndpoint]
  }
}

