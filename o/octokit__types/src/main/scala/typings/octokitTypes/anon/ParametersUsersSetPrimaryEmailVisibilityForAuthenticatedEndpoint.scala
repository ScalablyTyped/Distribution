package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.UsersSetPrimaryEmailVisibilityForAuthenticatedEndpoint
import typings.octokitTypes.endpointsMod.UsersSetPrimaryEmailVisibilityForAuthenticatedRequestOptions
import typings.octokitTypes.endpointsMod.UsersSetPrimaryEmailVisibilityForAuthenticatedResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersUsersSetPrimaryEmailVisibilityForAuthenticatedEndpoint extends StObject {
  
  var parameters: UsersSetPrimaryEmailVisibilityForAuthenticatedEndpoint
  
  var request: UsersSetPrimaryEmailVisibilityForAuthenticatedRequestOptions
  
  var response: OctokitResponse[UsersSetPrimaryEmailVisibilityForAuthenticatedResponseData]
}
object ParametersUsersSetPrimaryEmailVisibilityForAuthenticatedEndpoint {
  
  inline def apply(
    parameters: UsersSetPrimaryEmailVisibilityForAuthenticatedEndpoint,
    request: UsersSetPrimaryEmailVisibilityForAuthenticatedRequestOptions,
    response: OctokitResponse[UsersSetPrimaryEmailVisibilityForAuthenticatedResponseData]
  ): ParametersUsersSetPrimaryEmailVisibilityForAuthenticatedEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersUsersSetPrimaryEmailVisibilityForAuthenticatedEndpoint]
  }
  
  extension [Self <: ParametersUsersSetPrimaryEmailVisibilityForAuthenticatedEndpoint](x: Self) {
    
    inline def setParameters(value: UsersSetPrimaryEmailVisibilityForAuthenticatedEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequest(value: UsersSetPrimaryEmailVisibilityForAuthenticatedRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    inline def setResponse(value: OctokitResponse[UsersSetPrimaryEmailVisibilityForAuthenticatedResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
