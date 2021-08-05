package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.ReposAddUserAccessRestrictionsEndpoint
import typings.octokitTypes.endpointsMod.ReposAddUserAccessRestrictionsRequestOptions
import typings.octokitTypes.endpointsMod.ReposAddUserAccessRestrictionsResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersReposAddUserAccessRestrictionsEndpoint extends StObject {
  
  var parameters: ReposAddUserAccessRestrictionsEndpoint
  
  var request: ReposAddUserAccessRestrictionsRequestOptions
  
  var response: OctokitResponse[ReposAddUserAccessRestrictionsResponseData]
}
object ParametersReposAddUserAccessRestrictionsEndpoint {
  
  inline def apply(
    parameters: ReposAddUserAccessRestrictionsEndpoint,
    request: ReposAddUserAccessRestrictionsRequestOptions,
    response: OctokitResponse[ReposAddUserAccessRestrictionsResponseData]
  ): ParametersReposAddUserAccessRestrictionsEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersReposAddUserAccessRestrictionsEndpoint]
  }
  
  extension [Self <: ParametersReposAddUserAccessRestrictionsEndpoint](x: Self) {
    
    inline def setParameters(value: ReposAddUserAccessRestrictionsEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequest(value: ReposAddUserAccessRestrictionsRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    inline def setResponse(value: OctokitResponse[ReposAddUserAccessRestrictionsResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
