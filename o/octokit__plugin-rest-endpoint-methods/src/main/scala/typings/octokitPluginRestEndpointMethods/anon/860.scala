package typings.octokitPluginRestEndpointMethods.anon

import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typings.octokitTypes.endpointsMod.PullsListRequestedReviewersEndpoint
import typings.octokitTypes.endpointsMod.PullsListRequestedReviewersResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import typings.octokitTypes.requestParametersMod.RequestParameters
import typings.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `860` extends StObject {
  
  var parameters: RequestParameters & (Omit[PullsListRequestedReviewersEndpoint, baseUrl | headers | mediaType])
  
  var response: OctokitResponse[PullsListRequestedReviewersResponseData]
}
object `860` {
  
  @scala.inline
  def apply(
    parameters: RequestParameters & (Omit[PullsListRequestedReviewersEndpoint, baseUrl | headers | mediaType]),
    response: OctokitResponse[PullsListRequestedReviewersResponseData]
  ): `860` = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[`860`]
  }
  
  @scala.inline
  implicit class `860MutableBuilder`[Self <: `860`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(
      value: RequestParameters & (Omit[PullsListRequestedReviewersEndpoint, baseUrl | headers | mediaType])
    ): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[PullsListRequestedReviewersResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
