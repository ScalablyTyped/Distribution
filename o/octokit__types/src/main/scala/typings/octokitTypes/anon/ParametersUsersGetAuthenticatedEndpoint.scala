package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.UsersGetAuthenticatedEndpoint
import typings.octokitTypes.endpointsMod.UsersGetAuthenticatedRequestOptions
import typings.octokitTypes.endpointsMod.UsersGetAuthenticatedResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersUsersGetAuthenticatedEndpoint extends StObject {
  
  var parameters: UsersGetAuthenticatedEndpoint
  
  var request: UsersGetAuthenticatedRequestOptions
  
  var response: OctokitResponse[UsersGetAuthenticatedResponseData]
}
object ParametersUsersGetAuthenticatedEndpoint {
  
  inline def apply(
    parameters: UsersGetAuthenticatedEndpoint,
    request: UsersGetAuthenticatedRequestOptions,
    response: OctokitResponse[UsersGetAuthenticatedResponseData]
  ): ParametersUsersGetAuthenticatedEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersUsersGetAuthenticatedEndpoint]
  }
  
  extension [Self <: ParametersUsersGetAuthenticatedEndpoint](x: Self) {
    
    inline def setParameters(value: UsersGetAuthenticatedEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequest(value: UsersGetAuthenticatedRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    inline def setResponse(value: OctokitResponse[UsersGetAuthenticatedResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
