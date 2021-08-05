package typings.octokitPluginRestEndpointMethods.anon

import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typings.octokitTypes.endpointsMod.UsersUpdateAuthenticatedEndpoint
import typings.octokitTypes.endpointsMod.UsersUpdateAuthenticatedResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import typings.octokitTypes.requestParametersMod.RequestParameters
import typings.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `1099` extends StObject {
  
  var parameters: RequestParameters & (Omit[UsersUpdateAuthenticatedEndpoint, baseUrl | headers | mediaType])
  
  var response: OctokitResponse[UsersUpdateAuthenticatedResponseData]
}
object `1099` {
  
  inline def apply(
    parameters: RequestParameters & (Omit[UsersUpdateAuthenticatedEndpoint, baseUrl | headers | mediaType]),
    response: OctokitResponse[UsersUpdateAuthenticatedResponseData]
  ): `1099` = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[`1099`]
  }
  
  extension [Self <: `1099`](x: Self) {
    
    inline def setParameters(value: RequestParameters & (Omit[UsersUpdateAuthenticatedEndpoint, baseUrl | headers | mediaType])): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponse(value: OctokitResponse[UsersUpdateAuthenticatedResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
