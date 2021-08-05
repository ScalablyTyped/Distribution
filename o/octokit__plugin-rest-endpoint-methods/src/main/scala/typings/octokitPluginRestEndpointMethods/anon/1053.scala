package typings.octokitPluginRestEndpointMethods.anon

import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typings.octokitTypes.endpointsMod.TeamsListEndpoint
import typings.octokitTypes.endpointsMod.TeamsListResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import typings.octokitTypes.requestParametersMod.RequestParameters
import typings.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `1053` extends StObject {
  
  var parameters: RequestParameters & (Omit[TeamsListEndpoint, baseUrl | headers | mediaType])
  
  var response: OctokitResponse[TeamsListResponseData]
}
object `1053` {
  
  inline def apply(
    parameters: RequestParameters & (Omit[TeamsListEndpoint, baseUrl | headers | mediaType]),
    response: OctokitResponse[TeamsListResponseData]
  ): `1053` = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[`1053`]
  }
  
  extension [Self <: `1053`](x: Self) {
    
    inline def setParameters(value: RequestParameters & (Omit[TeamsListEndpoint, baseUrl | headers | mediaType])): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponse(value: OctokitResponse[TeamsListResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
