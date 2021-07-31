package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.ActionsListArtifactsForRepoEndpoint
import typings.octokitTypes.endpointsMod.ActionsListArtifactsForRepoRequestOptions
import typings.octokitTypes.endpointsMod.ActionsListArtifactsForRepoResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersActionsListArtifactsForRepoEndpoint extends StObject {
  
  var parameters: ActionsListArtifactsForRepoEndpoint
  
  var request: ActionsListArtifactsForRepoRequestOptions
  
  var response: OctokitResponse[ActionsListArtifactsForRepoResponseData]
}
object ParametersActionsListArtifactsForRepoEndpoint {
  
  @scala.inline
  def apply(
    parameters: ActionsListArtifactsForRepoEndpoint,
    request: ActionsListArtifactsForRepoRequestOptions,
    response: OctokitResponse[ActionsListArtifactsForRepoResponseData]
  ): ParametersActionsListArtifactsForRepoEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersActionsListArtifactsForRepoEndpoint]
  }
  
  @scala.inline
  implicit class ParametersActionsListArtifactsForRepoEndpointMutableBuilder[Self <: ParametersActionsListArtifactsForRepoEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: ActionsListArtifactsForRepoEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: ActionsListArtifactsForRepoRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[ActionsListArtifactsForRepoResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
