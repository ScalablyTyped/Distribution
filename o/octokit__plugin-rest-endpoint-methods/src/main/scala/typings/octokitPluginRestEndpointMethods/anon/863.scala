package typings.octokitPluginRestEndpointMethods.anon

import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typings.octokitTypes.endpointsMod.PullsListReviewsEndpoint
import typings.octokitTypes.endpointsMod.PullsListReviewsResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import typings.octokitTypes.requestParametersMod.RequestParameters
import typings.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `863` extends StObject {
  
  var parameters: RequestParameters & (Omit[PullsListReviewsEndpoint, baseUrl | headers | mediaType])
  
  var response: OctokitResponse[PullsListReviewsResponseData]
}
object `863` {
  
  inline def apply(
    parameters: RequestParameters & (Omit[PullsListReviewsEndpoint, baseUrl | headers | mediaType]),
    response: OctokitResponse[PullsListReviewsResponseData]
  ): `863` = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[`863`]
  }
  
  extension [Self <: `863`](x: Self) {
    
    inline def setParameters(value: RequestParameters & (Omit[PullsListReviewsEndpoint, baseUrl | headers | mediaType])): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponse(value: OctokitResponse[PullsListReviewsResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
