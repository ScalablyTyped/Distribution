package typings.octokitPluginPaginateRest.anon

import typings.octokitTypes.endpointsMod.ActionsListWorkflowRunsForRepoEndpoint
import typings.octokitTypes.endpointsMod.ActionsListWorkflowRunsForRepoResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersActionsListWorkflowRunsForRepoEndpoint extends StObject {
  
  var parameters: ActionsListWorkflowRunsForRepoEndpoint
  
  var response: OctokitResponse[ActionsListWorkflowRunsForRepoResponseData] & `9`
}
object ParametersActionsListWorkflowRunsForRepoEndpoint {
  
  @scala.inline
  def apply(
    parameters: ActionsListWorkflowRunsForRepoEndpoint,
    response: OctokitResponse[ActionsListWorkflowRunsForRepoResponseData] & `9`
  ): ParametersActionsListWorkflowRunsForRepoEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersActionsListWorkflowRunsForRepoEndpoint]
  }
  
  @scala.inline
  implicit class ParametersActionsListWorkflowRunsForRepoEndpointMutableBuilder[Self <: ParametersActionsListWorkflowRunsForRepoEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: ActionsListWorkflowRunsForRepoEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[ActionsListWorkflowRunsForRepoResponseData] & `9`): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
