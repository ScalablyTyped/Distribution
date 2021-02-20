package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.UsersListFollowedByAuthenticatedEndpoint
import typings.octokitTypes.endpointsMod.UsersListFollowedByAuthenticatedRequestOptions
import typings.octokitTypes.endpointsMod.UsersListFollowedByAuthenticatedResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersUsersListFollowedByAuthenticatedEndpoint extends StObject {
  
  var parameters: UsersListFollowedByAuthenticatedEndpoint = js.native
  
  var request: UsersListFollowedByAuthenticatedRequestOptions = js.native
  
  var response: OctokitResponse[UsersListFollowedByAuthenticatedResponseData] = js.native
}
object ParametersUsersListFollowedByAuthenticatedEndpoint {
  
  @scala.inline
  def apply(
    parameters: UsersListFollowedByAuthenticatedEndpoint,
    request: UsersListFollowedByAuthenticatedRequestOptions,
    response: OctokitResponse[UsersListFollowedByAuthenticatedResponseData]
  ): ParametersUsersListFollowedByAuthenticatedEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersUsersListFollowedByAuthenticatedEndpoint]
  }
  
  @scala.inline
  implicit class ParametersUsersListFollowedByAuthenticatedEndpointMutableBuilder[Self <: ParametersUsersListFollowedByAuthenticatedEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: UsersListFollowedByAuthenticatedEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: UsersListFollowedByAuthenticatedRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[UsersListFollowedByAuthenticatedResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
