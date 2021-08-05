package typings.octokitPluginPaginateRest.anon

import typings.octokitTypes.endpointsMod.ActionsListArtifactsForRepoEndpoint
import typings.octokitTypes.endpointsMod.ActionsListArtifactsForRepoResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersActionsListArtifactsForRepoEndpoint extends StObject {
  
  var parameters: ActionsListArtifactsForRepoEndpoint
  
  var response: OctokitResponse[ActionsListArtifactsForRepoResponseData] & `8`
}
object ParametersActionsListArtifactsForRepoEndpoint {
  
  inline def apply(
    parameters: ActionsListArtifactsForRepoEndpoint,
    response: OctokitResponse[ActionsListArtifactsForRepoResponseData] & `8`
  ): ParametersActionsListArtifactsForRepoEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersActionsListArtifactsForRepoEndpoint]
  }
  
  extension [Self <: ParametersActionsListArtifactsForRepoEndpoint](x: Self) {
    
    inline def setParameters(value: ActionsListArtifactsForRepoEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponse(value: OctokitResponse[ActionsListArtifactsForRepoResponseData] & `8`): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
