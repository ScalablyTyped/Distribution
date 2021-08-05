package typings.octokitPluginRestEndpointMethods.anon

import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typings.octokitTypes.endpointsMod.GistsUpdateCommentEndpoint
import typings.octokitTypes.endpointsMod.GistsUpdateCommentResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import typings.octokitTypes.requestParametersMod.RequestParameters
import typings.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `696` extends StObject {
  
  var parameters: RequestParameters & (Omit[GistsUpdateCommentEndpoint, baseUrl | headers | mediaType])
  
  var response: OctokitResponse[GistsUpdateCommentResponseData]
}
object `696` {
  
  inline def apply(
    parameters: RequestParameters & (Omit[GistsUpdateCommentEndpoint, baseUrl | headers | mediaType]),
    response: OctokitResponse[GistsUpdateCommentResponseData]
  ): `696` = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[`696`]
  }
  
  extension [Self <: `696`](x: Self) {
    
    inline def setParameters(value: RequestParameters & (Omit[GistsUpdateCommentEndpoint, baseUrl | headers | mediaType])): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponse(value: OctokitResponse[GistsUpdateCommentResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
