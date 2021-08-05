package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.TeamsAddOrUpdateRepoPermissionsInOrgEndpoint
import typings.octokitTypes.endpointsMod.TeamsAddOrUpdateRepoPermissionsInOrgRequestOptions
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersTeamsAddOrUpdateRepoPermissionsInOrgEndpoint extends StObject {
  
  var parameters: TeamsAddOrUpdateRepoPermissionsInOrgEndpoint
  
  var request: TeamsAddOrUpdateRepoPermissionsInOrgRequestOptions
  
  var response: OctokitResponse[js.Any]
}
object ParametersTeamsAddOrUpdateRepoPermissionsInOrgEndpoint {
  
  inline def apply(
    parameters: TeamsAddOrUpdateRepoPermissionsInOrgEndpoint,
    request: TeamsAddOrUpdateRepoPermissionsInOrgRequestOptions,
    response: OctokitResponse[js.Any]
  ): ParametersTeamsAddOrUpdateRepoPermissionsInOrgEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersTeamsAddOrUpdateRepoPermissionsInOrgEndpoint]
  }
  
  extension [Self <: ParametersTeamsAddOrUpdateRepoPermissionsInOrgEndpoint](x: Self) {
    
    inline def setParameters(value: TeamsAddOrUpdateRepoPermissionsInOrgEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequest(value: TeamsAddOrUpdateRepoPermissionsInOrgRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    inline def setResponse(value: OctokitResponse[js.Any]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
