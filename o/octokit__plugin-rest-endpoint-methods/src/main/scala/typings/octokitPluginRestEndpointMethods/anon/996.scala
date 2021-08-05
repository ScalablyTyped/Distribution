package typings.octokitPluginRestEndpointMethods.anon

import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typings.octokitTypes.endpointsMod.ReposListPublicEndpoint
import typings.octokitTypes.endpointsMod.ReposListPublicResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import typings.octokitTypes.requestParametersMod.RequestParameters
import typings.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `996` extends StObject {
  
  var parameters: RequestParameters & (Omit[ReposListPublicEndpoint, baseUrl | headers | mediaType])
  
  var response: OctokitResponse[ReposListPublicResponseData]
}
object `996` {
  
  inline def apply(
    parameters: RequestParameters & (Omit[ReposListPublicEndpoint, baseUrl | headers | mediaType]),
    response: OctokitResponse[ReposListPublicResponseData]
  ): `996` = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[`996`]
  }
  
  extension [Self <: `996`](x: Self) {
    
    inline def setParameters(value: RequestParameters & (Omit[ReposListPublicEndpoint, baseUrl | headers | mediaType])): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponse(value: OctokitResponse[ReposListPublicResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
