package typings.octokitPluginPaginateRest.anon

import typings.octokitTypes.endpointsMod.ActionsListWorkflowRunArtifactsEndpoint
import typings.octokitTypes.endpointsMod.ActionsListWorkflowRunArtifactsResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersActionsListWorkflowRunArtifactsEndpoint extends StObject {
  
  var parameters: ActionsListWorkflowRunArtifactsEndpoint = js.native
  
  var response: OctokitResponse[ActionsListWorkflowRunArtifactsResponseData] with `8` = js.native
}
object ParametersActionsListWorkflowRunArtifactsEndpoint {
  
  @scala.inline
  def apply(
    parameters: ActionsListWorkflowRunArtifactsEndpoint,
    response: OctokitResponse[ActionsListWorkflowRunArtifactsResponseData] with `8`
  ): ParametersActionsListWorkflowRunArtifactsEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersActionsListWorkflowRunArtifactsEndpoint]
  }
  
  @scala.inline
  implicit class ParametersActionsListWorkflowRunArtifactsEndpointMutableBuilder[Self <: ParametersActionsListWorkflowRunArtifactsEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: ActionsListWorkflowRunArtifactsEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[ActionsListWorkflowRunArtifactsResponseData] with `8`): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
