package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.UsersGetGpgKeyForAuthenticatedEndpoint
import typings.octokitTypes.endpointsMod.UsersGetGpgKeyForAuthenticatedRequestOptions
import typings.octokitTypes.endpointsMod.UsersGetGpgKeyForAuthenticatedResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersUsersGetGpgKeyForAuthenticatedEndpoint extends StObject {
  
  var parameters: UsersGetGpgKeyForAuthenticatedEndpoint
  
  var request: UsersGetGpgKeyForAuthenticatedRequestOptions
  
  var response: OctokitResponse[UsersGetGpgKeyForAuthenticatedResponseData]
}
object ParametersUsersGetGpgKeyForAuthenticatedEndpoint {
  
  @scala.inline
  def apply(
    parameters: UsersGetGpgKeyForAuthenticatedEndpoint,
    request: UsersGetGpgKeyForAuthenticatedRequestOptions,
    response: OctokitResponse[UsersGetGpgKeyForAuthenticatedResponseData]
  ): ParametersUsersGetGpgKeyForAuthenticatedEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersUsersGetGpgKeyForAuthenticatedEndpoint]
  }
  
  @scala.inline
  implicit class ParametersUsersGetGpgKeyForAuthenticatedEndpointMutableBuilder[Self <: ParametersUsersGetGpgKeyForAuthenticatedEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: UsersGetGpgKeyForAuthenticatedEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: UsersGetGpgKeyForAuthenticatedRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[UsersGetGpgKeyForAuthenticatedResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
