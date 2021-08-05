package typings.octokitPluginRestEndpointMethods.anon

import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typings.octokitTypes.endpointsMod.ReposListContributorsEndpoint
import typings.octokitTypes.endpointsMod.ReposListContributorsResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import typings.octokitTypes.requestParametersMod.RequestParameters
import typings.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `984` extends StObject {
  
  var parameters: RequestParameters & (Omit[ReposListContributorsEndpoint, baseUrl | headers | mediaType])
  
  var response: OctokitResponse[ReposListContributorsResponseData]
}
object `984` {
  
  inline def apply(
    parameters: RequestParameters & (Omit[ReposListContributorsEndpoint, baseUrl | headers | mediaType]),
    response: OctokitResponse[ReposListContributorsResponseData]
  ): `984` = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[`984`]
  }
  
  extension [Self <: `984`](x: Self) {
    
    inline def setParameters(value: RequestParameters & (Omit[ReposListContributorsEndpoint, baseUrl | headers | mediaType])): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponse(value: OctokitResponse[ReposListContributorsResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
