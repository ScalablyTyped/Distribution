package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.TeamsCreateDiscussionInOrgEndpoint
import typings.octokitTypes.endpointsMod.TeamsCreateDiscussionInOrgRequestOptions
import typings.octokitTypes.endpointsMod.TeamsCreateDiscussionInOrgResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersTeamsCreateDiscussionInOrgEndpoint extends StObject {
  
  var parameters: TeamsCreateDiscussionInOrgEndpoint
  
  var request: TeamsCreateDiscussionInOrgRequestOptions
  
  var response: OctokitResponse[TeamsCreateDiscussionInOrgResponseData]
}
object ParametersTeamsCreateDiscussionInOrgEndpoint {
  
  inline def apply(
    parameters: TeamsCreateDiscussionInOrgEndpoint,
    request: TeamsCreateDiscussionInOrgRequestOptions,
    response: OctokitResponse[TeamsCreateDiscussionInOrgResponseData]
  ): ParametersTeamsCreateDiscussionInOrgEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersTeamsCreateDiscussionInOrgEndpoint]
  }
  
  extension [Self <: ParametersTeamsCreateDiscussionInOrgEndpoint](x: Self) {
    
    inline def setParameters(value: TeamsCreateDiscussionInOrgEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequest(value: TeamsCreateDiscussionInOrgRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    inline def setResponse(value: OctokitResponse[TeamsCreateDiscussionInOrgResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
