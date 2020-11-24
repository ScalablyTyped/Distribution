package typings.octokitPluginPaginateRest.anon

import typings.octokitTypes.endpointsMod.ActionsListJobsForWorkflowRunEndpoint
import typings.octokitTypes.endpointsMod.ActionsListJobsForWorkflowRunResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersActionsListJobsForWorkflowRunEndpoint extends js.Object {
  
  var parameters: ActionsListJobsForWorkflowRunEndpoint = js.native
  
  var response: OctokitResponse[ActionsListJobsForWorkflowRunResponseData] with `10` = js.native
}
object ParametersActionsListJobsForWorkflowRunEndpoint {
  
  @scala.inline
  def apply(
    parameters: ActionsListJobsForWorkflowRunEndpoint,
    response: OctokitResponse[ActionsListJobsForWorkflowRunResponseData] with `10`
  ): ParametersActionsListJobsForWorkflowRunEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersActionsListJobsForWorkflowRunEndpoint]
  }
  
  @scala.inline
  implicit class ParametersActionsListJobsForWorkflowRunEndpointOps[Self <: ParametersActionsListJobsForWorkflowRunEndpoint] (val x: Self) extends AnyVal {
    
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
    def setParameters(value: ActionsListJobsForWorkflowRunEndpoint): Self = this.set("parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[ActionsListJobsForWorkflowRunResponseData] with `10`): Self = this.set("response", value.asInstanceOf[js.Any])
  }
}
