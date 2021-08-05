package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.TeamsUpdateDiscussionLegacyEndpoint
import typings.octokitTypes.endpointsMod.TeamsUpdateDiscussionLegacyRequestOptions
import typings.octokitTypes.endpointsMod.TeamsUpdateDiscussionLegacyResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersTeamsUpdateDiscussionLegacyEndpoint extends StObject {
  
  var parameters: TeamsUpdateDiscussionLegacyEndpoint
  
  var request: TeamsUpdateDiscussionLegacyRequestOptions
  
  var response: OctokitResponse[TeamsUpdateDiscussionLegacyResponseData]
}
object ParametersTeamsUpdateDiscussionLegacyEndpoint {
  
  inline def apply(
    parameters: TeamsUpdateDiscussionLegacyEndpoint,
    request: TeamsUpdateDiscussionLegacyRequestOptions,
    response: OctokitResponse[TeamsUpdateDiscussionLegacyResponseData]
  ): ParametersTeamsUpdateDiscussionLegacyEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersTeamsUpdateDiscussionLegacyEndpoint]
  }
  
  extension [Self <: ParametersTeamsUpdateDiscussionLegacyEndpoint](x: Self) {
    
    inline def setParameters(value: TeamsUpdateDiscussionLegacyEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequest(value: TeamsUpdateDiscussionLegacyRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    inline def setResponse(value: OctokitResponse[TeamsUpdateDiscussionLegacyResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
