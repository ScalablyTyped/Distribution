package typings.octokitPluginRestEndpointMethods.anon

import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typings.octokitTypes.endpointsMod.ReposListForksEndpoint
import typings.octokitTypes.endpointsMod.ReposListForksResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import typings.octokitTypes.requestParametersMod.RequestParameters
import typings.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `991` extends StObject {
  
  var parameters: RequestParameters & (Omit[ReposListForksEndpoint, baseUrl | headers | mediaType])
  
  var response: OctokitResponse[ReposListForksResponseData]
}
object `991` {
  
  inline def apply(
    parameters: RequestParameters & (Omit[ReposListForksEndpoint, baseUrl | headers | mediaType]),
    response: OctokitResponse[ReposListForksResponseData]
  ): `991` = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[`991`]
  }
  
  extension [Self <: `991`](x: Self) {
    
    inline def setParameters(value: RequestParameters & (Omit[ReposListForksEndpoint, baseUrl | headers | mediaType])): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponse(value: OctokitResponse[ReposListForksResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
