package typings.octokitPluginRestEndpointMethods.anon

import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typings.octokitTypes.endpointsMod.GitGetTreeEndpoint
import typings.octokitTypes.endpointsMod.GitGetTreeResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import typings.octokitTypes.requestParametersMod.RequestParameters
import typings.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `707` extends StObject {
  
  var parameters: RequestParameters & (Omit[GitGetTreeEndpoint, baseUrl | headers | mediaType])
  
  var response: OctokitResponse[GitGetTreeResponseData]
}
object `707` {
  
  inline def apply(
    parameters: RequestParameters & (Omit[GitGetTreeEndpoint, baseUrl | headers | mediaType]),
    response: OctokitResponse[GitGetTreeResponseData]
  ): `707` = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[`707`]
  }
  
  extension [Self <: `707`](x: Self) {
    
    inline def setParameters(value: RequestParameters & (Omit[GitGetTreeEndpoint, baseUrl | headers | mediaType])): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponse(value: OctokitResponse[GitGetTreeResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
