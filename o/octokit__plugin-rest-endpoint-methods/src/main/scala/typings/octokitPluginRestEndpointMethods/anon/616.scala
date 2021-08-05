package typings.octokitPluginRestEndpointMethods.anon

import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typings.octokitTypes.endpointsMod.ActivitySetRepoSubscriptionEndpoint
import typings.octokitTypes.endpointsMod.ActivitySetRepoSubscriptionResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import typings.octokitTypes.requestParametersMod.RequestParameters
import typings.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `616` extends StObject {
  
  var parameters: RequestParameters & (Omit[ActivitySetRepoSubscriptionEndpoint, baseUrl | headers | mediaType])
  
  var response: OctokitResponse[ActivitySetRepoSubscriptionResponseData]
}
object `616` {
  
  inline def apply(
    parameters: RequestParameters & (Omit[ActivitySetRepoSubscriptionEndpoint, baseUrl | headers | mediaType]),
    response: OctokitResponse[ActivitySetRepoSubscriptionResponseData]
  ): `616` = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[`616`]
  }
  
  extension [Self <: `616`](x: Self) {
    
    inline def setParameters(
      value: RequestParameters & (Omit[ActivitySetRepoSubscriptionEndpoint, baseUrl | headers | mediaType])
    ): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponse(value: OctokitResponse[ActivitySetRepoSubscriptionResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
