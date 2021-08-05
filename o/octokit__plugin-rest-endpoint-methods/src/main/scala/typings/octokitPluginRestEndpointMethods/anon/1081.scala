package typings.octokitPluginRestEndpointMethods.anon

import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typings.octokitTypes.endpointsMod.UsersGetContextForUserEndpoint
import typings.octokitTypes.endpointsMod.UsersGetContextForUserResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import typings.octokitTypes.requestParametersMod.RequestParameters
import typings.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `1081` extends StObject {
  
  var parameters: RequestParameters & (Omit[UsersGetContextForUserEndpoint, baseUrl | headers | mediaType])
  
  var response: OctokitResponse[UsersGetContextForUserResponseData]
}
object `1081` {
  
  inline def apply(
    parameters: RequestParameters & (Omit[UsersGetContextForUserEndpoint, baseUrl | headers | mediaType]),
    response: OctokitResponse[UsersGetContextForUserResponseData]
  ): `1081` = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[`1081`]
  }
  
  extension [Self <: `1081`](x: Self) {
    
    inline def setParameters(value: RequestParameters & (Omit[UsersGetContextForUserEndpoint, baseUrl | headers | mediaType])): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponse(value: OctokitResponse[UsersGetContextForUserResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
