package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.UsersListPublicKeysForUserEndpoint
import typings.octokitTypes.endpointsMod.UsersListPublicKeysForUserRequestOptions
import typings.octokitTypes.endpointsMod.UsersListPublicKeysForUserResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersUsersListPublicKeysForUserEndpoint extends StObject {
  
  var parameters: UsersListPublicKeysForUserEndpoint
  
  var request: UsersListPublicKeysForUserRequestOptions
  
  var response: OctokitResponse[UsersListPublicKeysForUserResponseData]
}
object ParametersUsersListPublicKeysForUserEndpoint {
  
  @scala.inline
  def apply(
    parameters: UsersListPublicKeysForUserEndpoint,
    request: UsersListPublicKeysForUserRequestOptions,
    response: OctokitResponse[UsersListPublicKeysForUserResponseData]
  ): ParametersUsersListPublicKeysForUserEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersUsersListPublicKeysForUserEndpoint]
  }
  
  @scala.inline
  implicit class ParametersUsersListPublicKeysForUserEndpointMutableBuilder[Self <: ParametersUsersListPublicKeysForUserEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: UsersListPublicKeysForUserEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: UsersListPublicKeysForUserRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[UsersListPublicKeysForUserResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
