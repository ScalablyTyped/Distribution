package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.TeamsUpdateInOrgEndpoint
import typings.octokitTypes.endpointsMod.TeamsUpdateInOrgRequestOptions
import typings.octokitTypes.endpointsMod.TeamsUpdateInOrgResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersTeamsUpdateInOrgEndpoint extends StObject {
  
  var parameters: TeamsUpdateInOrgEndpoint
  
  var request: TeamsUpdateInOrgRequestOptions
  
  var response: OctokitResponse[TeamsUpdateInOrgResponseData]
}
object ParametersTeamsUpdateInOrgEndpoint {
  
  inline def apply(
    parameters: TeamsUpdateInOrgEndpoint,
    request: TeamsUpdateInOrgRequestOptions,
    response: OctokitResponse[TeamsUpdateInOrgResponseData]
  ): ParametersTeamsUpdateInOrgEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersTeamsUpdateInOrgEndpoint]
  }
  
  extension [Self <: ParametersTeamsUpdateInOrgEndpoint](x: Self) {
    
    inline def setParameters(value: TeamsUpdateInOrgEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequest(value: TeamsUpdateInOrgRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    inline def setResponse(value: OctokitResponse[TeamsUpdateInOrgResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
