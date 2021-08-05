package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.TeamsListChildInOrgEndpoint
import typings.octokitTypes.endpointsMod.TeamsListChildInOrgRequestOptions
import typings.octokitTypes.endpointsMod.TeamsListChildInOrgResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersTeamsListChildInOrgEndpoint extends StObject {
  
  var parameters: TeamsListChildInOrgEndpoint
  
  var request: TeamsListChildInOrgRequestOptions
  
  var response: OctokitResponse[TeamsListChildInOrgResponseData]
}
object ParametersTeamsListChildInOrgEndpoint {
  
  inline def apply(
    parameters: TeamsListChildInOrgEndpoint,
    request: TeamsListChildInOrgRequestOptions,
    response: OctokitResponse[TeamsListChildInOrgResponseData]
  ): ParametersTeamsListChildInOrgEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersTeamsListChildInOrgEndpoint]
  }
  
  extension [Self <: ParametersTeamsListChildInOrgEndpoint](x: Self) {
    
    inline def setParameters(value: TeamsListChildInOrgEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequest(value: TeamsListChildInOrgRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    inline def setResponse(value: OctokitResponse[TeamsListChildInOrgResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
