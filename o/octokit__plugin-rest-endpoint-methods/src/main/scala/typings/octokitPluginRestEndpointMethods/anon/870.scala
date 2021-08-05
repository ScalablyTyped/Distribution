package typings.octokitPluginRestEndpointMethods.anon

import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typings.octokitTypes.endpointsMod.PullsUpdateReviewEndpoint
import typings.octokitTypes.endpointsMod.PullsUpdateReviewResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import typings.octokitTypes.requestParametersMod.RequestParameters
import typings.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `870` extends StObject {
  
  var parameters: RequestParameters & (Omit[PullsUpdateReviewEndpoint, baseUrl | headers | mediaType])
  
  var response: OctokitResponse[PullsUpdateReviewResponseData]
}
object `870` {
  
  inline def apply(
    parameters: RequestParameters & (Omit[PullsUpdateReviewEndpoint, baseUrl | headers | mediaType]),
    response: OctokitResponse[PullsUpdateReviewResponseData]
  ): `870` = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[`870`]
  }
  
  extension [Self <: `870`](x: Self) {
    
    inline def setParameters(value: RequestParameters & (Omit[PullsUpdateReviewEndpoint, baseUrl | headers | mediaType])): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponse(value: OctokitResponse[PullsUpdateReviewResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
