package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.IssuesUpdateLabelEndpoint
import typings.octokitTypes.endpointsMod.IssuesUpdateLabelRequestOptions
import typings.octokitTypes.endpointsMod.IssuesUpdateLabelResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParametersIssuesUpdateLabelEndpoint extends js.Object {
  var parameters: IssuesUpdateLabelEndpoint = js.native
  var request: IssuesUpdateLabelRequestOptions = js.native
  var response: OctokitResponse[IssuesUpdateLabelResponseData] = js.native
}

object ParametersIssuesUpdateLabelEndpoint {
  @scala.inline
  def apply(
    parameters: IssuesUpdateLabelEndpoint,
    request: IssuesUpdateLabelRequestOptions,
    response: OctokitResponse[IssuesUpdateLabelResponseData]
  ): ParametersIssuesUpdateLabelEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersIssuesUpdateLabelEndpoint]
  }
  @scala.inline
  implicit class ParametersIssuesUpdateLabelEndpointOps[Self <: ParametersIssuesUpdateLabelEndpoint] (val x: Self) extends AnyVal {
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
    def setParameters(value: IssuesUpdateLabelEndpoint): Self = this.set("parameters", value.asInstanceOf[js.Any])
    @scala.inline
    def setRequest(value: IssuesUpdateLabelRequestOptions): Self = this.set("request", value.asInstanceOf[js.Any])
    @scala.inline
    def setResponse(value: OctokitResponse[IssuesUpdateLabelResponseData]): Self = this.set("response", value.asInstanceOf[js.Any])
  }
  
}

