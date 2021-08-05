package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.TeamsRemoveRepoInOrgEndpoint
import typings.octokitTypes.endpointsMod.TeamsRemoveRepoInOrgRequestOptions
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersTeamsRemoveRepoInOrgEndpoint extends StObject {
  
  var parameters: TeamsRemoveRepoInOrgEndpoint
  
  var request: TeamsRemoveRepoInOrgRequestOptions
  
  var response: OctokitResponse[js.Any]
}
object ParametersTeamsRemoveRepoInOrgEndpoint {
  
  inline def apply(
    parameters: TeamsRemoveRepoInOrgEndpoint,
    request: TeamsRemoveRepoInOrgRequestOptions,
    response: OctokitResponse[js.Any]
  ): ParametersTeamsRemoveRepoInOrgEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersTeamsRemoveRepoInOrgEndpoint]
  }
  
  extension [Self <: ParametersTeamsRemoveRepoInOrgEndpoint](x: Self) {
    
    inline def setParameters(value: TeamsRemoveRepoInOrgEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequest(value: TeamsRemoveRepoInOrgRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    inline def setResponse(value: OctokitResponse[js.Any]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
