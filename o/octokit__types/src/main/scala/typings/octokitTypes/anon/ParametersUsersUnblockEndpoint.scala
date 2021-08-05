package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.UsersUnblockEndpoint
import typings.octokitTypes.endpointsMod.UsersUnblockRequestOptions
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersUsersUnblockEndpoint extends StObject {
  
  var parameters: UsersUnblockEndpoint
  
  var request: UsersUnblockRequestOptions
  
  var response: OctokitResponse[js.Any]
}
object ParametersUsersUnblockEndpoint {
  
  inline def apply(
    parameters: UsersUnblockEndpoint,
    request: UsersUnblockRequestOptions,
    response: OctokitResponse[js.Any]
  ): ParametersUsersUnblockEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersUsersUnblockEndpoint]
  }
  
  extension [Self <: ParametersUsersUnblockEndpoint](x: Self) {
    
    inline def setParameters(value: UsersUnblockEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequest(value: UsersUnblockRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    inline def setResponse(value: OctokitResponse[js.Any]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
