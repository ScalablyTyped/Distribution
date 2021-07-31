package typings.octokitPluginRestEndpointMethods.anon

import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typings.octokitTypes.endpointsMod.ReposUpdateWebhookEndpoint
import typings.octokitTypes.endpointsMod.ReposUpdateWebhookResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import typings.octokitTypes.requestParametersMod.RequestParameters
import typings.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `1029` extends StObject {
  
  var parameters: RequestParameters & (Omit[ReposUpdateWebhookEndpoint, baseUrl | headers | mediaType])
  
  var response: OctokitResponse[ReposUpdateWebhookResponseData]
}
object `1029` {
  
  @scala.inline
  def apply(
    parameters: RequestParameters & (Omit[ReposUpdateWebhookEndpoint, baseUrl | headers | mediaType]),
    response: OctokitResponse[ReposUpdateWebhookResponseData]
  ): `1029` = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[`1029`]
  }
  
  @scala.inline
  implicit class `1029MutableBuilder`[Self <: `1029`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: RequestParameters & (Omit[ReposUpdateWebhookEndpoint, baseUrl | headers | mediaType])): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[ReposUpdateWebhookResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
