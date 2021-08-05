package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.TeamsListProjectsInOrgEndpoint
import typings.octokitTypes.endpointsMod.TeamsListProjectsInOrgRequestOptions
import typings.octokitTypes.endpointsMod.TeamsListProjectsInOrgResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersTeamsListProjectsInOrgEndpoint extends StObject {
  
  var parameters: TeamsListProjectsInOrgEndpoint
  
  var request: TeamsListProjectsInOrgRequestOptions
  
  var response: OctokitResponse[TeamsListProjectsInOrgResponseData]
}
object ParametersTeamsListProjectsInOrgEndpoint {
  
  inline def apply(
    parameters: TeamsListProjectsInOrgEndpoint,
    request: TeamsListProjectsInOrgRequestOptions,
    response: OctokitResponse[TeamsListProjectsInOrgResponseData]
  ): ParametersTeamsListProjectsInOrgEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersTeamsListProjectsInOrgEndpoint]
  }
  
  extension [Self <: ParametersTeamsListProjectsInOrgEndpoint](x: Self) {
    
    inline def setParameters(value: TeamsListProjectsInOrgEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequest(value: TeamsListProjectsInOrgRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    inline def setResponse(value: OctokitResponse[TeamsListProjectsInOrgResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
