package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.UsersCheckFollowingForUserEndpoint
import typings.octokitTypes.endpointsMod.UsersCheckFollowingForUserRequestOptions
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersUsersCheckFollowingForUserEndpoint extends StObject {
  
  var parameters: UsersCheckFollowingForUserEndpoint
  
  var request: UsersCheckFollowingForUserRequestOptions
  
  var response: OctokitResponse[js.Any]
}
object ParametersUsersCheckFollowingForUserEndpoint {
  
  inline def apply(
    parameters: UsersCheckFollowingForUserEndpoint,
    request: UsersCheckFollowingForUserRequestOptions,
    response: OctokitResponse[js.Any]
  ): ParametersUsersCheckFollowingForUserEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersUsersCheckFollowingForUserEndpoint]
  }
  
  extension [Self <: ParametersUsersCheckFollowingForUserEndpoint](x: Self) {
    
    inline def setParameters(value: UsersCheckFollowingForUserEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequest(value: UsersCheckFollowingForUserRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    inline def setResponse(value: OctokitResponse[js.Any]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
