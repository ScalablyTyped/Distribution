package typings.octokitPluginRestEndpointMethods.anon

import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typings.octokitTypes.endpointsMod.ReposListReleaseAssetsEndpoint
import typings.octokitTypes.endpointsMod.ReposListReleaseAssetsResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import typings.octokitTypes.requestParametersMod.RequestParameters
import typings.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `998` extends StObject {
  
  var parameters: RequestParameters & (Omit[ReposListReleaseAssetsEndpoint, baseUrl | headers | mediaType])
  
  var response: OctokitResponse[ReposListReleaseAssetsResponseData]
}
object `998` {
  
  inline def apply(
    parameters: RequestParameters & (Omit[ReposListReleaseAssetsEndpoint, baseUrl | headers | mediaType]),
    response: OctokitResponse[ReposListReleaseAssetsResponseData]
  ): `998` = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[`998`]
  }
  
  extension [Self <: `998`](x: Self) {
    
    inline def setParameters(value: RequestParameters & (Omit[ReposListReleaseAssetsEndpoint, baseUrl | headers | mediaType])): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponse(value: OctokitResponse[ReposListReleaseAssetsResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
