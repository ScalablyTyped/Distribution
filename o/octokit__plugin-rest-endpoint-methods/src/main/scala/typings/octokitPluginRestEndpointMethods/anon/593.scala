package typings.octokitPluginRestEndpointMethods.anon

import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typings.octokitTypes.endpointsMod.ActivityGetRepoSubscriptionEndpoint
import typings.octokitTypes.endpointsMod.ActivityGetRepoSubscriptionResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import typings.octokitTypes.requestParametersMod.RequestParameters
import typings.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `593` extends StObject {
  
  var parameters: RequestParameters & (Omit[ActivityGetRepoSubscriptionEndpoint, baseUrl | headers | mediaType])
  
  var response: OctokitResponse[ActivityGetRepoSubscriptionResponseData]
}
object `593` {
  
  inline def apply(
    parameters: RequestParameters & (Omit[ActivityGetRepoSubscriptionEndpoint, baseUrl | headers | mediaType]),
    response: OctokitResponse[ActivityGetRepoSubscriptionResponseData]
  ): `593` = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[`593`]
  }
  
  extension [Self <: `593`](x: Self) {
    
    inline def setParameters(
      value: RequestParameters & (Omit[ActivityGetRepoSubscriptionEndpoint, baseUrl | headers | mediaType])
    ): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponse(value: OctokitResponse[ActivityGetRepoSubscriptionResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
