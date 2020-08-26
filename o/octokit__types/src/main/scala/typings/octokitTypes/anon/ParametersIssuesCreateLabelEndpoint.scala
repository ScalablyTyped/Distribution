package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.IssuesCreateLabelEndpoint
import typings.octokitTypes.endpointsMod.IssuesCreateLabelRequestOptions
import typings.octokitTypes.endpointsMod.IssuesCreateLabelResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParametersIssuesCreateLabelEndpoint extends js.Object {
  var parameters: IssuesCreateLabelEndpoint = js.native
  var request: IssuesCreateLabelRequestOptions = js.native
  var response: OctokitResponse[IssuesCreateLabelResponseData] = js.native
}

object ParametersIssuesCreateLabelEndpoint {
  @scala.inline
  def apply(
    parameters: IssuesCreateLabelEndpoint,
    request: IssuesCreateLabelRequestOptions,
    response: OctokitResponse[IssuesCreateLabelResponseData]
  ): ParametersIssuesCreateLabelEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersIssuesCreateLabelEndpoint]
  }
  @scala.inline
  implicit class ParametersIssuesCreateLabelEndpointOps[Self <: ParametersIssuesCreateLabelEndpoint] (val x: Self) extends AnyVal {
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
    def setParameters(value: IssuesCreateLabelEndpoint): Self = this.set("parameters", value.asInstanceOf[js.Any])
    @scala.inline
    def setRequest(value: IssuesCreateLabelRequestOptions): Self = this.set("request", value.asInstanceOf[js.Any])
    @scala.inline
    def setResponse(value: OctokitResponse[IssuesCreateLabelResponseData]): Self = this.set("response", value.asInstanceOf[js.Any])
  }
  
}

