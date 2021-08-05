package typings.octokitPluginRestEndpointMethods.anon

import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typings.octokitTypes.endpointsMod.ActionsListRunnerApplicationsForOrgEndpoint
import typings.octokitTypes.endpointsMod.ActionsListRunnerApplicationsForOrgResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import typings.octokitTypes.requestParametersMod.RequestParameters
import typings.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `578` extends StObject {
  
  var parameters: RequestParameters & (Omit[ActionsListRunnerApplicationsForOrgEndpoint, baseUrl | headers | mediaType])
  
  var response: OctokitResponse[ActionsListRunnerApplicationsForOrgResponseData]
}
object `578` {
  
  inline def apply(
    parameters: RequestParameters & (Omit[ActionsListRunnerApplicationsForOrgEndpoint, baseUrl | headers | mediaType]),
    response: OctokitResponse[ActionsListRunnerApplicationsForOrgResponseData]
  ): `578` = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[`578`]
  }
  
  extension [Self <: `578`](x: Self) {
    
    inline def setParameters(
      value: RequestParameters & (Omit[ActionsListRunnerApplicationsForOrgEndpoint, baseUrl | headers | mediaType])
    ): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponse(value: OctokitResponse[ActionsListRunnerApplicationsForOrgResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
