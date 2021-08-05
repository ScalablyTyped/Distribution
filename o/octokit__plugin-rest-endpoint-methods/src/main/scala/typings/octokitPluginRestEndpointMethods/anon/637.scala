package typings.octokitPluginRestEndpointMethods.anon

import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typings.octokitTypes.endpointsMod.AppsListAccountsForPlanStubbedEndpoint
import typings.octokitTypes.endpointsMod.AppsListAccountsForPlanStubbedResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import typings.octokitTypes.requestParametersMod.RequestParameters
import typings.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `637` extends StObject {
  
  var parameters: RequestParameters & (Omit[AppsListAccountsForPlanStubbedEndpoint, baseUrl | headers | mediaType])
  
  var response: OctokitResponse[AppsListAccountsForPlanStubbedResponseData]
}
object `637` {
  
  inline def apply(
    parameters: RequestParameters & (Omit[AppsListAccountsForPlanStubbedEndpoint, baseUrl | headers | mediaType]),
    response: OctokitResponse[AppsListAccountsForPlanStubbedResponseData]
  ): `637` = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[`637`]
  }
  
  extension [Self <: `637`](x: Self) {
    
    inline def setParameters(
      value: RequestParameters & (Omit[AppsListAccountsForPlanStubbedEndpoint, baseUrl | headers | mediaType])
    ): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponse(value: OctokitResponse[AppsListAccountsForPlanStubbedResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
