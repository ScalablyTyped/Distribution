package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.ReposAddAppAccessRestrictionsEndpoint
import typings.octokitTypes.endpointsMod.ReposAddAppAccessRestrictionsRequestOptions
import typings.octokitTypes.endpointsMod.ReposAddAppAccessRestrictionsResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersReposAddAppAccessRestrictionsEndpoint extends StObject {
  
  var parameters: ReposAddAppAccessRestrictionsEndpoint
  
  var request: ReposAddAppAccessRestrictionsRequestOptions
  
  var response: OctokitResponse[ReposAddAppAccessRestrictionsResponseData]
}
object ParametersReposAddAppAccessRestrictionsEndpoint {
  
  inline def apply(
    parameters: ReposAddAppAccessRestrictionsEndpoint,
    request: ReposAddAppAccessRestrictionsRequestOptions,
    response: OctokitResponse[ReposAddAppAccessRestrictionsResponseData]
  ): ParametersReposAddAppAccessRestrictionsEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersReposAddAppAccessRestrictionsEndpoint]
  }
  
  extension [Self <: ParametersReposAddAppAccessRestrictionsEndpoint](x: Self) {
    
    inline def setParameters(value: ReposAddAppAccessRestrictionsEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequest(value: ReposAddAppAccessRestrictionsRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    inline def setResponse(value: OctokitResponse[ReposAddAppAccessRestrictionsResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
