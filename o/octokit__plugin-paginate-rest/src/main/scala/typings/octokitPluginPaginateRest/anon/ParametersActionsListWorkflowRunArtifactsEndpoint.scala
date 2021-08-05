package typings.octokitPluginPaginateRest.anon

import typings.octokitTypes.endpointsMod.ActionsListWorkflowRunArtifactsEndpoint
import typings.octokitTypes.endpointsMod.ActionsListWorkflowRunArtifactsResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersActionsListWorkflowRunArtifactsEndpoint extends StObject {
  
  var parameters: ActionsListWorkflowRunArtifactsEndpoint
  
  var response: OctokitResponse[ActionsListWorkflowRunArtifactsResponseData] & `8`
}
object ParametersActionsListWorkflowRunArtifactsEndpoint {
  
  inline def apply(
    parameters: ActionsListWorkflowRunArtifactsEndpoint,
    response: OctokitResponse[ActionsListWorkflowRunArtifactsResponseData] & `8`
  ): ParametersActionsListWorkflowRunArtifactsEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersActionsListWorkflowRunArtifactsEndpoint]
  }
  
  extension [Self <: ParametersActionsListWorkflowRunArtifactsEndpoint](x: Self) {
    
    inline def setParameters(value: ActionsListWorkflowRunArtifactsEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponse(value: OctokitResponse[ActionsListWorkflowRunArtifactsResponseData] & `8`): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
