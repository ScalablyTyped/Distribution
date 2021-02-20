package typings.octokitPluginRestEndpointMethods.anon

import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typings.octokitTypes.endpointsMod.PullsGetEndpoint
import typings.octokitTypes.endpointsMod.PullsGetResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import typings.octokitTypes.requestParametersMod.RequestParameters
import typings.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `853` extends StObject {
  
  var parameters: RequestParameters with (Omit[PullsGetEndpoint, baseUrl | headers | mediaType]) = js.native
  
  var response: OctokitResponse[PullsGetResponseData] = js.native
}
object `853` {
  
  @scala.inline
  def apply(
    parameters: RequestParameters with (Omit[PullsGetEndpoint, baseUrl | headers | mediaType]),
    response: OctokitResponse[PullsGetResponseData]
  ): `853` = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[`853`]
  }
  
  @scala.inline
  implicit class `853MutableBuilder`[Self <: `853`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: RequestParameters with (Omit[PullsGetEndpoint, baseUrl | headers | mediaType])): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[PullsGetResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
