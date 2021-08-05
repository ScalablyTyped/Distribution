package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.TeamsCheckPermissionsForRepoInOrgEndpoint
import typings.octokitTypes.endpointsMod.TeamsCheckPermissionsForRepoInOrgRequestOptions
import typings.octokitTypes.endpointsMod.TeamsCheckPermissionsForRepoInOrgResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersTeamsCheckPermissionsForRepoInOrgEndpoint extends StObject {
  
  var parameters: TeamsCheckPermissionsForRepoInOrgEndpoint
  
  var request: TeamsCheckPermissionsForRepoInOrgRequestOptions
  
  var response: OctokitResponse[TeamsCheckPermissionsForRepoInOrgResponseData]
}
object ParametersTeamsCheckPermissionsForRepoInOrgEndpoint {
  
  inline def apply(
    parameters: TeamsCheckPermissionsForRepoInOrgEndpoint,
    request: TeamsCheckPermissionsForRepoInOrgRequestOptions,
    response: OctokitResponse[TeamsCheckPermissionsForRepoInOrgResponseData]
  ): ParametersTeamsCheckPermissionsForRepoInOrgEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersTeamsCheckPermissionsForRepoInOrgEndpoint]
  }
  
  extension [Self <: ParametersTeamsCheckPermissionsForRepoInOrgEndpoint](x: Self) {
    
    inline def setParameters(value: TeamsCheckPermissionsForRepoInOrgEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequest(value: TeamsCheckPermissionsForRepoInOrgRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    inline def setResponse(value: OctokitResponse[TeamsCheckPermissionsForRepoInOrgResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
