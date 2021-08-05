package typings.octokitPluginRestEndpointMethods.anon

import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typings.octokitTypes.endpointsMod.OrgsListWebhooksEndpoint
import typings.octokitTypes.endpointsMod.OrgsListWebhooksResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import typings.octokitTypes.requestParametersMod.RequestParameters
import typings.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `808` extends StObject {
  
  var parameters: RequestParameters & (Omit[OrgsListWebhooksEndpoint, baseUrl | headers | mediaType])
  
  var response: OctokitResponse[OrgsListWebhooksResponseData]
}
object `808` {
  
  inline def apply(
    parameters: RequestParameters & (Omit[OrgsListWebhooksEndpoint, baseUrl | headers | mediaType]),
    response: OctokitResponse[OrgsListWebhooksResponseData]
  ): `808` = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[`808`]
  }
  
  extension [Self <: `808`](x: Self) {
    
    inline def setParameters(value: RequestParameters & (Omit[OrgsListWebhooksEndpoint, baseUrl | headers | mediaType])): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponse(value: OctokitResponse[OrgsListWebhooksResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
