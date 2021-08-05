package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.UsersFollowEndpoint
import typings.octokitTypes.endpointsMod.UsersFollowRequestOptions
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersUsersFollowEndpoint extends StObject {
  
  var parameters: UsersFollowEndpoint
  
  var request: UsersFollowRequestOptions
  
  var response: OctokitResponse[js.Any]
}
object ParametersUsersFollowEndpoint {
  
  inline def apply(
    parameters: UsersFollowEndpoint,
    request: UsersFollowRequestOptions,
    response: OctokitResponse[js.Any]
  ): ParametersUsersFollowEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersUsersFollowEndpoint]
  }
  
  extension [Self <: ParametersUsersFollowEndpoint](x: Self) {
    
    inline def setParameters(value: UsersFollowEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequest(value: UsersFollowRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    inline def setResponse(value: OctokitResponse[js.Any]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
