package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.TeamsRemoveProjectInOrgEndpoint
import typings.octokitTypes.endpointsMod.TeamsRemoveProjectInOrgRequestOptions
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersTeamsRemoveProjectInOrgEndpoint extends StObject {
  
  var parameters: TeamsRemoveProjectInOrgEndpoint
  
  var request: TeamsRemoveProjectInOrgRequestOptions
  
  var response: OctokitResponse[js.Any]
}
object ParametersTeamsRemoveProjectInOrgEndpoint {
  
  inline def apply(
    parameters: TeamsRemoveProjectInOrgEndpoint,
    request: TeamsRemoveProjectInOrgRequestOptions,
    response: OctokitResponse[js.Any]
  ): ParametersTeamsRemoveProjectInOrgEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersTeamsRemoveProjectInOrgEndpoint]
  }
  
  extension [Self <: ParametersTeamsRemoveProjectInOrgEndpoint](x: Self) {
    
    inline def setParameters(value: TeamsRemoveProjectInOrgEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequest(value: TeamsRemoveProjectInOrgRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    inline def setResponse(value: OctokitResponse[js.Any]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
