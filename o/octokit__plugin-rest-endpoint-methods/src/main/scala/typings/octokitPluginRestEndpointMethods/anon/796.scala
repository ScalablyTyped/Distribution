package typings.octokitPluginRestEndpointMethods.anon

import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typings.octokitTypes.endpointsMod.OrgsGetWebhookEndpoint
import typings.octokitTypes.endpointsMod.OrgsGetWebhookResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import typings.octokitTypes.requestParametersMod.RequestParameters
import typings.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `796` extends StObject {
  
  var parameters: RequestParameters & (Omit[OrgsGetWebhookEndpoint, baseUrl | headers | mediaType])
  
  var response: OctokitResponse[OrgsGetWebhookResponseData]
}
object `796` {
  
  @scala.inline
  def apply(
    parameters: RequestParameters & (Omit[OrgsGetWebhookEndpoint, baseUrl | headers | mediaType]),
    response: OctokitResponse[OrgsGetWebhookResponseData]
  ): `796` = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[`796`]
  }
  
  @scala.inline
  implicit class `796MutableBuilder`[Self <: `796`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: RequestParameters & (Omit[OrgsGetWebhookEndpoint, baseUrl | headers | mediaType])): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[OrgsGetWebhookResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
