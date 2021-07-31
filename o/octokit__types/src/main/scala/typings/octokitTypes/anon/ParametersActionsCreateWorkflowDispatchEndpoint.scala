package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.ActionsCreateWorkflowDispatchEndpoint
import typings.octokitTypes.endpointsMod.ActionsCreateWorkflowDispatchRequestOptions
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersActionsCreateWorkflowDispatchEndpoint extends StObject {
  
  var parameters: ActionsCreateWorkflowDispatchEndpoint
  
  var request: ActionsCreateWorkflowDispatchRequestOptions
  
  var response: OctokitResponse[js.Any]
}
object ParametersActionsCreateWorkflowDispatchEndpoint {
  
  @scala.inline
  def apply(
    parameters: ActionsCreateWorkflowDispatchEndpoint,
    request: ActionsCreateWorkflowDispatchRequestOptions,
    response: OctokitResponse[js.Any]
  ): ParametersActionsCreateWorkflowDispatchEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersActionsCreateWorkflowDispatchEndpoint]
  }
  
  @scala.inline
  implicit class ParametersActionsCreateWorkflowDispatchEndpointMutableBuilder[Self <: ParametersActionsCreateWorkflowDispatchEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: ActionsCreateWorkflowDispatchEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: ActionsCreateWorkflowDispatchRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[js.Any]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
