package typings.octokitPluginPaginateRest.anon

import typings.octokitTypes.endpointsMod.UsersListEmailsForAuthenticatedEndpoint
import typings.octokitTypes.endpointsMod.UsersListEmailsForAuthenticatedResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersUsersListEmailsForAuthenticatedEndpoint extends StObject {
  
  var parameters: UsersListEmailsForAuthenticatedEndpoint
  
  var response: OctokitResponse[UsersListEmailsForAuthenticatedResponseData]
}
object ParametersUsersListEmailsForAuthenticatedEndpoint {
  
  inline def apply(
    parameters: UsersListEmailsForAuthenticatedEndpoint,
    response: OctokitResponse[UsersListEmailsForAuthenticatedResponseData]
  ): ParametersUsersListEmailsForAuthenticatedEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersUsersListEmailsForAuthenticatedEndpoint]
  }
  
  extension [Self <: ParametersUsersListEmailsForAuthenticatedEndpoint](x: Self) {
    
    inline def setParameters(value: UsersListEmailsForAuthenticatedEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponse(value: OctokitResponse[UsersListEmailsForAuthenticatedResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
