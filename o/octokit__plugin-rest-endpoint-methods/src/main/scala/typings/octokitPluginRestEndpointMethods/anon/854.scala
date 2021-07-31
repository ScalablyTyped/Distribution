package typings.octokitPluginRestEndpointMethods.anon

import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typings.octokitTypes.endpointsMod.PullsGetReviewEndpoint
import typings.octokitTypes.endpointsMod.PullsGetReviewResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import typings.octokitTypes.requestParametersMod.RequestParameters
import typings.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `854` extends StObject {
  
  var parameters: RequestParameters & (Omit[PullsGetReviewEndpoint, baseUrl | headers | mediaType])
  
  var response: OctokitResponse[PullsGetReviewResponseData]
}
object `854` {
  
  @scala.inline
  def apply(
    parameters: RequestParameters & (Omit[PullsGetReviewEndpoint, baseUrl | headers | mediaType]),
    response: OctokitResponse[PullsGetReviewResponseData]
  ): `854` = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[`854`]
  }
  
  @scala.inline
  implicit class `854MutableBuilder`[Self <: `854`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: RequestParameters & (Omit[PullsGetReviewEndpoint, baseUrl | headers | mediaType])): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[PullsGetReviewResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
