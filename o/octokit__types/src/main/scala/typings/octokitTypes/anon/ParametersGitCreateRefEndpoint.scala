package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.GitCreateRefEndpoint
import typings.octokitTypes.endpointsMod.GitCreateRefRequestOptions
import typings.octokitTypes.endpointsMod.GitCreateRefResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParametersGitCreateRefEndpoint extends js.Object {
  var parameters: GitCreateRefEndpoint = js.native
  var request: GitCreateRefRequestOptions = js.native
  var response: OctokitResponse[GitCreateRefResponseData] = js.native
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
  @scala.inline
  implicit class ParametersGitCreateRefEndpointOps[Self <: ParametersGitCreateRefEndpoint] (val x: Self) extends AnyVal {
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
    def setParameters(value: GitCreateRefEndpoint): Self = this.set("parameters", value.asInstanceOf[js.Any])
    @scala.inline
    def setRequest(value: GitCreateRefRequestOptions): Self = this.set("request", value.asInstanceOf[js.Any])
    @scala.inline
    def setResponse(value: OctokitResponse[GitCreateRefResponseData]): Self = this.set("response", value.asInstanceOf[js.Any])
  }
  
}

