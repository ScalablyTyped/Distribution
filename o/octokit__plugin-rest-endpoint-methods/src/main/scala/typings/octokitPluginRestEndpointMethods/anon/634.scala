package typings.octokitPluginRestEndpointMethods.anon

import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typings.octokitTypes.endpointsMod.AppsGetSubscriptionPlanForAccountStubbedEndpoint
import typings.octokitTypes.endpointsMod.AppsGetSubscriptionPlanForAccountStubbedResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import typings.octokitTypes.requestParametersMod.RequestParameters
import typings.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `634` extends StObject {
  
  var parameters: RequestParameters & (Omit[AppsGetSubscriptionPlanForAccountStubbedEndpoint, baseUrl | headers | mediaType])
  
  var response: OctokitResponse[AppsGetSubscriptionPlanForAccountStubbedResponseData]
}
object `634` {
  
  inline def apply(
    parameters: RequestParameters & (Omit[AppsGetSubscriptionPlanForAccountStubbedEndpoint, baseUrl | headers | mediaType]),
    response: OctokitResponse[AppsGetSubscriptionPlanForAccountStubbedResponseData]
  ): `634` = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[`634`]
  }
  
  extension [Self <: `634`](x: Self) {
    
    inline def setParameters(
      value: RequestParameters & (Omit[AppsGetSubscriptionPlanForAccountStubbedEndpoint, baseUrl | headers | mediaType])
    ): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponse(value: OctokitResponse[AppsGetSubscriptionPlanForAccountStubbedResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
