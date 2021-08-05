package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.TeamsCreateOrUpdateIdPGroupConnectionsLegacyEndpoint
import typings.octokitTypes.endpointsMod.TeamsCreateOrUpdateIdPGroupConnectionsLegacyRequestOptions
import typings.octokitTypes.endpointsMod.TeamsCreateOrUpdateIdPGroupConnectionsLegacyResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersTeamsCreateOrUpdateIdPGroupConnectionsLegacyEndpoint extends StObject {
  
  var parameters: TeamsCreateOrUpdateIdPGroupConnectionsLegacyEndpoint
  
  var request: TeamsCreateOrUpdateIdPGroupConnectionsLegacyRequestOptions
  
  var response: OctokitResponse[TeamsCreateOrUpdateIdPGroupConnectionsLegacyResponseData]
}
object ParametersTeamsCreateOrUpdateIdPGroupConnectionsLegacyEndpoint {
  
  inline def apply(
    parameters: TeamsCreateOrUpdateIdPGroupConnectionsLegacyEndpoint,
    request: TeamsCreateOrUpdateIdPGroupConnectionsLegacyRequestOptions,
    response: OctokitResponse[TeamsCreateOrUpdateIdPGroupConnectionsLegacyResponseData]
  ): ParametersTeamsCreateOrUpdateIdPGroupConnectionsLegacyEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersTeamsCreateOrUpdateIdPGroupConnectionsLegacyEndpoint]
  }
  
  extension [Self <: ParametersTeamsCreateOrUpdateIdPGroupConnectionsLegacyEndpoint](x: Self) {
    
    inline def setParameters(value: TeamsCreateOrUpdateIdPGroupConnectionsLegacyEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequest(value: TeamsCreateOrUpdateIdPGroupConnectionsLegacyRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    inline def setResponse(value: OctokitResponse[TeamsCreateOrUpdateIdPGroupConnectionsLegacyResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
