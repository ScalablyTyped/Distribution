package typings.octokitPluginRestEndpointMethods.anon

import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typings.octokitTypes.endpointsMod.ActionsListRunnerApplicationsForRepoEndpoint
import typings.octokitTypes.endpointsMod.ActionsListRunnerApplicationsForRepoResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import typings.octokitTypes.requestParametersMod.RequestParameters
import typings.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `579` extends StObject {
  
  var parameters: RequestParameters & (Omit[ActionsListRunnerApplicationsForRepoEndpoint, baseUrl | headers | mediaType])
  
  var response: OctokitResponse[ActionsListRunnerApplicationsForRepoResponseData]
}
object `579` {
  
  inline def apply(
    parameters: RequestParameters & (Omit[ActionsListRunnerApplicationsForRepoEndpoint, baseUrl | headers | mediaType]),
    response: OctokitResponse[ActionsListRunnerApplicationsForRepoResponseData]
  ): `579` = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[`579`]
  }
  
  extension [Self <: `579`](x: Self) {
    
    inline def setParameters(
      value: RequestParameters & (Omit[ActionsListRunnerApplicationsForRepoEndpoint, baseUrl | headers | mediaType])
    ): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponse(value: OctokitResponse[ActionsListRunnerApplicationsForRepoResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
