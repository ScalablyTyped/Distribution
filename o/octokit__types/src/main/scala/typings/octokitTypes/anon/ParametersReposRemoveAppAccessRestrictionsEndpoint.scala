package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.ReposRemoveAppAccessRestrictionsEndpoint
import typings.octokitTypes.endpointsMod.ReposRemoveAppAccessRestrictionsRequestOptions
import typings.octokitTypes.endpointsMod.ReposRemoveAppAccessRestrictionsResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersReposRemoveAppAccessRestrictionsEndpoint extends StObject {
  
  var parameters: ReposRemoveAppAccessRestrictionsEndpoint
  
  var request: ReposRemoveAppAccessRestrictionsRequestOptions
  
  var response: OctokitResponse[ReposRemoveAppAccessRestrictionsResponseData]
}
object ParametersReposRemoveAppAccessRestrictionsEndpoint {
  
  inline def apply(
    parameters: ReposRemoveAppAccessRestrictionsEndpoint,
    request: ReposRemoveAppAccessRestrictionsRequestOptions,
    response: OctokitResponse[ReposRemoveAppAccessRestrictionsResponseData]
  ): ParametersReposRemoveAppAccessRestrictionsEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersReposRemoveAppAccessRestrictionsEndpoint]
  }
  
  extension [Self <: ParametersReposRemoveAppAccessRestrictionsEndpoint](x: Self) {
    
    inline def setParameters(value: ReposRemoveAppAccessRestrictionsEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequest(value: ReposRemoveAppAccessRestrictionsRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    inline def setResponse(value: OctokitResponse[ReposRemoveAppAccessRestrictionsResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
