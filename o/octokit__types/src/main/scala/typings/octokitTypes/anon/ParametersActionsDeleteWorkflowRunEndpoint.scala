package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.ActionsDeleteWorkflowRunEndpoint
import typings.octokitTypes.endpointsMod.ActionsDeleteWorkflowRunRequestOptions
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersActionsDeleteWorkflowRunEndpoint extends StObject {
  
  var parameters: ActionsDeleteWorkflowRunEndpoint = js.native
  
  var request: ActionsDeleteWorkflowRunRequestOptions = js.native
  
  var response: OctokitResponse[_] = js.native
}
object ParametersActionsDeleteWorkflowRunEndpoint {
  
  @scala.inline
  def apply(
    parameters: ActionsDeleteWorkflowRunEndpoint,
    request: ActionsDeleteWorkflowRunRequestOptions,
    response: OctokitResponse[_]
  ): ParametersActionsDeleteWorkflowRunEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersActionsDeleteWorkflowRunEndpoint]
  }
  
  @scala.inline
  implicit class ParametersActionsDeleteWorkflowRunEndpointMutableBuilder[Self <: ParametersActionsDeleteWorkflowRunEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: ActionsDeleteWorkflowRunEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: ActionsDeleteWorkflowRunRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[_]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
