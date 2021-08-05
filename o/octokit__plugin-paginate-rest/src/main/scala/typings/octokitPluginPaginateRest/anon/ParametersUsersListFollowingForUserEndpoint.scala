package typings.octokitPluginPaginateRest.anon

import typings.octokitTypes.endpointsMod.UsersListFollowingForUserEndpoint
import typings.octokitTypes.endpointsMod.UsersListFollowingForUserResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersUsersListFollowingForUserEndpoint extends StObject {
  
  var parameters: UsersListFollowingForUserEndpoint
  
  var response: OctokitResponse[UsersListFollowingForUserResponseData]
}
object ParametersUsersListFollowingForUserEndpoint {
  
  inline def apply(
    parameters: UsersListFollowingForUserEndpoint,
    response: OctokitResponse[UsersListFollowingForUserResponseData]
  ): ParametersUsersListFollowingForUserEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersUsersListFollowingForUserEndpoint]
  }
  
  extension [Self <: ParametersUsersListFollowingForUserEndpoint](x: Self) {
    
    inline def setParameters(value: UsersListFollowingForUserEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponse(value: OctokitResponse[UsersListFollowingForUserResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
