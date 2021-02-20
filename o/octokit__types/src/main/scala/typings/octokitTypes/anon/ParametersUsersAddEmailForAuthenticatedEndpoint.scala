package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.UsersAddEmailForAuthenticatedEndpoint
import typings.octokitTypes.endpointsMod.UsersAddEmailForAuthenticatedRequestOptions
import typings.octokitTypes.endpointsMod.UsersAddEmailForAuthenticatedResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersUsersAddEmailForAuthenticatedEndpoint extends StObject {
  
  var parameters: UsersAddEmailForAuthenticatedEndpoint = js.native
  
  var request: UsersAddEmailForAuthenticatedRequestOptions = js.native
  
  var response: OctokitResponse[UsersAddEmailForAuthenticatedResponseData] = js.native
}
object ParametersUsersAddEmailForAuthenticatedEndpoint {
  
  @scala.inline
  def apply(
    parameters: UsersAddEmailForAuthenticatedEndpoint,
    request: UsersAddEmailForAuthenticatedRequestOptions,
    response: OctokitResponse[UsersAddEmailForAuthenticatedResponseData]
  ): ParametersUsersAddEmailForAuthenticatedEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersUsersAddEmailForAuthenticatedEndpoint]
  }
  
  @scala.inline
  implicit class ParametersUsersAddEmailForAuthenticatedEndpointMutableBuilder[Self <: ParametersUsersAddEmailForAuthenticatedEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: UsersAddEmailForAuthenticatedEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: UsersAddEmailForAuthenticatedRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[UsersAddEmailForAuthenticatedResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
