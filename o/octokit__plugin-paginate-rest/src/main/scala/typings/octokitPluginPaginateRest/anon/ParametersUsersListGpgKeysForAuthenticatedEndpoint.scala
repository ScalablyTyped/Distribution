package typings.octokitPluginPaginateRest.anon

import typings.octokitTypes.endpointsMod.UsersListGpgKeysForAuthenticatedEndpoint
import typings.octokitTypes.endpointsMod.UsersListGpgKeysForAuthenticatedResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersUsersListGpgKeysForAuthenticatedEndpoint extends StObject {
  
  var parameters: UsersListGpgKeysForAuthenticatedEndpoint = js.native
  
  var response: OctokitResponse[UsersListGpgKeysForAuthenticatedResponseData] = js.native
}
object ParametersUsersListGpgKeysForAuthenticatedEndpoint {
  
  @scala.inline
  def apply(
    parameters: UsersListGpgKeysForAuthenticatedEndpoint,
    response: OctokitResponse[UsersListGpgKeysForAuthenticatedResponseData]
  ): ParametersUsersListGpgKeysForAuthenticatedEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersUsersListGpgKeysForAuthenticatedEndpoint]
  }
  
  @scala.inline
  implicit class ParametersUsersListGpgKeysForAuthenticatedEndpointMutableBuilder[Self <: ParametersUsersListGpgKeysForAuthenticatedEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: UsersListGpgKeysForAuthenticatedEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[UsersListGpgKeysForAuthenticatedResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
