package typings.octokitPluginPaginateRest.anon

import typings.octokitTypes.endpointsMod.ActionsListWorkflowRunsEndpoint
import typings.octokitTypes.endpointsMod.ActionsListWorkflowRunsResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersActionsListWorkflowRunsEndpoint extends StObject {
  
  var parameters: ActionsListWorkflowRunsEndpoint
  
  var response: OctokitResponse[ActionsListWorkflowRunsResponseData] & `9`
}
object ParametersActionsListWorkflowRunsEndpoint {
  
  @scala.inline
  def apply(
    parameters: ActionsListWorkflowRunsEndpoint,
    response: OctokitResponse[ActionsListWorkflowRunsResponseData] & `9`
  ): ParametersActionsListWorkflowRunsEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersActionsListWorkflowRunsEndpoint]
  }
  
  @scala.inline
  implicit class ParametersActionsListWorkflowRunsEndpointMutableBuilder[Self <: ParametersActionsListWorkflowRunsEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: ActionsListWorkflowRunsEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[ActionsListWorkflowRunsResponseData] & `9`): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
