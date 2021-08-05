package typings.octokitPluginRestEndpointMethods.anon

import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typings.octokitTypes.endpointsMod.AppsListPlansStubbedEndpoint
import typings.octokitTypes.endpointsMod.AppsListPlansStubbedResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import typings.octokitTypes.requestParametersMod.RequestParameters
import typings.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `642` extends StObject {
  
  var parameters: RequestParameters & (Omit[AppsListPlansStubbedEndpoint, baseUrl | headers | mediaType])
  
  var response: OctokitResponse[AppsListPlansStubbedResponseData]
}
object `642` {
  
  inline def apply(
    parameters: RequestParameters & (Omit[AppsListPlansStubbedEndpoint, baseUrl | headers | mediaType]),
    response: OctokitResponse[AppsListPlansStubbedResponseData]
  ): `642` = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[`642`]
  }
  
  extension [Self <: `642`](x: Self) {
    
    inline def setParameters(value: RequestParameters & (Omit[AppsListPlansStubbedEndpoint, baseUrl | headers | mediaType])): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponse(value: OctokitResponse[AppsListPlansStubbedResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
