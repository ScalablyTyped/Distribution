package typings.octokitPluginRestEndpointMethods.anon

import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typings.octokitTypes.endpointsMod.PullsCreateReviewCommentEndpoint
import typings.octokitTypes.endpointsMod.PullsCreateReviewCommentResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import typings.octokitTypes.requestParametersMod.RequestParameters
import typings.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `849` extends StObject {
  
  var parameters: RequestParameters & (Omit[PullsCreateReviewCommentEndpoint, baseUrl | headers | mediaType])
  
  var response: OctokitResponse[PullsCreateReviewCommentResponseData]
}
object `849` {
  
  inline def apply(
    parameters: RequestParameters & (Omit[PullsCreateReviewCommentEndpoint, baseUrl | headers | mediaType]),
    response: OctokitResponse[PullsCreateReviewCommentResponseData]
  ): `849` = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[`849`]
  }
  
  extension [Self <: `849`](x: Self) {
    
    inline def setParameters(value: RequestParameters & (Omit[PullsCreateReviewCommentEndpoint, baseUrl | headers | mediaType])): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponse(value: OctokitResponse[PullsCreateReviewCommentResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
