package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.UsersListEndpoint
import typings.octokitTypes.endpointsMod.UsersListRequestOptions
import typings.octokitTypes.endpointsMod.UsersListResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersUsersListEndpoint extends StObject {
  
  var parameters: UsersListEndpoint = js.native
  
  var request: UsersListRequestOptions = js.native
  
  var response: OctokitResponse[UsersListResponseData] = js.native
}
object ParametersUsersListEndpoint {
  
  @scala.inline
  def apply(
    parameters: UsersListEndpoint,
    request: UsersListRequestOptions,
    response: OctokitResponse[UsersListResponseData]
  ): ParametersUsersListEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersUsersListEndpoint]
  }
  
  @scala.inline
  implicit class ParametersUsersListEndpointMutableBuilder[Self <: ParametersUsersListEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: UsersListEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: UsersListRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[UsersListResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
