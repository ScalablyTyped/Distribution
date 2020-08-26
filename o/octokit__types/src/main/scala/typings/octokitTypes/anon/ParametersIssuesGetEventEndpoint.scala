package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.IssuesGetEventEndpoint
import typings.octokitTypes.endpointsMod.IssuesGetEventRequestOptions
import typings.octokitTypes.endpointsMod.IssuesGetEventResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParametersIssuesGetEventEndpoint extends js.Object {
  var parameters: IssuesGetEventEndpoint = js.native
  var request: IssuesGetEventRequestOptions = js.native
  var response: OctokitResponse[IssuesGetEventResponseData] = js.native
}

object ParametersIssuesGetEventEndpoint {
  @scala.inline
  def apply(
    parameters: IssuesGetEventEndpoint,
    request: IssuesGetEventRequestOptions,
    response: OctokitResponse[IssuesGetEventResponseData]
  ): ParametersIssuesGetEventEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersIssuesGetEventEndpoint]
  }
  @scala.inline
  implicit class ParametersIssuesGetEventEndpointOps[Self <: ParametersIssuesGetEventEndpoint] (val x: Self) extends AnyVal {
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
    def setParameters(value: IssuesGetEventEndpoint): Self = this.set("parameters", value.asInstanceOf[js.Any])
    @scala.inline
    def setRequest(value: IssuesGetEventRequestOptions): Self = this.set("request", value.asInstanceOf[js.Any])
    @scala.inline
    def setResponse(value: OctokitResponse[IssuesGetEventResponseData]): Self = this.set("response", value.asInstanceOf[js.Any])
  }
  
}

