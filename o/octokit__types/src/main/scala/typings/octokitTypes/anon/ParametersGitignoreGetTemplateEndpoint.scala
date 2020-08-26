package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.GitignoreGetTemplateEndpoint
import typings.octokitTypes.endpointsMod.GitignoreGetTemplateRequestOptions
import typings.octokitTypes.endpointsMod.GitignoreGetTemplateResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParametersGitignoreGetTemplateEndpoint extends js.Object {
  var parameters: GitignoreGetTemplateEndpoint = js.native
  var request: GitignoreGetTemplateRequestOptions = js.native
  var response: OctokitResponse[GitignoreGetTemplateResponseData] = js.native
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
  @scala.inline
  implicit class ParametersGitignoreGetTemplateEndpointOps[Self <: ParametersGitignoreGetTemplateEndpoint] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setParameters(value: GitignoreGetTemplateEndpoint): Self = this.set("parameters", value.asInstanceOf[js.Any])
    @scala.inline
    def setRequest(value: GitignoreGetTemplateRequestOptions): Self = this.set("request", value.asInstanceOf[js.Any])
    @scala.inline
    def setResponse(value: OctokitResponse[GitignoreGetTemplateResponseData]): Self = this.set("response", value.asInstanceOf[js.Any])
  }
  
}

