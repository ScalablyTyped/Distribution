package typings.octokitPluginRestEndpointMethods.anon

import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typings.octokitTypes.endpointsMod.ActionsListSelectedReposForOrgSecretEndpoint
import typings.octokitTypes.endpointsMod.ActionsListSelectedReposForOrgSecretResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import typings.octokitTypes.requestParametersMod.RequestParameters
import typings.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `580` extends StObject {
  
  var parameters: RequestParameters & (Omit[ActionsListSelectedReposForOrgSecretEndpoint, baseUrl | headers | mediaType])
  
  var response: OctokitResponse[ActionsListSelectedReposForOrgSecretResponseData]
}
object `580` {
  
  inline def apply(
    parameters: RequestParameters & (Omit[ActionsListSelectedReposForOrgSecretEndpoint, baseUrl | headers | mediaType]),
    response: OctokitResponse[ActionsListSelectedReposForOrgSecretResponseData]
  ): `580` = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[`580`]
  }
  
  extension [Self <: `580`](x: Self) {
    
    inline def setParameters(
      value: RequestParameters & (Omit[ActionsListSelectedReposForOrgSecretEndpoint, baseUrl | headers | mediaType])
    ): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponse(value: OctokitResponse[ActionsListSelectedReposForOrgSecretResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
