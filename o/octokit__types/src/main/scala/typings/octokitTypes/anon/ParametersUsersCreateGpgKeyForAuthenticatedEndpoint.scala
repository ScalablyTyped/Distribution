package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.UsersCreateGpgKeyForAuthenticatedEndpoint
import typings.octokitTypes.endpointsMod.UsersCreateGpgKeyForAuthenticatedRequestOptions
import typings.octokitTypes.endpointsMod.UsersCreateGpgKeyForAuthenticatedResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersUsersCreateGpgKeyForAuthenticatedEndpoint extends StObject {
  
  var parameters: UsersCreateGpgKeyForAuthenticatedEndpoint = js.native
  
  var request: UsersCreateGpgKeyForAuthenticatedRequestOptions = js.native
  
  var response: OctokitResponse[UsersCreateGpgKeyForAuthenticatedResponseData] = js.native
}
object ParametersUsersCreateGpgKeyForAuthenticatedEndpoint {
  
  @scala.inline
  def apply(
    parameters: UsersCreateGpgKeyForAuthenticatedEndpoint,
    request: UsersCreateGpgKeyForAuthenticatedRequestOptions,
    response: OctokitResponse[UsersCreateGpgKeyForAuthenticatedResponseData]
  ): ParametersUsersCreateGpgKeyForAuthenticatedEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersUsersCreateGpgKeyForAuthenticatedEndpoint]
  }
  
  @scala.inline
  implicit class ParametersUsersCreateGpgKeyForAuthenticatedEndpointMutableBuilder[Self <: ParametersUsersCreateGpgKeyForAuthenticatedEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: UsersCreateGpgKeyForAuthenticatedEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: UsersCreateGpgKeyForAuthenticatedRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[UsersCreateGpgKeyForAuthenticatedResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
