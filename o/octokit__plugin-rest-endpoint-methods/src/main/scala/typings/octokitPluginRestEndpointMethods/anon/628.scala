package typings.octokitPluginRestEndpointMethods.anon

import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typings.octokitTypes.endpointsMod.AppsGetAuthenticatedEndpoint
import typings.octokitTypes.endpointsMod.AppsGetAuthenticatedResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import typings.octokitTypes.requestParametersMod.RequestParameters
import typings.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `628` extends StObject {
  
  var parameters: RequestParameters & (Omit[AppsGetAuthenticatedEndpoint, baseUrl | headers | mediaType])
  
  var response: OctokitResponse[AppsGetAuthenticatedResponseData]
}
object `628` {
  
  inline def apply(
    parameters: RequestParameters & (Omit[AppsGetAuthenticatedEndpoint, baseUrl | headers | mediaType]),
    response: OctokitResponse[AppsGetAuthenticatedResponseData]
  ): `628` = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[`628`]
  }
  
  extension [Self <: `628`](x: Self) {
    
    inline def setParameters(value: RequestParameters & (Omit[AppsGetAuthenticatedEndpoint, baseUrl | headers | mediaType])): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponse(value: OctokitResponse[AppsGetAuthenticatedResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
