package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.TeamsCheckPermissionsForProjectLegacyEndpoint
import typings.octokitTypes.endpointsMod.TeamsCheckPermissionsForProjectLegacyRequestOptions
import typings.octokitTypes.endpointsMod.TeamsCheckPermissionsForProjectLegacyResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersTeamsCheckPermissionsForProjectLegacyEndpoint extends StObject {
  
  var parameters: TeamsCheckPermissionsForProjectLegacyEndpoint
  
  var request: TeamsCheckPermissionsForProjectLegacyRequestOptions
  
  var response: OctokitResponse[TeamsCheckPermissionsForProjectLegacyResponseData]
}
object ParametersTeamsCheckPermissionsForProjectLegacyEndpoint {
  
  inline def apply(
    parameters: TeamsCheckPermissionsForProjectLegacyEndpoint,
    request: TeamsCheckPermissionsForProjectLegacyRequestOptions,
    response: OctokitResponse[TeamsCheckPermissionsForProjectLegacyResponseData]
  ): ParametersTeamsCheckPermissionsForProjectLegacyEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersTeamsCheckPermissionsForProjectLegacyEndpoint]
  }
  
  extension [Self <: ParametersTeamsCheckPermissionsForProjectLegacyEndpoint](x: Self) {
    
    inline def setParameters(value: TeamsCheckPermissionsForProjectLegacyEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequest(value: TeamsCheckPermissionsForProjectLegacyRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    inline def setResponse(value: OctokitResponse[TeamsCheckPermissionsForProjectLegacyResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
