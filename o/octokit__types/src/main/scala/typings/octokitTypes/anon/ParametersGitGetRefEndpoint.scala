package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.GitGetRefEndpoint
import typings.octokitTypes.endpointsMod.GitGetRefRequestOptions
import typings.octokitTypes.endpointsMod.GitGetRefResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParametersGitGetRefEndpoint extends js.Object {
  var parameters: GitGetRefEndpoint = js.native
  var request: GitGetRefRequestOptions = js.native
  var response: OctokitResponse[GitGetRefResponseData] = js.native
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
  @scala.inline
  implicit class ParametersGitGetRefEndpointOps[Self <: ParametersGitGetRefEndpoint] (val x: Self) extends AnyVal {
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
    def setParameters(value: GitGetRefEndpoint): Self = this.set("parameters", value.asInstanceOf[js.Any])
    @scala.inline
    def setRequest(value: GitGetRefRequestOptions): Self = this.set("request", value.asInstanceOf[js.Any])
    @scala.inline
    def setResponse(value: OctokitResponse[GitGetRefResponseData]): Self = this.set("response", value.asInstanceOf[js.Any])
  }
  
}

