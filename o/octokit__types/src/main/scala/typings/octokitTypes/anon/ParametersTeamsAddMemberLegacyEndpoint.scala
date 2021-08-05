package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.TeamsAddMemberLegacyEndpoint
import typings.octokitTypes.endpointsMod.TeamsAddMemberLegacyRequestOptions
import typings.octokitTypes.endpointsMod.TeamsAddMemberLegacyResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersTeamsAddMemberLegacyEndpoint extends StObject {
  
  var parameters: TeamsAddMemberLegacyEndpoint
  
  var request: TeamsAddMemberLegacyRequestOptions
  
  var response: OctokitResponse[TeamsAddMemberLegacyResponseData]
}
object ParametersTeamsAddMemberLegacyEndpoint {
  
  inline def apply(
    parameters: TeamsAddMemberLegacyEndpoint,
    request: TeamsAddMemberLegacyRequestOptions,
    response: OctokitResponse[TeamsAddMemberLegacyResponseData]
  ): ParametersTeamsAddMemberLegacyEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersTeamsAddMemberLegacyEndpoint]
  }
  
  extension [Self <: ParametersTeamsAddMemberLegacyEndpoint](x: Self) {
    
    inline def setParameters(value: TeamsAddMemberLegacyEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequest(value: TeamsAddMemberLegacyRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    inline def setResponse(value: OctokitResponse[TeamsAddMemberLegacyResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
