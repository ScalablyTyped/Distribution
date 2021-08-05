package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.UsersUpdateAuthenticatedEndpoint
import typings.octokitTypes.endpointsMod.UsersUpdateAuthenticatedRequestOptions
import typings.octokitTypes.endpointsMod.UsersUpdateAuthenticatedResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersUsersUpdateAuthenticatedEndpoint extends StObject {
  
  var parameters: UsersUpdateAuthenticatedEndpoint
  
  var request: UsersUpdateAuthenticatedRequestOptions
  
  var response: OctokitResponse[UsersUpdateAuthenticatedResponseData]
}
object ParametersUsersUpdateAuthenticatedEndpoint {
  
  inline def apply(
    parameters: UsersUpdateAuthenticatedEndpoint,
    request: UsersUpdateAuthenticatedRequestOptions,
    response: OctokitResponse[UsersUpdateAuthenticatedResponseData]
  ): ParametersUsersUpdateAuthenticatedEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersUsersUpdateAuthenticatedEndpoint]
  }
  
  extension [Self <: ParametersUsersUpdateAuthenticatedEndpoint](x: Self) {
    
    inline def setParameters(value: UsersUpdateAuthenticatedEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequest(value: UsersUpdateAuthenticatedRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    inline def setResponse(value: OctokitResponse[UsersUpdateAuthenticatedResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
