package typings.octokitPluginRestEndpointMethods.anon

import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typings.octokitTypes.endpointsMod.SearchUsersEndpoint
import typings.octokitTypes.endpointsMod.SearchUsersResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import typings.octokitTypes.requestParametersMod.RequestParameters
import typings.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `1037` extends StObject {
  
  var parameters: RequestParameters & (Omit[SearchUsersEndpoint, baseUrl | headers | mediaType])
  
  var response: OctokitResponse[SearchUsersResponseData]
}
object `1037` {
  
  inline def apply(
    parameters: RequestParameters & (Omit[SearchUsersEndpoint, baseUrl | headers | mediaType]),
    response: OctokitResponse[SearchUsersResponseData]
  ): `1037` = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[`1037`]
  }
  
  extension [Self <: `1037`](x: Self) {
    
    inline def setParameters(value: RequestParameters & (Omit[SearchUsersEndpoint, baseUrl | headers | mediaType])): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponse(value: OctokitResponse[SearchUsersResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
