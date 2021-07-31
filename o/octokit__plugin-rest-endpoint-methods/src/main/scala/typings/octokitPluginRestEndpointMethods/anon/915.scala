package typings.octokitPluginRestEndpointMethods.anon

import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typings.octokitTypes.endpointsMod.ReposCreateWebhookEndpoint
import typings.octokitTypes.endpointsMod.ReposCreateWebhookResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import typings.octokitTypes.requestParametersMod.RequestParameters
import typings.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `915` extends StObject {
  
  var parameters: RequestParameters & (Omit[ReposCreateWebhookEndpoint, baseUrl | headers | mediaType])
  
  var response: OctokitResponse[ReposCreateWebhookResponseData]
}
object `915` {
  
  @scala.inline
  def apply(
    parameters: RequestParameters & (Omit[ReposCreateWebhookEndpoint, baseUrl | headers | mediaType]),
    response: OctokitResponse[ReposCreateWebhookResponseData]
  ): `915` = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[`915`]
  }
  
  @scala.inline
  implicit class `915MutableBuilder`[Self <: `915`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: RequestParameters & (Omit[ReposCreateWebhookEndpoint, baseUrl | headers | mediaType])): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[ReposCreateWebhookResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
