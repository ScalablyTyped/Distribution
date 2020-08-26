package typings.octokitPluginPaginateRest.anon

import typings.octokitTypes.endpointsMod.ActionsListRepoWorkflowsEndpoint
import typings.octokitTypes.endpointsMod.ActionsListRepoWorkflowsResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParametersActionsListRepoWorkflowsEndpoint extends js.Object {
  var parameters: ActionsListRepoWorkflowsEndpoint = js.native
  var response: OctokitResponse[ActionsListRepoWorkflowsResponseData] with `8` = js.native
}

object ParametersActionsListRepoWorkflowsEndpoint {
  @scala.inline
  def apply(
    parameters: ActionsListRepoWorkflowsEndpoint,
    response: OctokitResponse[ActionsListRepoWorkflowsResponseData] with `8`
  ): ParametersActionsListRepoWorkflowsEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
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
    def setResponse(value: OctokitResponse[ActionsListRepoWorkflowsResponseData] with `8`): Self = this.set("response", value.asInstanceOf[js.Any])
  }
  
}

