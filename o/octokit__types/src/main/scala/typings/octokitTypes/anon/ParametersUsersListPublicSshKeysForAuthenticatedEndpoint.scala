package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.UsersListPublicSshKeysForAuthenticatedEndpoint
import typings.octokitTypes.endpointsMod.UsersListPublicSshKeysForAuthenticatedRequestOptions
import typings.octokitTypes.endpointsMod.UsersListPublicSshKeysForAuthenticatedResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersUsersListPublicSshKeysForAuthenticatedEndpoint extends StObject {
  
  var parameters: UsersListPublicSshKeysForAuthenticatedEndpoint
  
  var request: UsersListPublicSshKeysForAuthenticatedRequestOptions
  
  var response: OctokitResponse[UsersListPublicSshKeysForAuthenticatedResponseData]
}
object ParametersUsersListPublicSshKeysForAuthenticatedEndpoint {
  
  @scala.inline
  def apply(
    parameters: UsersListPublicSshKeysForAuthenticatedEndpoint,
    request: UsersListPublicSshKeysForAuthenticatedRequestOptions,
    response: OctokitResponse[UsersListPublicSshKeysForAuthenticatedResponseData]
  ): ParametersUsersListPublicSshKeysForAuthenticatedEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersUsersListPublicSshKeysForAuthenticatedEndpoint]
  }
  
  @scala.inline
  implicit class ParametersUsersListPublicSshKeysForAuthenticatedEndpointMutableBuilder[Self <: ParametersUsersListPublicSshKeysForAuthenticatedEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: UsersListPublicSshKeysForAuthenticatedEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: UsersListPublicSshKeysForAuthenticatedRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[UsersListPublicSshKeysForAuthenticatedResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
