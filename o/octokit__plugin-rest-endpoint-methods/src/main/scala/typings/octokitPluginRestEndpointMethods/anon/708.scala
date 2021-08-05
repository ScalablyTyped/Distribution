package typings.octokitPluginRestEndpointMethods.anon

import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typings.octokitTypes.endpointsMod.GitListMatchingRefsEndpoint
import typings.octokitTypes.endpointsMod.GitListMatchingRefsResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import typings.octokitTypes.requestParametersMod.RequestParameters
import typings.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `708` extends StObject {
  
  var parameters: RequestParameters & (Omit[GitListMatchingRefsEndpoint, baseUrl | headers | mediaType])
  
  var response: OctokitResponse[GitListMatchingRefsResponseData]
}
object `708` {
  
  inline def apply(
    parameters: RequestParameters & (Omit[GitListMatchingRefsEndpoint, baseUrl | headers | mediaType]),
    response: OctokitResponse[GitListMatchingRefsResponseData]
  ): `708` = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[`708`]
  }
  
  extension [Self <: `708`](x: Self) {
    
    inline def setParameters(value: RequestParameters & (Omit[GitListMatchingRefsEndpoint, baseUrl | headers | mediaType])): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponse(value: OctokitResponse[GitListMatchingRefsResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
