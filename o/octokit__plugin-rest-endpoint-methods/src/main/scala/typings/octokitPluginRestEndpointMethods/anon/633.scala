package typings.octokitPluginRestEndpointMethods.anon

import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typings.octokitTypes.endpointsMod.AppsGetSubscriptionPlanForAccountEndpoint
import typings.octokitTypes.endpointsMod.AppsGetSubscriptionPlanForAccountResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import typings.octokitTypes.requestParametersMod.RequestParameters
import typings.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `633` extends StObject {
  
  var parameters: RequestParameters & (Omit[AppsGetSubscriptionPlanForAccountEndpoint, baseUrl | headers | mediaType])
  
  var response: OctokitResponse[AppsGetSubscriptionPlanForAccountResponseData]
}
object `633` {
  
  inline def apply(
    parameters: RequestParameters & (Omit[AppsGetSubscriptionPlanForAccountEndpoint, baseUrl | headers | mediaType]),
    response: OctokitResponse[AppsGetSubscriptionPlanForAccountResponseData]
  ): `633` = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[`633`]
  }
  
  extension [Self <: `633`](x: Self) {
    
    inline def setParameters(
      value: RequestParameters & (Omit[AppsGetSubscriptionPlanForAccountEndpoint, baseUrl | headers | mediaType])
    ): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponse(value: OctokitResponse[AppsGetSubscriptionPlanForAccountResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
