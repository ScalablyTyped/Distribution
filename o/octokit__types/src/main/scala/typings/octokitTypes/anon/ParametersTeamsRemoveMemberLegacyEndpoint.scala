package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.TeamsRemoveMemberLegacyEndpoint
import typings.octokitTypes.endpointsMod.TeamsRemoveMemberLegacyRequestOptions
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersTeamsRemoveMemberLegacyEndpoint extends StObject {
  
  var parameters: TeamsRemoveMemberLegacyEndpoint
  
  var request: TeamsRemoveMemberLegacyRequestOptions
  
  var response: OctokitResponse[js.Any]
}
object ParametersTeamsRemoveMemberLegacyEndpoint {
  
  inline def apply(
    parameters: TeamsRemoveMemberLegacyEndpoint,
    request: TeamsRemoveMemberLegacyRequestOptions,
    response: OctokitResponse[js.Any]
  ): ParametersTeamsRemoveMemberLegacyEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersTeamsRemoveMemberLegacyEndpoint]
  }
  
  extension [Self <: ParametersTeamsRemoveMemberLegacyEndpoint](x: Self) {
    
    inline def setParameters(value: TeamsRemoveMemberLegacyEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequest(value: TeamsRemoveMemberLegacyRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    inline def setResponse(value: OctokitResponse[js.Any]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
