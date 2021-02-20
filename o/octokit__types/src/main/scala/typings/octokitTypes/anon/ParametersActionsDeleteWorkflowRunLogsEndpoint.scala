package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.ActionsDeleteWorkflowRunLogsEndpoint
import typings.octokitTypes.endpointsMod.ActionsDeleteWorkflowRunLogsRequestOptions
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersActionsDeleteWorkflowRunLogsEndpoint extends StObject {
  
  var parameters: ActionsDeleteWorkflowRunLogsEndpoint = js.native
  
  var request: ActionsDeleteWorkflowRunLogsRequestOptions = js.native
  
  var response: OctokitResponse[_] = js.native
}
object ParametersActionsDeleteWorkflowRunLogsEndpoint {
  
  @scala.inline
  def apply(
    parameters: ActionsDeleteWorkflowRunLogsEndpoint,
    request: ActionsDeleteWorkflowRunLogsRequestOptions,
    response: OctokitResponse[_]
  ): ParametersActionsDeleteWorkflowRunLogsEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersActionsDeleteWorkflowRunLogsEndpoint]
  }
  
  @scala.inline
  implicit class ParametersActionsDeleteWorkflowRunLogsEndpointMutableBuilder[Self <: ParametersActionsDeleteWorkflowRunLogsEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: ActionsDeleteWorkflowRunLogsEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: ActionsDeleteWorkflowRunLogsRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[_]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
