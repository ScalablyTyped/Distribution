package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.ReposSetUserAccessRestrictionsEndpoint
import typings.octokitTypes.endpointsMod.ReposSetUserAccessRestrictionsRequestOptions
import typings.octokitTypes.endpointsMod.ReposSetUserAccessRestrictionsResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersReposSetUserAccessRestrictionsEndpoint extends StObject {
  
  var parameters: ReposSetUserAccessRestrictionsEndpoint
  
  var request: ReposSetUserAccessRestrictionsRequestOptions
  
  var response: OctokitResponse[ReposSetUserAccessRestrictionsResponseData]
}
object ParametersReposSetUserAccessRestrictionsEndpoint {
  
  inline def apply(
    parameters: ReposSetUserAccessRestrictionsEndpoint,
    request: ReposSetUserAccessRestrictionsRequestOptions,
    response: OctokitResponse[ReposSetUserAccessRestrictionsResponseData]
  ): ParametersReposSetUserAccessRestrictionsEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersReposSetUserAccessRestrictionsEndpoint]
  }
  
  extension [Self <: ParametersReposSetUserAccessRestrictionsEndpoint](x: Self) {
    
    inline def setParameters(value: ReposSetUserAccessRestrictionsEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequest(value: ReposSetUserAccessRestrictionsRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    inline def setResponse(value: OctokitResponse[ReposSetUserAccessRestrictionsResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
