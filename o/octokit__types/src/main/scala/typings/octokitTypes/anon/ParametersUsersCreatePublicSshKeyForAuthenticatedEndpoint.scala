package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.UsersCreatePublicSshKeyForAuthenticatedEndpoint
import typings.octokitTypes.endpointsMod.UsersCreatePublicSshKeyForAuthenticatedRequestOptions
import typings.octokitTypes.endpointsMod.UsersCreatePublicSshKeyForAuthenticatedResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersUsersCreatePublicSshKeyForAuthenticatedEndpoint extends StObject {
  
  var parameters: UsersCreatePublicSshKeyForAuthenticatedEndpoint = js.native
  
  var request: UsersCreatePublicSshKeyForAuthenticatedRequestOptions = js.native
  
  var response: OctokitResponse[UsersCreatePublicSshKeyForAuthenticatedResponseData] = js.native
}
object ParametersUsersCreatePublicSshKeyForAuthenticatedEndpoint {
  
  @scala.inline
  def apply(
    parameters: UsersCreatePublicSshKeyForAuthenticatedEndpoint,
    request: UsersCreatePublicSshKeyForAuthenticatedRequestOptions,
    response: OctokitResponse[UsersCreatePublicSshKeyForAuthenticatedResponseData]
  ): ParametersUsersCreatePublicSshKeyForAuthenticatedEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersUsersCreatePublicSshKeyForAuthenticatedEndpoint]
  }
  
  @scala.inline
  implicit class ParametersUsersCreatePublicSshKeyForAuthenticatedEndpointMutableBuilder[Self <: ParametersUsersCreatePublicSshKeyForAuthenticatedEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: UsersCreatePublicSshKeyForAuthenticatedEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: UsersCreatePublicSshKeyForAuthenticatedRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[UsersCreatePublicSshKeyForAuthenticatedResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
