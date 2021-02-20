package typings.octokitPluginRestEndpointMethods.anon

import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typings.octokitTypes.endpointsMod.PullsDeletePendingReviewEndpoint
import typings.octokitTypes.endpointsMod.PullsDeletePendingReviewResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import typings.octokitTypes.requestParametersMod.RequestParameters
import typings.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `850` extends StObject {
  
  var parameters: RequestParameters with (Omit[PullsDeletePendingReviewEndpoint, baseUrl | headers | mediaType]) = js.native
  
  var response: OctokitResponse[PullsDeletePendingReviewResponseData] = js.native
}
object `850` {
  
  @scala.inline
  def apply(
    parameters: RequestParameters with (Omit[PullsDeletePendingReviewEndpoint, baseUrl | headers | mediaType]),
    response: OctokitResponse[PullsDeletePendingReviewResponseData]
  ): `850` = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[`850`]
  }
  
  @scala.inline
  implicit class `850MutableBuilder`[Self <: `850`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(
      value: RequestParameters with (Omit[PullsDeletePendingReviewEndpoint, baseUrl | headers | mediaType])
    ): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[PullsDeletePendingReviewResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
