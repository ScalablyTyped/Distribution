package typings.octokitPluginRestEndpointMethods.anon

import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typings.octokitTypes.endpointsMod.PullsListCommentsForReviewEndpoint
import typings.octokitTypes.endpointsMod.PullsListCommentsForReviewResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import typings.octokitTypes.requestParametersMod.RequestParameters
import typings.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `857` extends StObject {
  
  var parameters: RequestParameters & (Omit[PullsListCommentsForReviewEndpoint, baseUrl | headers | mediaType])
  
  var response: OctokitResponse[PullsListCommentsForReviewResponseData]
}
object `857` {
  
  inline def apply(
    parameters: RequestParameters & (Omit[PullsListCommentsForReviewEndpoint, baseUrl | headers | mediaType]),
    response: OctokitResponse[PullsListCommentsForReviewResponseData]
  ): `857` = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[`857`]
  }
  
  extension [Self <: `857`](x: Self) {
    
    inline def setParameters(
      value: RequestParameters & (Omit[PullsListCommentsForReviewEndpoint, baseUrl | headers | mediaType])
    ): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponse(value: OctokitResponse[PullsListCommentsForReviewResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
