package typings.octokitPluginRestEndpointMethods.anon

import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typings.octokitTypes.endpointsMod.ActionsGetOrgPublicKeyEndpoint
import typings.octokitTypes.endpointsMod.ActionsGetOrgPublicKeyResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import typings.octokitTypes.requestParametersMod.RequestParameters
import typings.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `563` extends StObject {
  
  var parameters: RequestParameters & (Omit[ActionsGetOrgPublicKeyEndpoint, baseUrl | headers | mediaType])
  
  var response: OctokitResponse[ActionsGetOrgPublicKeyResponseData]
}
object `563` {
  
  inline def apply(
    parameters: RequestParameters & (Omit[ActionsGetOrgPublicKeyEndpoint, baseUrl | headers | mediaType]),
    response: OctokitResponse[ActionsGetOrgPublicKeyResponseData]
  ): `563` = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[`563`]
  }
  
  extension [Self <: `563`](x: Self) {
    
    inline def setParameters(value: RequestParameters & (Omit[ActionsGetOrgPublicKeyEndpoint, baseUrl | headers | mediaType])): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponse(value: OctokitResponse[ActionsGetOrgPublicKeyResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
