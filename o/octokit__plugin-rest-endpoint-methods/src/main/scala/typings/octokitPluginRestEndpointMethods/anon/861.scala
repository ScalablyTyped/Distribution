package typings.octokitPluginRestEndpointMethods.anon

import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typings.octokitTypes.endpointsMod.PullsListReviewCommentsEndpoint
import typings.octokitTypes.endpointsMod.PullsListReviewCommentsResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import typings.octokitTypes.requestParametersMod.RequestParameters
import typings.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `861` extends StObject {
  
  var parameters: RequestParameters & (Omit[PullsListReviewCommentsEndpoint, baseUrl | headers | mediaType])
  
  var response: OctokitResponse[PullsListReviewCommentsResponseData]
}
object `861` {
  
  inline def apply(
    parameters: RequestParameters & (Omit[PullsListReviewCommentsEndpoint, baseUrl | headers | mediaType]),
    response: OctokitResponse[PullsListReviewCommentsResponseData]
  ): `861` = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[`861`]
  }
  
  extension [Self <: `861`](x: Self) {
    
    inline def setParameters(value: RequestParameters & (Omit[PullsListReviewCommentsEndpoint, baseUrl | headers | mediaType])): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponse(value: OctokitResponse[PullsListReviewCommentsResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
