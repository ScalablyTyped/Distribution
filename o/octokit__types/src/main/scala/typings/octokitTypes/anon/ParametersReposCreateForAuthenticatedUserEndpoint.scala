package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.ReposCreateForAuthenticatedUserEndpoint
import typings.octokitTypes.endpointsMod.ReposCreateForAuthenticatedUserRequestOptions
import typings.octokitTypes.endpointsMod.ReposCreateForAuthenticatedUserResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersReposCreateForAuthenticatedUserEndpoint extends StObject {
  
  var parameters: ReposCreateForAuthenticatedUserEndpoint
  
  var request: ReposCreateForAuthenticatedUserRequestOptions
  
  var response: OctokitResponse[ReposCreateForAuthenticatedUserResponseData]
}
object ParametersReposCreateForAuthenticatedUserEndpoint {
  
  inline def apply(
    parameters: ReposCreateForAuthenticatedUserEndpoint,
    request: ReposCreateForAuthenticatedUserRequestOptions,
    response: OctokitResponse[ReposCreateForAuthenticatedUserResponseData]
  ): ParametersReposCreateForAuthenticatedUserEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersReposCreateForAuthenticatedUserEndpoint]
  }
  
  extension [Self <: ParametersReposCreateForAuthenticatedUserEndpoint](x: Self) {
    
    inline def setParameters(value: ReposCreateForAuthenticatedUserEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequest(value: ReposCreateForAuthenticatedUserRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    inline def setResponse(value: OctokitResponse[ReposCreateForAuthenticatedUserResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
