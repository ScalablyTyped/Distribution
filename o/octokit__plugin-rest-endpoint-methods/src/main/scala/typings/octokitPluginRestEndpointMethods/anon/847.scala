package typings.octokitPluginRestEndpointMethods.anon

import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typings.octokitTypes.endpointsMod.PullsCreateReplyForReviewCommentEndpoint
import typings.octokitTypes.endpointsMod.PullsCreateReplyForReviewCommentResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import typings.octokitTypes.requestParametersMod.RequestParameters
import typings.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `847` extends StObject {
  
  var parameters: RequestParameters & (Omit[PullsCreateReplyForReviewCommentEndpoint, baseUrl | headers | mediaType])
  
  var response: OctokitResponse[PullsCreateReplyForReviewCommentResponseData]
}
object `847` {
  
  inline def apply(
    parameters: RequestParameters & (Omit[PullsCreateReplyForReviewCommentEndpoint, baseUrl | headers | mediaType]),
    response: OctokitResponse[PullsCreateReplyForReviewCommentResponseData]
  ): `847` = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[`847`]
  }
  
  extension [Self <: `847`](x: Self) {
    
    inline def setParameters(
      value: RequestParameters & (Omit[PullsCreateReplyForReviewCommentEndpoint, baseUrl | headers | mediaType])
    ): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponse(value: OctokitResponse[PullsCreateReplyForReviewCommentResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
