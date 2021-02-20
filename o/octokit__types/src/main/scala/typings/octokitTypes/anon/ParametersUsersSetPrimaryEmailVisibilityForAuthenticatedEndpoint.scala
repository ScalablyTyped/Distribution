package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.UsersSetPrimaryEmailVisibilityForAuthenticatedEndpoint
import typings.octokitTypes.endpointsMod.UsersSetPrimaryEmailVisibilityForAuthenticatedRequestOptions
import typings.octokitTypes.endpointsMod.UsersSetPrimaryEmailVisibilityForAuthenticatedResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersUsersSetPrimaryEmailVisibilityForAuthenticatedEndpoint extends StObject {
  
  var parameters: UsersSetPrimaryEmailVisibilityForAuthenticatedEndpoint = js.native
  
  var request: UsersSetPrimaryEmailVisibilityForAuthenticatedRequestOptions = js.native
  
  var response: OctokitResponse[UsersSetPrimaryEmailVisibilityForAuthenticatedResponseData] = js.native
}
object ParametersUsersSetPrimaryEmailVisibilityForAuthenticatedEndpoint {
  
  @scala.inline
  def apply(
    parameters: UsersSetPrimaryEmailVisibilityForAuthenticatedEndpoint,
    request: UsersSetPrimaryEmailVisibilityForAuthenticatedRequestOptions,
    response: OctokitResponse[UsersSetPrimaryEmailVisibilityForAuthenticatedResponseData]
  ): ParametersUsersSetPrimaryEmailVisibilityForAuthenticatedEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersUsersSetPrimaryEmailVisibilityForAuthenticatedEndpoint]
  }
  
  @scala.inline
  implicit class ParametersUsersSetPrimaryEmailVisibilityForAuthenticatedEndpointMutableBuilder[Self <: ParametersUsersSetPrimaryEmailVisibilityForAuthenticatedEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: UsersSetPrimaryEmailVisibilityForAuthenticatedEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: UsersSetPrimaryEmailVisibilityForAuthenticatedRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[UsersSetPrimaryEmailVisibilityForAuthenticatedResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
