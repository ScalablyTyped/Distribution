package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.UsersGetContextForUserEndpoint
import typings.octokitTypes.endpointsMod.UsersGetContextForUserRequestOptions
import typings.octokitTypes.endpointsMod.UsersGetContextForUserResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersUsersGetContextForUserEndpoint extends StObject {
  
  var parameters: UsersGetContextForUserEndpoint
  
  var request: UsersGetContextForUserRequestOptions
  
  var response: OctokitResponse[UsersGetContextForUserResponseData]
}
object ParametersUsersGetContextForUserEndpoint {
  
  inline def apply(
    parameters: UsersGetContextForUserEndpoint,
    request: UsersGetContextForUserRequestOptions,
    response: OctokitResponse[UsersGetContextForUserResponseData]
  ): ParametersUsersGetContextForUserEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersUsersGetContextForUserEndpoint]
  }
  
  extension [Self <: ParametersUsersGetContextForUserEndpoint](x: Self) {
    
    inline def setParameters(value: UsersGetContextForUserEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequest(value: UsersGetContextForUserRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    inline def setResponse(value: OctokitResponse[UsersGetContextForUserResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
