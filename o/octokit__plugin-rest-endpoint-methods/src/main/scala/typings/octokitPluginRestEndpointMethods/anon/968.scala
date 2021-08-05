package typings.octokitPluginRestEndpointMethods.anon

import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typings.octokitTypes.endpointsMod.ReposGetReleaseAssetEndpoint
import typings.octokitTypes.endpointsMod.ReposGetReleaseAssetResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import typings.octokitTypes.requestParametersMod.RequestParameters
import typings.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `968` extends StObject {
  
  var parameters: RequestParameters & (Omit[ReposGetReleaseAssetEndpoint, baseUrl | headers | mediaType])
  
  var response: OctokitResponse[ReposGetReleaseAssetResponseData]
}
object `968` {
  
  inline def apply(
    parameters: RequestParameters & (Omit[ReposGetReleaseAssetEndpoint, baseUrl | headers | mediaType]),
    response: OctokitResponse[ReposGetReleaseAssetResponseData]
  ): `968` = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[`968`]
  }
  
  extension [Self <: `968`](x: Self) {
    
    inline def setParameters(value: RequestParameters & (Omit[ReposGetReleaseAssetEndpoint, baseUrl | headers | mediaType])): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponse(value: OctokitResponse[ReposGetReleaseAssetResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
