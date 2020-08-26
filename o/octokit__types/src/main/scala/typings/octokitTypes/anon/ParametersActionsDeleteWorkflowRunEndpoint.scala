package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.ActionsDeleteWorkflowRunEndpoint
import typings.octokitTypes.endpointsMod.ActionsDeleteWorkflowRunRequestOptions
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParametersActionsDeleteWorkflowRunEndpoint extends js.Object {
  var parameters: ActionsDeleteWorkflowRunEndpoint = js.native
  var request: ActionsDeleteWorkflowRunRequestOptions = js.native
  var response: OctokitResponse[_] = js.native
}

object ParametersActionsDeleteWorkflowRunEndpoint {
  @scala.inline
  def apply(
    parameters: ActionsDeleteWorkflowRunEndpoint,
    request: ActionsDeleteWorkflowRunRequestOptions,
    response: OctokitResponse[_]
  ): ParametersActionsDeleteWorkflowRunEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersActionsDeleteWorkflowRunEndpoint]
  }
  @scala.inline
  implicit class ParametersActionsDeleteWorkflowRunEndpointOps[Self <: ParametersActionsDeleteWorkflowRunEndpoint] (val x: Self) extends AnyVal {
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
    def setParameters(value: ActionsDeleteWorkflowRunEndpoint): Self = this.set("parameters", value.asInstanceOf[js.Any])
    @scala.inline
    def setRequest(value: ActionsDeleteWorkflowRunRequestOptions): Self = this.set("request", value.asInstanceOf[js.Any])
    @scala.inline
    def setResponse(value: OctokitResponse[_]): Self = this.set("response", value.asInstanceOf[js.Any])
  }
  
}

