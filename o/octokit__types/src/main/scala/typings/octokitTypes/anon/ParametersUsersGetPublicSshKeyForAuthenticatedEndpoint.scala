package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.UsersGetPublicSshKeyForAuthenticatedEndpoint
import typings.octokitTypes.endpointsMod.UsersGetPublicSshKeyForAuthenticatedRequestOptions
import typings.octokitTypes.endpointsMod.UsersGetPublicSshKeyForAuthenticatedResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersUsersGetPublicSshKeyForAuthenticatedEndpoint extends StObject {
  
  var parameters: UsersGetPublicSshKeyForAuthenticatedEndpoint = js.native
  
  var request: UsersGetPublicSshKeyForAuthenticatedRequestOptions = js.native
  
  var response: OctokitResponse[UsersGetPublicSshKeyForAuthenticatedResponseData] = js.native
}
object ParametersUsersGetPublicSshKeyForAuthenticatedEndpoint {
  
  @scala.inline
  def apply(
    parameters: UsersGetPublicSshKeyForAuthenticatedEndpoint,
    request: UsersGetPublicSshKeyForAuthenticatedRequestOptions,
    response: OctokitResponse[UsersGetPublicSshKeyForAuthenticatedResponseData]
  ): ParametersUsersGetPublicSshKeyForAuthenticatedEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersUsersGetPublicSshKeyForAuthenticatedEndpoint]
  }
  
  @scala.inline
  implicit class ParametersUsersGetPublicSshKeyForAuthenticatedEndpointMutableBuilder[Self <: ParametersUsersGetPublicSshKeyForAuthenticatedEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: UsersGetPublicSshKeyForAuthenticatedEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: UsersGetPublicSshKeyForAuthenticatedRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[UsersGetPublicSshKeyForAuthenticatedResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
