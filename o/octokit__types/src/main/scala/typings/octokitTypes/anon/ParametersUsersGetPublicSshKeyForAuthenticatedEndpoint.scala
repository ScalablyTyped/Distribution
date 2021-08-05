package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.UsersGetPublicSshKeyForAuthenticatedEndpoint
import typings.octokitTypes.endpointsMod.UsersGetPublicSshKeyForAuthenticatedRequestOptions
import typings.octokitTypes.endpointsMod.UsersGetPublicSshKeyForAuthenticatedResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersUsersGetPublicSshKeyForAuthenticatedEndpoint extends StObject {
  
  var parameters: UsersGetPublicSshKeyForAuthenticatedEndpoint
  
  var request: UsersGetPublicSshKeyForAuthenticatedRequestOptions
  
  var response: OctokitResponse[UsersGetPublicSshKeyForAuthenticatedResponseData]
}
object ParametersUsersGetPublicSshKeyForAuthenticatedEndpoint {
  
  inline def apply(
    parameters: UsersGetPublicSshKeyForAuthenticatedEndpoint,
    request: UsersGetPublicSshKeyForAuthenticatedRequestOptions,
    response: OctokitResponse[UsersGetPublicSshKeyForAuthenticatedResponseData]
  ): ParametersUsersGetPublicSshKeyForAuthenticatedEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersUsersGetPublicSshKeyForAuthenticatedEndpoint]
  }
  
  extension [Self <: ParametersUsersGetPublicSshKeyForAuthenticatedEndpoint](x: Self) {
    
    inline def setParameters(value: UsersGetPublicSshKeyForAuthenticatedEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequest(value: UsersGetPublicSshKeyForAuthenticatedRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    inline def setResponse(value: OctokitResponse[UsersGetPublicSshKeyForAuthenticatedResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
