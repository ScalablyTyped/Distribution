package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.ActionsGetArtifactEndpoint
import typings.octokitTypes.endpointsMod.ActionsGetArtifactRequestOptions
import typings.octokitTypes.endpointsMod.ActionsGetArtifactResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersActionsGetArtifactEndpoint extends StObject {
  
  var parameters: ActionsGetArtifactEndpoint
  
  var request: ActionsGetArtifactRequestOptions
  
  var response: OctokitResponse[ActionsGetArtifactResponseData]
}
object ParametersActionsGetArtifactEndpoint {
  
  @scala.inline
  def apply(
    parameters: ActionsGetArtifactEndpoint,
    request: ActionsGetArtifactRequestOptions,
    response: OctokitResponse[ActionsGetArtifactResponseData]
  ): ParametersActionsGetArtifactEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersActionsGetArtifactEndpoint]
  }
  
  @scala.inline
  implicit class ParametersActionsGetArtifactEndpointMutableBuilder[Self <: ParametersActionsGetArtifactEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: ActionsGetArtifactEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: ActionsGetArtifactRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[ActionsGetArtifactResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
