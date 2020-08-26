package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.ActionsGetWorkflowEndpoint
import typings.octokitTypes.endpointsMod.ActionsGetWorkflowRequestOptions
import typings.octokitTypes.endpointsMod.ActionsGetWorkflowResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParametersActionsGetWorkflowEndpoint extends js.Object {
  var parameters: ActionsGetWorkflowEndpoint = js.native
  var request: ActionsGetWorkflowRequestOptions = js.native
  var response: OctokitResponse[ActionsGetWorkflowResponseData] = js.native
}

object ParametersActionsGetWorkflowEndpoint {
  @scala.inline
  def apply(
    parameters: ActionsGetWorkflowEndpoint,
    request: ActionsGetWorkflowRequestOptions,
    response: OctokitResponse[ActionsGetWorkflowResponseData]
  ): ParametersActionsGetWorkflowEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersActionsGetWorkflowEndpoint]
  }
  @scala.inline
  implicit class ParametersActionsGetWorkflowEndpointOps[Self <: ParametersActionsGetWorkflowEndpoint] (val x: Self) extends AnyVal {
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
    def setParameters(value: ActionsGetWorkflowEndpoint): Self = this.set("parameters", value.asInstanceOf[js.Any])
    @scala.inline
    def setRequest(value: ActionsGetWorkflowRequestOptions): Self = this.set("request", value.asInstanceOf[js.Any])
    @scala.inline
    def setResponse(value: OctokitResponse[ActionsGetWorkflowResponseData]): Self = this.set("response", value.asInstanceOf[js.Any])
  }
  
}

