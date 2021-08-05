package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.UsersCreatePublicSshKeyForAuthenticatedEndpoint
import typings.octokitTypes.endpointsMod.UsersCreatePublicSshKeyForAuthenticatedRequestOptions
import typings.octokitTypes.endpointsMod.UsersCreatePublicSshKeyForAuthenticatedResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersUsersCreatePublicSshKeyForAuthenticatedEndpoint extends StObject {
  
  var parameters: UsersCreatePublicSshKeyForAuthenticatedEndpoint
  
  var request: UsersCreatePublicSshKeyForAuthenticatedRequestOptions
  
  var response: OctokitResponse[UsersCreatePublicSshKeyForAuthenticatedResponseData]
}
object ParametersUsersCreatePublicSshKeyForAuthenticatedEndpoint {
  
  inline def apply(
    parameters: UsersCreatePublicSshKeyForAuthenticatedEndpoint,
    request: UsersCreatePublicSshKeyForAuthenticatedRequestOptions,
    response: OctokitResponse[UsersCreatePublicSshKeyForAuthenticatedResponseData]
  ): ParametersUsersCreatePublicSshKeyForAuthenticatedEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersUsersCreatePublicSshKeyForAuthenticatedEndpoint]
  }
  
  extension [Self <: ParametersUsersCreatePublicSshKeyForAuthenticatedEndpoint](x: Self) {
    
    inline def setParameters(value: UsersCreatePublicSshKeyForAuthenticatedEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequest(value: UsersCreatePublicSshKeyForAuthenticatedRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    inline def setResponse(value: OctokitResponse[UsersCreatePublicSshKeyForAuthenticatedResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
