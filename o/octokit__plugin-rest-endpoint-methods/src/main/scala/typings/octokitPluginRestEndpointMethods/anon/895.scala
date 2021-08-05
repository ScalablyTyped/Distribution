package typings.octokitPluginRestEndpointMethods.anon

import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typings.octokitTypes.endpointsMod.ReposAddStatusCheckContextsEndpoint
import typings.octokitTypes.endpointsMod.ReposAddStatusCheckContextsResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import typings.octokitTypes.requestParametersMod.RequestParameters
import typings.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `895` extends StObject {
  
  var parameters: RequestParameters & (Omit[ReposAddStatusCheckContextsEndpoint, baseUrl | headers | mediaType])
  
  var response: OctokitResponse[ReposAddStatusCheckContextsResponseData]
}
object `895` {
  
  inline def apply(
    parameters: RequestParameters & (Omit[ReposAddStatusCheckContextsEndpoint, baseUrl | headers | mediaType]),
    response: OctokitResponse[ReposAddStatusCheckContextsResponseData]
  ): `895` = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[`895`]
  }
  
  extension [Self <: `895`](x: Self) {
    
    inline def setParameters(
      value: RequestParameters & (Omit[ReposAddStatusCheckContextsEndpoint, baseUrl | headers | mediaType])
    ): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponse(value: OctokitResponse[ReposAddStatusCheckContextsResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
