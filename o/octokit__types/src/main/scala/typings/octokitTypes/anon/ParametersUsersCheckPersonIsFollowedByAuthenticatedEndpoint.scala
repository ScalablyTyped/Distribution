package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.UsersCheckPersonIsFollowedByAuthenticatedEndpoint
import typings.octokitTypes.endpointsMod.UsersCheckPersonIsFollowedByAuthenticatedRequestOptions
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersUsersCheckPersonIsFollowedByAuthenticatedEndpoint extends StObject {
  
  var parameters: UsersCheckPersonIsFollowedByAuthenticatedEndpoint
  
  var request: UsersCheckPersonIsFollowedByAuthenticatedRequestOptions
  
  var response: OctokitResponse[js.Any]
}
object ParametersUsersCheckPersonIsFollowedByAuthenticatedEndpoint {
  
  @scala.inline
  def apply(
    parameters: UsersCheckPersonIsFollowedByAuthenticatedEndpoint,
    request: UsersCheckPersonIsFollowedByAuthenticatedRequestOptions,
    response: OctokitResponse[js.Any]
  ): ParametersUsersCheckPersonIsFollowedByAuthenticatedEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersUsersCheckPersonIsFollowedByAuthenticatedEndpoint]
  }
  
  @scala.inline
  implicit class ParametersUsersCheckPersonIsFollowedByAuthenticatedEndpointMutableBuilder[Self <: ParametersUsersCheckPersonIsFollowedByAuthenticatedEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: UsersCheckPersonIsFollowedByAuthenticatedEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: UsersCheckPersonIsFollowedByAuthenticatedRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[js.Any]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
