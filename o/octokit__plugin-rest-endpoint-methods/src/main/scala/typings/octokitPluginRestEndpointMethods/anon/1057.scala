package typings.octokitPluginRestEndpointMethods.anon

import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typings.octokitTypes.endpointsMod.TeamsListForAuthenticatedUserEndpoint
import typings.octokitTypes.endpointsMod.TeamsListForAuthenticatedUserResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import typings.octokitTypes.requestParametersMod.RequestParameters
import typings.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `1057` extends StObject {
  
  var parameters: RequestParameters & (Omit[TeamsListForAuthenticatedUserEndpoint, baseUrl | headers | mediaType])
  
  var response: OctokitResponse[TeamsListForAuthenticatedUserResponseData]
}
object `1057` {
  
  inline def apply(
    parameters: RequestParameters & (Omit[TeamsListForAuthenticatedUserEndpoint, baseUrl | headers | mediaType]),
    response: OctokitResponse[TeamsListForAuthenticatedUserResponseData]
  ): `1057` = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[`1057`]
  }
  
  extension [Self <: `1057`](x: Self) {
    
    inline def setParameters(
      value: RequestParameters & (Omit[TeamsListForAuthenticatedUserEndpoint, baseUrl | headers | mediaType])
    ): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponse(value: OctokitResponse[TeamsListForAuthenticatedUserResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
