package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.UsersListPublicEmailsForAuthenticatedEndpoint
import typings.octokitTypes.endpointsMod.UsersListPublicEmailsForAuthenticatedRequestOptions
import typings.octokitTypes.endpointsMod.UsersListPublicEmailsForAuthenticatedResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersUsersListPublicEmailsForAuthenticatedEndpoint extends StObject {
  
  var parameters: UsersListPublicEmailsForAuthenticatedEndpoint
  
  var request: UsersListPublicEmailsForAuthenticatedRequestOptions
  
  var response: OctokitResponse[UsersListPublicEmailsForAuthenticatedResponseData]
}
object ParametersUsersListPublicEmailsForAuthenticatedEndpoint {
  
  @scala.inline
  def apply(
    parameters: UsersListPublicEmailsForAuthenticatedEndpoint,
    request: UsersListPublicEmailsForAuthenticatedRequestOptions,
    response: OctokitResponse[UsersListPublicEmailsForAuthenticatedResponseData]
  ): ParametersUsersListPublicEmailsForAuthenticatedEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersUsersListPublicEmailsForAuthenticatedEndpoint]
  }
  
  @scala.inline
  implicit class ParametersUsersListPublicEmailsForAuthenticatedEndpointMutableBuilder[Self <: ParametersUsersListPublicEmailsForAuthenticatedEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: UsersListPublicEmailsForAuthenticatedEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: UsersListPublicEmailsForAuthenticatedRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[UsersListPublicEmailsForAuthenticatedResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
