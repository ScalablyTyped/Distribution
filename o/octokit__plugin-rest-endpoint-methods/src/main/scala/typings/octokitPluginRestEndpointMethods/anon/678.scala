package typings.octokitPluginRestEndpointMethods.anon

import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typings.octokitTypes.endpointsMod.GistsCreateEndpoint
import typings.octokitTypes.endpointsMod.GistsCreateResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import typings.octokitTypes.requestParametersMod.RequestParameters
import typings.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `678` extends StObject {
  
  var parameters: RequestParameters & (Omit[GistsCreateEndpoint, baseUrl | headers | mediaType])
  
  var response: OctokitResponse[GistsCreateResponseData]
}
object `678` {
  
  inline def apply(
    parameters: RequestParameters & (Omit[GistsCreateEndpoint, baseUrl | headers | mediaType]),
    response: OctokitResponse[GistsCreateResponseData]
  ): `678` = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[`678`]
  }
  
  extension [Self <: `678`](x: Self) {
    
    inline def setParameters(value: RequestParameters & (Omit[GistsCreateEndpoint, baseUrl | headers | mediaType])): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponse(value: OctokitResponse[GistsCreateResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
