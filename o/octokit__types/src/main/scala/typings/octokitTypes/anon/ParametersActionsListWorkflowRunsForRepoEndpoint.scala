package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.ActionsListWorkflowRunsForRepoEndpoint
import typings.octokitTypes.endpointsMod.ActionsListWorkflowRunsForRepoRequestOptions
import typings.octokitTypes.endpointsMod.ActionsListWorkflowRunsForRepoResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersActionsListWorkflowRunsForRepoEndpoint extends StObject {
  
  var parameters: ActionsListWorkflowRunsForRepoEndpoint
  
  var request: ActionsListWorkflowRunsForRepoRequestOptions
  
  var response: OctokitResponse[ActionsListWorkflowRunsForRepoResponseData]
}
object ParametersActionsListWorkflowRunsForRepoEndpoint {
  
  @scala.inline
  def apply(
    parameters: ActionsListWorkflowRunsForRepoEndpoint,
    request: ActionsListWorkflowRunsForRepoRequestOptions,
    response: OctokitResponse[ActionsListWorkflowRunsForRepoResponseData]
  ): ParametersActionsListWorkflowRunsForRepoEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersActionsListWorkflowRunsForRepoEndpoint]
  }
  
  @scala.inline
  implicit class ParametersActionsListWorkflowRunsForRepoEndpointMutableBuilder[Self <: ParametersActionsListWorkflowRunsForRepoEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: ActionsListWorkflowRunsForRepoEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: ActionsListWorkflowRunsForRepoRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[ActionsListWorkflowRunsForRepoResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
