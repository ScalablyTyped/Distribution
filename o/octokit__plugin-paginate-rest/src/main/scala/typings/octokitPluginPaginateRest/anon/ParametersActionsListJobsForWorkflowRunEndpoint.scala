package typings.octokitPluginPaginateRest.anon

import typings.octokitTypes.endpointsMod.ActionsListJobsForWorkflowRunEndpoint
import typings.octokitTypes.endpointsMod.ActionsListJobsForWorkflowRunResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersActionsListJobsForWorkflowRunEndpoint extends StObject {
  
  var parameters: ActionsListJobsForWorkflowRunEndpoint
  
  var response: OctokitResponse[ActionsListJobsForWorkflowRunResponseData] & `10`
}
object ParametersActionsListJobsForWorkflowRunEndpoint {
  
  inline def apply(
    parameters: ActionsListJobsForWorkflowRunEndpoint,
    response: OctokitResponse[ActionsListJobsForWorkflowRunResponseData] & `10`
  ): ParametersActionsListJobsForWorkflowRunEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersActionsListJobsForWorkflowRunEndpoint]
  }
  
  extension [Self <: ParametersActionsListJobsForWorkflowRunEndpoint](x: Self) {
    
    inline def setParameters(value: ActionsListJobsForWorkflowRunEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponse(value: OctokitResponse[ActionsListJobsForWorkflowRunResponseData] & `10`): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
