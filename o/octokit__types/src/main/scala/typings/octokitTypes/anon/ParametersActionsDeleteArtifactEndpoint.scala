package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.ActionsDeleteArtifactEndpoint
import typings.octokitTypes.endpointsMod.ActionsDeleteArtifactRequestOptions
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersActionsDeleteArtifactEndpoint extends StObject {
  
  var parameters: ActionsDeleteArtifactEndpoint
  
  var request: ActionsDeleteArtifactRequestOptions
  
  var response: OctokitResponse[js.Any]
}
object ParametersActionsDeleteArtifactEndpoint {
  
  inline def apply(
    parameters: ActionsDeleteArtifactEndpoint,
    request: ActionsDeleteArtifactRequestOptions,
    response: OctokitResponse[js.Any]
  ): ParametersActionsDeleteArtifactEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersActionsDeleteArtifactEndpoint]
  }
  
  extension [Self <: ParametersActionsDeleteArtifactEndpoint](x: Self) {
    
    inline def setParameters(value: ActionsDeleteArtifactEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequest(value: ActionsDeleteArtifactRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    inline def setResponse(value: OctokitResponse[js.Any]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
