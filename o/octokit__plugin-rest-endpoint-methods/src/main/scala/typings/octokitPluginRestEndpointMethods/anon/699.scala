package typings.octokitPluginRestEndpointMethods.anon

import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typings.octokitTypes.endpointsMod.GitCreateRefEndpoint
import typings.octokitTypes.endpointsMod.GitCreateRefResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import typings.octokitTypes.requestParametersMod.RequestParameters
import typings.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `699` extends StObject {
  
  var parameters: RequestParameters & (Omit[GitCreateRefEndpoint, baseUrl | headers | mediaType])
  
  var response: OctokitResponse[GitCreateRefResponseData]
}
object `699` {
  
  inline def apply(
    parameters: RequestParameters & (Omit[GitCreateRefEndpoint, baseUrl | headers | mediaType]),
    response: OctokitResponse[GitCreateRefResponseData]
  ): `699` = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[`699`]
  }
  
  extension [Self <: `699`](x: Self) {
    
    inline def setParameters(value: RequestParameters & (Omit[GitCreateRefEndpoint, baseUrl | headers | mediaType])): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponse(value: OctokitResponse[GitCreateRefResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
