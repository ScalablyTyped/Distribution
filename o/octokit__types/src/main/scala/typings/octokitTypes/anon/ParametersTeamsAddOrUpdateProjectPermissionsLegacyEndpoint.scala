package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.TeamsAddOrUpdateProjectPermissionsLegacyEndpoint
import typings.octokitTypes.endpointsMod.TeamsAddOrUpdateProjectPermissionsLegacyRequestOptions
import typings.octokitTypes.endpointsMod.TeamsAddOrUpdateProjectPermissionsLegacyResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersTeamsAddOrUpdateProjectPermissionsLegacyEndpoint extends StObject {
  
  var parameters: TeamsAddOrUpdateProjectPermissionsLegacyEndpoint
  
  var request: TeamsAddOrUpdateProjectPermissionsLegacyRequestOptions
  
  var response: OctokitResponse[TeamsAddOrUpdateProjectPermissionsLegacyResponseData]
}
object ParametersTeamsAddOrUpdateProjectPermissionsLegacyEndpoint {
  
  inline def apply(
    parameters: TeamsAddOrUpdateProjectPermissionsLegacyEndpoint,
    request: TeamsAddOrUpdateProjectPermissionsLegacyRequestOptions,
    response: OctokitResponse[TeamsAddOrUpdateProjectPermissionsLegacyResponseData]
  ): ParametersTeamsAddOrUpdateProjectPermissionsLegacyEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersTeamsAddOrUpdateProjectPermissionsLegacyEndpoint]
  }
  
  extension [Self <: ParametersTeamsAddOrUpdateProjectPermissionsLegacyEndpoint](x: Self) {
    
    inline def setParameters(value: TeamsAddOrUpdateProjectPermissionsLegacyEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequest(value: TeamsAddOrUpdateProjectPermissionsLegacyRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    inline def setResponse(value: OctokitResponse[TeamsAddOrUpdateProjectPermissionsLegacyResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
