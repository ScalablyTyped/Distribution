package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.ActionsCancelWorkflowRunEndpoint
import typings.octokitTypes.endpointsMod.ActionsCancelWorkflowRunRequestOptions
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersActionsCancelWorkflowRunEndpoint extends StObject {
  
  var parameters: ActionsCancelWorkflowRunEndpoint
  
  var request: ActionsCancelWorkflowRunRequestOptions
  
  var response: OctokitResponse[js.Any]
}
object ParametersActionsCancelWorkflowRunEndpoint {
  
  @scala.inline
  def apply(
    parameters: ActionsCancelWorkflowRunEndpoint,
    request: ActionsCancelWorkflowRunRequestOptions,
    response: OctokitResponse[js.Any]
  ): ParametersActionsCancelWorkflowRunEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersActionsCancelWorkflowRunEndpoint]
  }
  
  @scala.inline
  implicit class ParametersActionsCancelWorkflowRunEndpointMutableBuilder[Self <: ParametersActionsCancelWorkflowRunEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: ActionsCancelWorkflowRunEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: ActionsCancelWorkflowRunRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[js.Any]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
