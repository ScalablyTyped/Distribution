package typings.octokitPluginRestEndpointMethods.anon

import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typings.octokitTypes.endpointsMod.ActivitySetThreadSubscriptionEndpoint
import typings.octokitTypes.endpointsMod.ActivitySetThreadSubscriptionResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import typings.octokitTypes.requestParametersMod.RequestParameters
import typings.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `617` extends StObject {
  
  var parameters: RequestParameters & (Omit[ActivitySetThreadSubscriptionEndpoint, baseUrl | headers | mediaType])
  
  var response: OctokitResponse[ActivitySetThreadSubscriptionResponseData]
}
object `617` {
  
  inline def apply(
    parameters: RequestParameters & (Omit[ActivitySetThreadSubscriptionEndpoint, baseUrl | headers | mediaType]),
    response: OctokitResponse[ActivitySetThreadSubscriptionResponseData]
  ): `617` = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[`617`]
  }
  
  extension [Self <: `617`](x: Self) {
    
    inline def setParameters(
      value: RequestParameters & (Omit[ActivitySetThreadSubscriptionEndpoint, baseUrl | headers | mediaType])
    ): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponse(value: OctokitResponse[ActivitySetThreadSubscriptionResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
