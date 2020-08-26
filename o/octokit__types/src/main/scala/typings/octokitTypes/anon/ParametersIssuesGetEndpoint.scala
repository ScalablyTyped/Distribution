package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.IssuesGetEndpoint
import typings.octokitTypes.endpointsMod.IssuesGetRequestOptions
import typings.octokitTypes.endpointsMod.IssuesGetResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParametersIssuesGetEndpoint extends js.Object {
  var parameters: IssuesGetEndpoint = js.native
  var request: IssuesGetRequestOptions = js.native
  var response: OctokitResponse[IssuesGetResponseData] = js.native
}

object ParametersIssuesGetEndpoint {
  @scala.inline
  def apply(
    parameters: IssuesGetEndpoint,
    request: IssuesGetRequestOptions,
    response: OctokitResponse[IssuesGetResponseData]
  ): ParametersIssuesGetEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersIssuesGetEndpoint]
  }
  @scala.inline
  implicit class ParametersIssuesGetEndpointOps[Self <: ParametersIssuesGetEndpoint] (val x: Self) extends AnyVal {
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
    def setParameters(value: IssuesGetEndpoint): Self = this.set("parameters", value.asInstanceOf[js.Any])
    @scala.inline
    def setRequest(value: IssuesGetRequestOptions): Self = this.set("request", value.asInstanceOf[js.Any])
    @scala.inline
    def setResponse(value: OctokitResponse[IssuesGetResponseData]): Self = this.set("response", value.asInstanceOf[js.Any])
  }
  
}

