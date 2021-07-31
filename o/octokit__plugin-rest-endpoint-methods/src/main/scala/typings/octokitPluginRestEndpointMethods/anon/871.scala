package typings.octokitPluginRestEndpointMethods.anon

import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typings.octokitTypes.endpointsMod.PullsUpdateReviewCommentEndpoint
import typings.octokitTypes.endpointsMod.PullsUpdateReviewCommentResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import typings.octokitTypes.requestParametersMod.RequestParameters
import typings.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `871` extends StObject {
  
  var parameters: RequestParameters & (Omit[PullsUpdateReviewCommentEndpoint, baseUrl | headers | mediaType])
  
  var response: OctokitResponse[PullsUpdateReviewCommentResponseData]
}
object `871` {
  
  @scala.inline
  def apply(
    parameters: RequestParameters & (Omit[PullsUpdateReviewCommentEndpoint, baseUrl | headers | mediaType]),
    response: OctokitResponse[PullsUpdateReviewCommentResponseData]
  ): `871` = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[`871`]
  }
  
  @scala.inline
  implicit class `871MutableBuilder`[Self <: `871`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: RequestParameters & (Omit[PullsUpdateReviewCommentEndpoint, baseUrl | headers | mediaType])): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[PullsUpdateReviewCommentResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
