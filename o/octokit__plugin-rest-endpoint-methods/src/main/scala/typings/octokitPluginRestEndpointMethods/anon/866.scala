package typings.octokitPluginRestEndpointMethods.anon

import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typings.octokitTypes.endpointsMod.PullsRequestReviewersEndpoint
import typings.octokitTypes.endpointsMod.PullsRequestReviewersResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import typings.octokitTypes.requestParametersMod.RequestParameters
import typings.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `866` extends StObject {
  
  var parameters: RequestParameters & (Omit[PullsRequestReviewersEndpoint, baseUrl | headers | mediaType])
  
  var response: OctokitResponse[PullsRequestReviewersResponseData]
}
object `866` {
  
  inline def apply(
    parameters: RequestParameters & (Omit[PullsRequestReviewersEndpoint, baseUrl | headers | mediaType]),
    response: OctokitResponse[PullsRequestReviewersResponseData]
  ): `866` = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[`866`]
  }
  
  extension [Self <: `866`](x: Self) {
    
    inline def setParameters(value: RequestParameters & (Omit[PullsRequestReviewersEndpoint, baseUrl | headers | mediaType])): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponse(value: OctokitResponse[PullsRequestReviewersResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
