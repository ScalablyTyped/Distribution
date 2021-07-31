package typings.octokitPluginRestEndpointMethods.anon

import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typings.octokitTypes.endpointsMod.ReactionsCreateForPullRequestReviewCommentEndpoint
import typings.octokitTypes.endpointsMod.ReactionsCreateForPullRequestReviewCommentResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import typings.octokitTypes.requestParametersMod.RequestParameters
import typings.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `876` extends StObject {
  
  var parameters: RequestParameters & (Omit[ReactionsCreateForPullRequestReviewCommentEndpoint, baseUrl | headers | mediaType])
  
  var response: OctokitResponse[ReactionsCreateForPullRequestReviewCommentResponseData]
}
object `876` {
  
  @scala.inline
  def apply(
    parameters: RequestParameters & (Omit[ReactionsCreateForPullRequestReviewCommentEndpoint, baseUrl | headers | mediaType]),
    response: OctokitResponse[ReactionsCreateForPullRequestReviewCommentResponseData]
  ): `876` = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[`876`]
  }
  
  @scala.inline
  implicit class `876MutableBuilder`[Self <: `876`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(
      value: RequestParameters & (Omit[ReactionsCreateForPullRequestReviewCommentEndpoint, baseUrl | headers | mediaType])
    ): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[ReactionsCreateForPullRequestReviewCommentResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
