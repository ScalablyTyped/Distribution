package typings.octokitPluginPaginateRest.anon

import typings.octokitTypes.endpointsMod.UsersListPublicSshKeysForAuthenticatedEndpoint
import typings.octokitTypes.endpointsMod.UsersListPublicSshKeysForAuthenticatedResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersUsersListPublicSshKeysForAuthenticatedEndpoint extends StObject {
  
  var parameters: UsersListPublicSshKeysForAuthenticatedEndpoint
  
  var response: OctokitResponse[UsersListPublicSshKeysForAuthenticatedResponseData]
}
object ParametersUsersListPublicSshKeysForAuthenticatedEndpoint {
  
  inline def apply(
    parameters: UsersListPublicSshKeysForAuthenticatedEndpoint,
    response: OctokitResponse[UsersListPublicSshKeysForAuthenticatedResponseData]
  ): ParametersUsersListPublicSshKeysForAuthenticatedEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersUsersListPublicSshKeysForAuthenticatedEndpoint]
  }
  
  extension [Self <: ParametersUsersListPublicSshKeysForAuthenticatedEndpoint](x: Self) {
    
    inline def setParameters(value: UsersListPublicSshKeysForAuthenticatedEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponse(value: OctokitResponse[UsersListPublicSshKeysForAuthenticatedResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
