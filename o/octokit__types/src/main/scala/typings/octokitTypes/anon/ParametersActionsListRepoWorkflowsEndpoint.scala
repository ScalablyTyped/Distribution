package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.ActionsListRepoWorkflowsEndpoint
import typings.octokitTypes.endpointsMod.ActionsListRepoWorkflowsRequestOptions
import typings.octokitTypes.endpointsMod.ActionsListRepoWorkflowsResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParametersActionsListRepoWorkflowsEndpoint extends js.Object {
  var parameters: ActionsListRepoWorkflowsEndpoint = js.native
  var request: ActionsListRepoWorkflowsRequestOptions = js.native
  var response: OctokitResponse[ActionsListRepoWorkflowsResponseData] = js.native
}

object ParametersActionsListRepoWorkflowsEndpoint {
  @scala.inline
  def apply(
    parameters: ActionsListRepoWorkflowsEndpoint,
    request: ActionsListRepoWorkflowsRequestOptions,
    response: OctokitResponse[ActionsListRepoWorkflowsResponseData]
  ): ParametersActionsListRepoWorkflowsEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersActionsListRepoWorkflowsEndpoint]
  }
  @scala.inline
  implicit class ParametersActionsListRepoWorkflowsEndpointOps[Self <: ParametersActionsListRepoWorkflowsEndpoint] (val x: Self) extends AnyVal {
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
    def setParameters(value: ActionsListRepoWorkflowsEndpoint): Self = this.set("parameters", value.asInstanceOf[js.Any])
    @scala.inline
    def setRequest(value: ActionsListRepoWorkflowsRequestOptions): Self = this.set("request", value.asInstanceOf[js.Any])
    @scala.inline
    def setResponse(value: OctokitResponse[ActionsListRepoWorkflowsResponseData]): Self = this.set("response", value.asInstanceOf[js.Any])
  }
  
}

