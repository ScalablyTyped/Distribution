package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.ReposAddTeamAccessRestrictionsEndpoint
import typings.octokitTypes.endpointsMod.ReposAddTeamAccessRestrictionsRequestOptions
import typings.octokitTypes.endpointsMod.ReposAddTeamAccessRestrictionsResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersReposAddTeamAccessRestrictionsEndpoint extends StObject {
  
  var parameters: ReposAddTeamAccessRestrictionsEndpoint
  
  var request: ReposAddTeamAccessRestrictionsRequestOptions
  
  var response: OctokitResponse[ReposAddTeamAccessRestrictionsResponseData]
}
object ParametersReposAddTeamAccessRestrictionsEndpoint {
  
  inline def apply(
    parameters: ReposAddTeamAccessRestrictionsEndpoint,
    request: ReposAddTeamAccessRestrictionsRequestOptions,
    response: OctokitResponse[ReposAddTeamAccessRestrictionsResponseData]
  ): ParametersReposAddTeamAccessRestrictionsEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersReposAddTeamAccessRestrictionsEndpoint]
  }
  
  extension [Self <: ParametersReposAddTeamAccessRestrictionsEndpoint](x: Self) {
    
    inline def setParameters(value: ReposAddTeamAccessRestrictionsEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequest(value: ReposAddTeamAccessRestrictionsRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    inline def setResponse(value: OctokitResponse[ReposAddTeamAccessRestrictionsResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
