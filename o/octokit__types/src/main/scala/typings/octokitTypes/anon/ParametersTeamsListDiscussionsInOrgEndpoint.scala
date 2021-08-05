package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.TeamsListDiscussionsInOrgEndpoint
import typings.octokitTypes.endpointsMod.TeamsListDiscussionsInOrgRequestOptions
import typings.octokitTypes.endpointsMod.TeamsListDiscussionsInOrgResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersTeamsListDiscussionsInOrgEndpoint extends StObject {
  
  var parameters: TeamsListDiscussionsInOrgEndpoint
  
  var request: TeamsListDiscussionsInOrgRequestOptions
  
  var response: OctokitResponse[TeamsListDiscussionsInOrgResponseData]
}
object ParametersTeamsListDiscussionsInOrgEndpoint {
  
  inline def apply(
    parameters: TeamsListDiscussionsInOrgEndpoint,
    request: TeamsListDiscussionsInOrgRequestOptions,
    response: OctokitResponse[TeamsListDiscussionsInOrgResponseData]
  ): ParametersTeamsListDiscussionsInOrgEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersTeamsListDiscussionsInOrgEndpoint]
  }
  
  extension [Self <: ParametersTeamsListDiscussionsInOrgEndpoint](x: Self) {
    
    inline def setParameters(value: TeamsListDiscussionsInOrgEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequest(value: TeamsListDiscussionsInOrgRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    inline def setResponse(value: OctokitResponse[TeamsListDiscussionsInOrgResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
