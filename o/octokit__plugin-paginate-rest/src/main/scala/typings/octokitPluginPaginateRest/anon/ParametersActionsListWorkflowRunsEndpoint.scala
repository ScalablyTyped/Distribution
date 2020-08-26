package typings.octokitPluginPaginateRest.anon

import typings.octokitTypes.endpointsMod.ActionsListWorkflowRunsEndpoint
import typings.octokitTypes.endpointsMod.ActionsListWorkflowRunsResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParametersActionsListWorkflowRunsEndpoint extends js.Object {
  var parameters: ActionsListWorkflowRunsEndpoint = js.native
  var response: OctokitResponse[ActionsListWorkflowRunsResponseData] with `5` = js.native
}

object ParametersActionsListWorkflowRunsEndpoint {
  @scala.inline
  def apply(
    parameters: ActionsListWorkflowRunsEndpoint,
    response: OctokitResponse[ActionsListWorkflowRunsResponseData] with `5`
  ): ParametersActionsListWorkflowRunsEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersActionsListWorkflowRunsEndpoint]
  }
  @scala.inline
  implicit class ParametersActionsListWorkflowRunsEndpointOps[Self <: ParametersActionsListWorkflowRunsEndpoint] (val x: Self) extends AnyVal {
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
    def setParameters(value: ActionsListWorkflowRunsEndpoint): Self = this.set("parameters", value.asInstanceOf[js.Any])
    @scala.inline
    def setResponse(value: OctokitResponse[ActionsListWorkflowRunsResponseData] with `5`): Self = this.set("response", value.asInstanceOf[js.Any])
  }
  
}

