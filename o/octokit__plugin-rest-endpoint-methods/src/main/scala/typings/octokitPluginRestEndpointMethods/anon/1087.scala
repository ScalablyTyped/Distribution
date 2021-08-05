package typings.octokitPluginRestEndpointMethods.anon

import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typings.octokitTypes.endpointsMod.UsersListFollowedByAuthenticatedEndpoint
import typings.octokitTypes.endpointsMod.UsersListFollowedByAuthenticatedResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import typings.octokitTypes.requestParametersMod.RequestParameters
import typings.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `1087` extends StObject {
  
  var parameters: RequestParameters & (Omit[UsersListFollowedByAuthenticatedEndpoint, baseUrl | headers | mediaType])
  
  var response: OctokitResponse[UsersListFollowedByAuthenticatedResponseData]
}
object `1087` {
  
  inline def apply(
    parameters: RequestParameters & (Omit[UsersListFollowedByAuthenticatedEndpoint, baseUrl | headers | mediaType]),
    response: OctokitResponse[UsersListFollowedByAuthenticatedResponseData]
  ): `1087` = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[`1087`]
  }
  
  extension [Self <: `1087`](x: Self) {
    
    inline def setParameters(
      value: RequestParameters & (Omit[UsersListFollowedByAuthenticatedEndpoint, baseUrl | headers | mediaType])
    ): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponse(value: OctokitResponse[UsersListFollowedByAuthenticatedResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
