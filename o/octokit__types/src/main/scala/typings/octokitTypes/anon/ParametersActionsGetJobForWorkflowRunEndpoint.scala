package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.ActionsGetJobForWorkflowRunEndpoint
import typings.octokitTypes.endpointsMod.ActionsGetJobForWorkflowRunRequestOptions
import typings.octokitTypes.endpointsMod.ActionsGetJobForWorkflowRunResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParametersActionsGetJobForWorkflowRunEndpoint extends js.Object {
  var parameters: ActionsGetJobForWorkflowRunEndpoint = js.native
  var request: ActionsGetJobForWorkflowRunRequestOptions = js.native
  var response: OctokitResponse[ActionsGetJobForWorkflowRunResponseData] = js.native
}

object ParametersActionsGetJobForWorkflowRunEndpoint {
  @scala.inline
  def apply(
    parameters: ActionsGetJobForWorkflowRunEndpoint,
    request: ActionsGetJobForWorkflowRunRequestOptions,
    response: OctokitResponse[ActionsGetJobForWorkflowRunResponseData]
  ): ParametersActionsGetJobForWorkflowRunEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersActionsGetJobForWorkflowRunEndpoint]
  }
  @scala.inline
  implicit class ParametersActionsGetJobForWorkflowRunEndpointOps[Self <: ParametersActionsGetJobForWorkflowRunEndpoint] (val x: Self) extends AnyVal {
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
    def setParameters(value: ActionsGetJobForWorkflowRunEndpoint): Self = this.set("parameters", value.asInstanceOf[js.Any])
    @scala.inline
    def setRequest(value: ActionsGetJobForWorkflowRunRequestOptions): Self = this.set("request", value.asInstanceOf[js.Any])
    @scala.inline
    def setResponse(value: OctokitResponse[ActionsGetJobForWorkflowRunResponseData]): Self = this.set("response", value.asInstanceOf[js.Any])
  }
  
}

