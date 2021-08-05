package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.TeamsDeleteDiscussionLegacyEndpoint
import typings.octokitTypes.endpointsMod.TeamsDeleteDiscussionLegacyRequestOptions
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersTeamsDeleteDiscussionLegacyEndpoint extends StObject {
  
  var parameters: TeamsDeleteDiscussionLegacyEndpoint
  
  var request: TeamsDeleteDiscussionLegacyRequestOptions
  
  var response: OctokitResponse[js.Any]
}
object ParametersTeamsDeleteDiscussionLegacyEndpoint {
  
  inline def apply(
    parameters: TeamsDeleteDiscussionLegacyEndpoint,
    request: TeamsDeleteDiscussionLegacyRequestOptions,
    response: OctokitResponse[js.Any]
  ): ParametersTeamsDeleteDiscussionLegacyEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersTeamsDeleteDiscussionLegacyEndpoint]
  }
  
  extension [Self <: ParametersTeamsDeleteDiscussionLegacyEndpoint](x: Self) {
    
    inline def setParameters(value: TeamsDeleteDiscussionLegacyEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequest(value: TeamsDeleteDiscussionLegacyRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    inline def setResponse(value: OctokitResponse[js.Any]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
