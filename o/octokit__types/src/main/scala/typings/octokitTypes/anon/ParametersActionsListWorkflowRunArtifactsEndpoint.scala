package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.ActionsListWorkflowRunArtifactsEndpoint
import typings.octokitTypes.endpointsMod.ActionsListWorkflowRunArtifactsRequestOptions
import typings.octokitTypes.endpointsMod.ActionsListWorkflowRunArtifactsResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersActionsListWorkflowRunArtifactsEndpoint extends StObject {
  
  var parameters: ActionsListWorkflowRunArtifactsEndpoint
  
  var request: ActionsListWorkflowRunArtifactsRequestOptions
  
  var response: OctokitResponse[ActionsListWorkflowRunArtifactsResponseData]
}
object ParametersActionsListWorkflowRunArtifactsEndpoint {
  
  @scala.inline
  def apply(
    parameters: ActionsListWorkflowRunArtifactsEndpoint,
    request: ActionsListWorkflowRunArtifactsRequestOptions,
    response: OctokitResponse[ActionsListWorkflowRunArtifactsResponseData]
  ): ParametersActionsListWorkflowRunArtifactsEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersActionsListWorkflowRunArtifactsEndpoint]
  }
  
  @scala.inline
  implicit class ParametersActionsListWorkflowRunArtifactsEndpointMutableBuilder[Self <: ParametersActionsListWorkflowRunArtifactsEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: ActionsListWorkflowRunArtifactsEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: ActionsListWorkflowRunArtifactsRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[ActionsListWorkflowRunArtifactsResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
