package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.ReposGetAccessRestrictionsEndpoint
import typings.octokitTypes.endpointsMod.ReposGetAccessRestrictionsRequestOptions
import typings.octokitTypes.endpointsMod.ReposGetAccessRestrictionsResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersReposGetAccessRestrictionsEndpoint extends StObject {
  
  var parameters: ReposGetAccessRestrictionsEndpoint
  
  var request: ReposGetAccessRestrictionsRequestOptions
  
  var response: OctokitResponse[ReposGetAccessRestrictionsResponseData]
}
object ParametersReposGetAccessRestrictionsEndpoint {
  
  inline def apply(
    parameters: ReposGetAccessRestrictionsEndpoint,
    request: ReposGetAccessRestrictionsRequestOptions,
    response: OctokitResponse[ReposGetAccessRestrictionsResponseData]
  ): ParametersReposGetAccessRestrictionsEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersReposGetAccessRestrictionsEndpoint]
  }
  
  extension [Self <: ParametersReposGetAccessRestrictionsEndpoint](x: Self) {
    
    inline def setParameters(value: ReposGetAccessRestrictionsEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequest(value: ReposGetAccessRestrictionsRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    inline def setResponse(value: OctokitResponse[ReposGetAccessRestrictionsResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
