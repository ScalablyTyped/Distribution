package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.TeamsGetMemberLegacyEndpoint
import typings.octokitTypes.endpointsMod.TeamsGetMemberLegacyRequestOptions
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersTeamsGetMemberLegacyEndpoint extends StObject {
  
  var parameters: TeamsGetMemberLegacyEndpoint
  
  var request: TeamsGetMemberLegacyRequestOptions
  
  var response: OctokitResponse[js.Any]
}
object ParametersTeamsGetMemberLegacyEndpoint {
  
  inline def apply(
    parameters: TeamsGetMemberLegacyEndpoint,
    request: TeamsGetMemberLegacyRequestOptions,
    response: OctokitResponse[js.Any]
  ): ParametersTeamsGetMemberLegacyEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersTeamsGetMemberLegacyEndpoint]
  }
  
  extension [Self <: ParametersTeamsGetMemberLegacyEndpoint](x: Self) {
    
    inline def setParameters(value: TeamsGetMemberLegacyEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequest(value: TeamsGetMemberLegacyRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    inline def setResponse(value: OctokitResponse[js.Any]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
