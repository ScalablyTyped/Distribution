package typings.octokitPluginRestEndpointMethods.anon

import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typings.octokitTypes.endpointsMod.GistsGetCommentEndpoint
import typings.octokitTypes.endpointsMod.GistsGetCommentResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import typings.octokitTypes.requestParametersMod.RequestParameters
import typings.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `684` extends StObject {
  
  var parameters: RequestParameters & (Omit[GistsGetCommentEndpoint, baseUrl | headers | mediaType])
  
  var response: OctokitResponse[GistsGetCommentResponseData]
}
object `684` {
  
  inline def apply(
    parameters: RequestParameters & (Omit[GistsGetCommentEndpoint, baseUrl | headers | mediaType]),
    response: OctokitResponse[GistsGetCommentResponseData]
  ): `684` = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[`684`]
  }
  
  extension [Self <: `684`](x: Self) {
    
    inline def setParameters(value: RequestParameters & (Omit[GistsGetCommentEndpoint, baseUrl | headers | mediaType])): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponse(value: OctokitResponse[GistsGetCommentResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
