package typings.octokitPluginRestEndpointMethods.anon

import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typings.octokitTypes.endpointsMod.GitGetTagEndpoint
import typings.octokitTypes.endpointsMod.GitGetTagResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import typings.octokitTypes.requestParametersMod.RequestParameters
import typings.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `706` extends StObject {
  
  var parameters: RequestParameters & (Omit[GitGetTagEndpoint, baseUrl | headers | mediaType])
  
  var response: OctokitResponse[GitGetTagResponseData]
}
object `706` {
  
  inline def apply(
    parameters: RequestParameters & (Omit[GitGetTagEndpoint, baseUrl | headers | mediaType]),
    response: OctokitResponse[GitGetTagResponseData]
  ): `706` = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[`706`]
  }
  
  extension [Self <: `706`](x: Self) {
    
    inline def setParameters(value: RequestParameters & (Omit[GitGetTagEndpoint, baseUrl | headers | mediaType])): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponse(value: OctokitResponse[GitGetTagResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
