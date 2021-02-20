package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.ActionsGetWorkflowUsageEndpoint
import typings.octokitTypes.endpointsMod.ActionsGetWorkflowUsageRequestOptions
import typings.octokitTypes.endpointsMod.ActionsGetWorkflowUsageResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersActionsGetWorkflowUsageEndpoint extends StObject {
  
  var parameters: ActionsGetWorkflowUsageEndpoint = js.native
  
  var request: ActionsGetWorkflowUsageRequestOptions = js.native
  
  var response: OctokitResponse[ActionsGetWorkflowUsageResponseData] = js.native
}
object ParametersActionsGetWorkflowUsageEndpoint {
  
  @scala.inline
  def apply(
    parameters: ActionsGetWorkflowUsageEndpoint,
    request: ActionsGetWorkflowUsageRequestOptions,
    response: OctokitResponse[ActionsGetWorkflowUsageResponseData]
  ): ParametersActionsGetWorkflowUsageEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersActionsGetWorkflowUsageEndpoint]
  }
  
  @scala.inline
  implicit class ParametersActionsGetWorkflowUsageEndpointMutableBuilder[Self <: ParametersActionsGetWorkflowUsageEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: ActionsGetWorkflowUsageEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: ActionsGetWorkflowUsageRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[ActionsGetWorkflowUsageResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
