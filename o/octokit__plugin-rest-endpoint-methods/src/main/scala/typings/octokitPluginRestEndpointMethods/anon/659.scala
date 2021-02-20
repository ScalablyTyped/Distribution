package typings.octokitPluginRestEndpointMethods.anon

import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typings.octokitTypes.endpointsMod.ChecksGetEndpoint
import typings.octokitTypes.endpointsMod.ChecksGetResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import typings.octokitTypes.requestParametersMod.RequestParameters
import typings.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `659` extends StObject {
  
  var parameters: RequestParameters with (Omit[ChecksGetEndpoint, baseUrl | headers | mediaType]) = js.native
  
  var response: OctokitResponse[ChecksGetResponseData] = js.native
}
object `659` {
  
  @scala.inline
  def apply(
    parameters: RequestParameters with (Omit[ChecksGetEndpoint, baseUrl | headers | mediaType]),
    response: OctokitResponse[ChecksGetResponseData]
  ): `659` = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[`659`]
  }
  
  @scala.inline
  implicit class `659MutableBuilder`[Self <: `659`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: RequestParameters with (Omit[ChecksGetEndpoint, baseUrl | headers | mediaType])): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[ChecksGetResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
