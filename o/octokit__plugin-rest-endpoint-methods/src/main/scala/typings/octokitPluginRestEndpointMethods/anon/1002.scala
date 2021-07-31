package typings.octokitPluginRestEndpointMethods.anon

import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typings.octokitTypes.endpointsMod.ReposListWebhooksEndpoint
import typings.octokitTypes.endpointsMod.ReposListWebhooksResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import typings.octokitTypes.requestParametersMod.RequestParameters
import typings.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `1002` extends StObject {
  
  var parameters: RequestParameters & (Omit[ReposListWebhooksEndpoint, baseUrl | headers | mediaType])
  
  var response: OctokitResponse[ReposListWebhooksResponseData]
}
object `1002` {
  
  @scala.inline
  def apply(
    parameters: RequestParameters & (Omit[ReposListWebhooksEndpoint, baseUrl | headers | mediaType]),
    response: OctokitResponse[ReposListWebhooksResponseData]
  ): `1002` = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[`1002`]
  }
  
  @scala.inline
  implicit class `1002MutableBuilder`[Self <: `1002`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: RequestParameters & (Omit[ReposListWebhooksEndpoint, baseUrl | headers | mediaType])): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[ReposListWebhooksResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
