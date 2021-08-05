package typings.octokitPluginRestEndpointMethods.anon

import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typings.octokitTypes.endpointsMod.ActionsGetOrgSecretEndpoint
import typings.octokitTypes.endpointsMod.ActionsGetOrgSecretResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import typings.octokitTypes.requestParametersMod.RequestParameters
import typings.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `564` extends StObject {
  
  var parameters: RequestParameters & (Omit[ActionsGetOrgSecretEndpoint, baseUrl | headers | mediaType])
  
  var response: OctokitResponse[ActionsGetOrgSecretResponseData]
}
object `564` {
  
  inline def apply(
    parameters: RequestParameters & (Omit[ActionsGetOrgSecretEndpoint, baseUrl | headers | mediaType]),
    response: OctokitResponse[ActionsGetOrgSecretResponseData]
  ): `564` = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[`564`]
  }
  
  extension [Self <: `564`](x: Self) {
    
    inline def setParameters(value: RequestParameters & (Omit[ActionsGetOrgSecretEndpoint, baseUrl | headers | mediaType])): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponse(value: OctokitResponse[ActionsGetOrgSecretResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
