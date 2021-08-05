package typings.octokitPluginRestEndpointMethods.anon

import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typings.octokitTypes.endpointsMod.GistsGetRevisionEndpoint
import typings.octokitTypes.endpointsMod.GistsGetRevisionResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import typings.octokitTypes.requestParametersMod.RequestParameters
import typings.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `685` extends StObject {
  
  var parameters: RequestParameters & (Omit[GistsGetRevisionEndpoint, baseUrl | headers | mediaType])
  
  var response: OctokitResponse[GistsGetRevisionResponseData]
}
object `685` {
  
  inline def apply(
    parameters: RequestParameters & (Omit[GistsGetRevisionEndpoint, baseUrl | headers | mediaType]),
    response: OctokitResponse[GistsGetRevisionResponseData]
  ): `685` = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[`685`]
  }
  
  extension [Self <: `685`](x: Self) {
    
    inline def setParameters(value: RequestParameters & (Omit[GistsGetRevisionEndpoint, baseUrl | headers | mediaType])): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponse(value: OctokitResponse[GistsGetRevisionResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
