package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.GitListMatchingRefsEndpoint
import typings.octokitTypes.endpointsMod.GitListMatchingRefsRequestOptions
import typings.octokitTypes.endpointsMod.GitListMatchingRefsResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParametersGitListMatchingRefsEndpoint extends js.Object {
  var parameters: GitListMatchingRefsEndpoint = js.native
  var request: GitListMatchingRefsRequestOptions = js.native
  var response: OctokitResponse[GitListMatchingRefsResponseData] = js.native
}

object ParametersGitListMatchingRefsEndpoint {
  @scala.inline
  def apply(
    parameters: GitListMatchingRefsEndpoint,
    request: GitListMatchingRefsRequestOptions,
    response: OctokitResponse[GitListMatchingRefsResponseData]
  ): ParametersGitListMatchingRefsEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersGitListMatchingRefsEndpoint]
  }
  @scala.inline
  implicit class ParametersGitListMatchingRefsEndpointOps[Self <: ParametersGitListMatchingRefsEndpoint] (val x: Self) extends AnyVal {
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
    def setParameters(value: GitListMatchingRefsEndpoint): Self = this.set("parameters", value.asInstanceOf[js.Any])
    @scala.inline
    def setRequest(value: GitListMatchingRefsRequestOptions): Self = this.set("request", value.asInstanceOf[js.Any])
    @scala.inline
    def setResponse(value: OctokitResponse[GitListMatchingRefsResponseData]): Self = this.set("response", value.asInstanceOf[js.Any])
  }
  
}

