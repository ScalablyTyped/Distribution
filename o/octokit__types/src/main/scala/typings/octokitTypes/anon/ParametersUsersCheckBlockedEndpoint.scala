package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.UsersCheckBlockedEndpoint
import typings.octokitTypes.endpointsMod.UsersCheckBlockedRequestOptions
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersUsersCheckBlockedEndpoint extends StObject {
  
  var parameters: UsersCheckBlockedEndpoint = js.native
  
  var request: UsersCheckBlockedRequestOptions = js.native
  
  var response: OctokitResponse[_] = js.native
}
object ParametersUsersCheckBlockedEndpoint {
  
  @scala.inline
  def apply(
    parameters: UsersCheckBlockedEndpoint,
    request: UsersCheckBlockedRequestOptions,
    response: OctokitResponse[_]
  ): ParametersUsersCheckBlockedEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersUsersCheckBlockedEndpoint]
  }
  
  @scala.inline
  implicit class ParametersUsersCheckBlockedEndpointMutableBuilder[Self <: ParametersUsersCheckBlockedEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: UsersCheckBlockedEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: UsersCheckBlockedRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[_]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
