package typings.octokitPluginRestEndpointMethods.anon

import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typings.octokitTypes.endpointsMod.GitUpdateRefEndpoint
import typings.octokitTypes.endpointsMod.GitUpdateRefResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import typings.octokitTypes.requestParametersMod.RequestParameters
import typings.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `709` extends StObject {
  
  var parameters: RequestParameters & (Omit[GitUpdateRefEndpoint, baseUrl | headers | mediaType])
  
  var response: OctokitResponse[GitUpdateRefResponseData]
}
object `709` {
  
  inline def apply(
    parameters: RequestParameters & (Omit[GitUpdateRefEndpoint, baseUrl | headers | mediaType]),
    response: OctokitResponse[GitUpdateRefResponseData]
  ): `709` = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[`709`]
  }
  
  extension [Self <: `709`](x: Self) {
    
    inline def setParameters(value: RequestParameters & (Omit[GitUpdateRefEndpoint, baseUrl | headers | mediaType])): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponse(value: OctokitResponse[GitUpdateRefResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
