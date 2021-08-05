package typings.octokitPluginRestEndpointMethods.anon

import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typings.octokitTypes.endpointsMod.ActionsCreateRemoveTokenForOrgEndpoint
import typings.octokitTypes.endpointsMod.ActionsCreateRemoveTokenForOrgResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import typings.octokitTypes.requestParametersMod.RequestParameters
import typings.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `548` extends StObject {
  
  var parameters: RequestParameters & (Omit[ActionsCreateRemoveTokenForOrgEndpoint, baseUrl | headers | mediaType])
  
  var response: OctokitResponse[ActionsCreateRemoveTokenForOrgResponseData]
}
object `548` {
  
  inline def apply(
    parameters: RequestParameters & (Omit[ActionsCreateRemoveTokenForOrgEndpoint, baseUrl | headers | mediaType]),
    response: OctokitResponse[ActionsCreateRemoveTokenForOrgResponseData]
  ): `548` = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[`548`]
  }
  
  extension [Self <: `548`](x: Self) {
    
    inline def setParameters(
      value: RequestParameters & (Omit[ActionsCreateRemoveTokenForOrgEndpoint, baseUrl | headers | mediaType])
    ): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponse(value: OctokitResponse[ActionsCreateRemoveTokenForOrgResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
