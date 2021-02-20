package typings.octokitPluginPaginateRest.anon

import typings.octokitTypes.endpointsMod.ActionsListArtifactsForRepoEndpoint
import typings.octokitTypes.endpointsMod.ActionsListArtifactsForRepoResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersActionsListArtifactsForRepoEndpoint extends StObject {
  
  var parameters: ActionsListArtifactsForRepoEndpoint = js.native
  
  var response: OctokitResponse[ActionsListArtifactsForRepoResponseData] with `8` = js.native
}
object ParametersActionsListArtifactsForRepoEndpoint {
  
  @scala.inline
  def apply(
    parameters: ActionsListArtifactsForRepoEndpoint,
    response: OctokitResponse[ActionsListArtifactsForRepoResponseData] with `8`
  ): ParametersActionsListArtifactsForRepoEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersActionsListArtifactsForRepoEndpoint]
  }
  
  @scala.inline
  implicit class ParametersActionsListArtifactsForRepoEndpointMutableBuilder[Self <: ParametersActionsListArtifactsForRepoEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: ActionsListArtifactsForRepoEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[ActionsListArtifactsForRepoResponseData] with `8`): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
