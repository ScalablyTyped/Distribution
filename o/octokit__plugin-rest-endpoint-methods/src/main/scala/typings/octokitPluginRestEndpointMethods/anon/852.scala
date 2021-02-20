package typings.octokitPluginRestEndpointMethods.anon

import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typings.octokitTypes.endpointsMod.PullsDismissReviewEndpoint
import typings.octokitTypes.endpointsMod.PullsDismissReviewResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import typings.octokitTypes.requestParametersMod.RequestParameters
import typings.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `852` extends StObject {
  
  var parameters: RequestParameters with (Omit[PullsDismissReviewEndpoint, baseUrl | headers | mediaType]) = js.native
  
  var response: OctokitResponse[PullsDismissReviewResponseData] = js.native
}
object `852` {
  
  @scala.inline
  def apply(
    parameters: RequestParameters with (Omit[PullsDismissReviewEndpoint, baseUrl | headers | mediaType]),
    response: OctokitResponse[PullsDismissReviewResponseData]
  ): `852` = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[`852`]
  }
  
  @scala.inline
  implicit class `852MutableBuilder`[Self <: `852`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: RequestParameters with (Omit[PullsDismissReviewEndpoint, baseUrl | headers | mediaType])): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[PullsDismissReviewResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
