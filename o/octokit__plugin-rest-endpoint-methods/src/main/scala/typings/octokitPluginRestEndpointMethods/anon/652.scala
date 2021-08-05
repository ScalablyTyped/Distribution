package typings.octokitPluginRestEndpointMethods.anon

import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typings.octokitTypes.endpointsMod.BillingGetGithubActionsBillingUserEndpoint
import typings.octokitTypes.endpointsMod.BillingGetGithubActionsBillingUserResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import typings.octokitTypes.requestParametersMod.RequestParameters
import typings.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `652` extends StObject {
  
  var parameters: RequestParameters & (Omit[BillingGetGithubActionsBillingUserEndpoint, baseUrl | headers | mediaType])
  
  var response: OctokitResponse[BillingGetGithubActionsBillingUserResponseData]
}
object `652` {
  
  inline def apply(
    parameters: RequestParameters & (Omit[BillingGetGithubActionsBillingUserEndpoint, baseUrl | headers | mediaType]),
    response: OctokitResponse[BillingGetGithubActionsBillingUserResponseData]
  ): `652` = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[`652`]
  }
  
  extension [Self <: `652`](x: Self) {
    
    inline def setParameters(
      value: RequestParameters & (Omit[BillingGetGithubActionsBillingUserEndpoint, baseUrl | headers | mediaType])
    ): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponse(value: OctokitResponse[BillingGetGithubActionsBillingUserResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
