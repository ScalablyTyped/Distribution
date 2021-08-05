package typings.octokitPluginRestEndpointMethods.anon

import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typings.octokitTypes.endpointsMod.ReposCreatePagesSiteEndpoint
import typings.octokitTypes.endpointsMod.ReposCreatePagesSiteResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import typings.octokitTypes.requestParametersMod.RequestParameters
import typings.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `912` extends StObject {
  
  var parameters: RequestParameters & (Omit[ReposCreatePagesSiteEndpoint, baseUrl | headers | mediaType])
  
  var response: OctokitResponse[ReposCreatePagesSiteResponseData]
}
object `912` {
  
  inline def apply(
    parameters: RequestParameters & (Omit[ReposCreatePagesSiteEndpoint, baseUrl | headers | mediaType]),
    response: OctokitResponse[ReposCreatePagesSiteResponseData]
  ): `912` = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[`912`]
  }
  
  extension [Self <: `912`](x: Self) {
    
    inline def setParameters(value: RequestParameters & (Omit[ReposCreatePagesSiteEndpoint, baseUrl | headers | mediaType])): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponse(value: OctokitResponse[ReposCreatePagesSiteResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
