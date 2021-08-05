package typings.octokitPluginRestEndpointMethods.anon

import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typings.octokitTypes.endpointsMod.ActivityGetThreadEndpoint
import typings.octokitTypes.endpointsMod.ActivityGetThreadResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import typings.octokitTypes.requestParametersMod.RequestParameters
import typings.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `594` extends StObject {
  
  var parameters: RequestParameters & (Omit[ActivityGetThreadEndpoint, baseUrl | headers | mediaType])
  
  var response: OctokitResponse[ActivityGetThreadResponseData]
}
object `594` {
  
  inline def apply(
    parameters: RequestParameters & (Omit[ActivityGetThreadEndpoint, baseUrl | headers | mediaType]),
    response: OctokitResponse[ActivityGetThreadResponseData]
  ): `594` = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[`594`]
  }
  
  extension [Self <: `594`](x: Self) {
    
    inline def setParameters(value: RequestParameters & (Omit[ActivityGetThreadEndpoint, baseUrl | headers | mediaType])): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponse(value: OctokitResponse[ActivityGetThreadResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
