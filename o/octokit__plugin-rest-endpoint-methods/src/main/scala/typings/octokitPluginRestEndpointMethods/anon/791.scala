package typings.octokitPluginRestEndpointMethods.anon

import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typings.octokitTypes.endpointsMod.OrgsCreateWebhookEndpoint
import typings.octokitTypes.endpointsMod.OrgsCreateWebhookResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import typings.octokitTypes.requestParametersMod.RequestParameters
import typings.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `791` extends StObject {
  
  var parameters: RequestParameters with (Omit[OrgsCreateWebhookEndpoint, baseUrl | headers | mediaType]) = js.native
  
  var response: OctokitResponse[OrgsCreateWebhookResponseData] = js.native
}
object `791` {
  
  @scala.inline
  def apply(
    parameters: RequestParameters with (Omit[OrgsCreateWebhookEndpoint, baseUrl | headers | mediaType]),
    response: OctokitResponse[OrgsCreateWebhookResponseData]
  ): `791` = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[`791`]
  }
  
  @scala.inline
  implicit class `791MutableBuilder`[Self <: `791`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: RequestParameters with (Omit[OrgsCreateWebhookEndpoint, baseUrl | headers | mediaType])): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[OrgsCreateWebhookResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
