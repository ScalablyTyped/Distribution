package typings.octokitPluginPaginateRest.anon

import typings.octokitTypes.endpointsMod.UsersListGpgKeysForAuthenticatedEndpoint
import typings.octokitTypes.endpointsMod.UsersListGpgKeysForAuthenticatedResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersUsersListGpgKeysForAuthenticatedEndpoint extends StObject {
  
  var parameters: UsersListGpgKeysForAuthenticatedEndpoint
  
  var response: OctokitResponse[UsersListGpgKeysForAuthenticatedResponseData]
}
object ParametersUsersListGpgKeysForAuthenticatedEndpoint {
  
  inline def apply(
    parameters: UsersListGpgKeysForAuthenticatedEndpoint,
    response: OctokitResponse[UsersListGpgKeysForAuthenticatedResponseData]
  ): ParametersUsersListGpgKeysForAuthenticatedEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersUsersListGpgKeysForAuthenticatedEndpoint]
  }
  
  extension [Self <: ParametersUsersListGpgKeysForAuthenticatedEndpoint](x: Self) {
    
    inline def setParameters(value: UsersListGpgKeysForAuthenticatedEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponse(value: OctokitResponse[UsersListGpgKeysForAuthenticatedResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
