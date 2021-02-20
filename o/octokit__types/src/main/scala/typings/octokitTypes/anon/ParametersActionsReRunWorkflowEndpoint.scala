package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.ActionsReRunWorkflowEndpoint
import typings.octokitTypes.endpointsMod.ActionsReRunWorkflowRequestOptions
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersActionsReRunWorkflowEndpoint extends StObject {
  
  var parameters: ActionsReRunWorkflowEndpoint = js.native
  
  var request: ActionsReRunWorkflowRequestOptions = js.native
  
  var response: OctokitResponse[_] = js.native
}
object ParametersActionsReRunWorkflowEndpoint {
  
  @scala.inline
  def apply(
    parameters: ActionsReRunWorkflowEndpoint,
    request: ActionsReRunWorkflowRequestOptions,
    response: OctokitResponse[_]
  ): ParametersActionsReRunWorkflowEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersActionsReRunWorkflowEndpoint]
  }
  
  @scala.inline
  implicit class ParametersActionsReRunWorkflowEndpointMutableBuilder[Self <: ParametersActionsReRunWorkflowEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: ActionsReRunWorkflowEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: ActionsReRunWorkflowRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[_]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
