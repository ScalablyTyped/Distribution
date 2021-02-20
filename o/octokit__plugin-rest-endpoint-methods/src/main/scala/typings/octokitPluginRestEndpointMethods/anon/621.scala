package typings.octokitPluginRestEndpointMethods.anon

import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typings.octokitTypes.endpointsMod.AppsCheckTokenEndpoint
import typings.octokitTypes.endpointsMod.AppsCheckTokenResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import typings.octokitTypes.requestParametersMod.RequestParameters
import typings.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `621` extends StObject {
  
  var parameters: RequestParameters with (Omit[AppsCheckTokenEndpoint, baseUrl | headers | mediaType]) = js.native
  
  var response: OctokitResponse[AppsCheckTokenResponseData] = js.native
}
object `621` {
  
  @scala.inline
  def apply(
    parameters: RequestParameters with (Omit[AppsCheckTokenEndpoint, baseUrl | headers | mediaType]),
    response: OctokitResponse[AppsCheckTokenResponseData]
  ): `621` = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[`621`]
  }
  
  @scala.inline
  implicit class `621MutableBuilder`[Self <: `621`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: RequestParameters with (Omit[AppsCheckTokenEndpoint, baseUrl | headers | mediaType])): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[AppsCheckTokenResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
