package typings.octokitPluginRestEndpointMethods.anon

import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typings.octokitTypes.endpointsMod.TeamsListChildInOrgEndpoint
import typings.octokitTypes.endpointsMod.TeamsListChildInOrgResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import typings.octokitTypes.requestParametersMod.RequestParameters
import typings.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `1054` extends StObject {
  
  var parameters: RequestParameters & (Omit[TeamsListChildInOrgEndpoint, baseUrl | headers | mediaType])
  
  var response: OctokitResponse[TeamsListChildInOrgResponseData]
}
object `1054` {
  
  inline def apply(
    parameters: RequestParameters & (Omit[TeamsListChildInOrgEndpoint, baseUrl | headers | mediaType]),
    response: OctokitResponse[TeamsListChildInOrgResponseData]
  ): `1054` = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[`1054`]
  }
  
  extension [Self <: `1054`](x: Self) {
    
    inline def setParameters(value: RequestParameters & (Omit[TeamsListChildInOrgEndpoint, baseUrl | headers | mediaType])): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponse(value: OctokitResponse[TeamsListChildInOrgResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
