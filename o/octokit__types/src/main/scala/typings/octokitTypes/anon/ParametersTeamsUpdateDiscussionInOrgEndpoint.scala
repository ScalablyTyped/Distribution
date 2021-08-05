package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.TeamsUpdateDiscussionInOrgEndpoint
import typings.octokitTypes.endpointsMod.TeamsUpdateDiscussionInOrgRequestOptions
import typings.octokitTypes.endpointsMod.TeamsUpdateDiscussionInOrgResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersTeamsUpdateDiscussionInOrgEndpoint extends StObject {
  
  var parameters: TeamsUpdateDiscussionInOrgEndpoint
  
  var request: TeamsUpdateDiscussionInOrgRequestOptions
  
  var response: OctokitResponse[TeamsUpdateDiscussionInOrgResponseData]
}
object ParametersTeamsUpdateDiscussionInOrgEndpoint {
  
  inline def apply(
    parameters: TeamsUpdateDiscussionInOrgEndpoint,
    request: TeamsUpdateDiscussionInOrgRequestOptions,
    response: OctokitResponse[TeamsUpdateDiscussionInOrgResponseData]
  ): ParametersTeamsUpdateDiscussionInOrgEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersTeamsUpdateDiscussionInOrgEndpoint]
  }
  
  extension [Self <: ParametersTeamsUpdateDiscussionInOrgEndpoint](x: Self) {
    
    inline def setParameters(value: TeamsUpdateDiscussionInOrgEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequest(value: TeamsUpdateDiscussionInOrgRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    inline def setResponse(value: OctokitResponse[TeamsUpdateDiscussionInOrgResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
