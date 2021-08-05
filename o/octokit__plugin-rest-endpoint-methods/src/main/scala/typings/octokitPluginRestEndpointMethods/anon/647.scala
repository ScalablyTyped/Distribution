package typings.octokitPluginRestEndpointMethods.anon

import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typings.octokitTypes.endpointsMod.AppsResetTokenEndpoint
import typings.octokitTypes.endpointsMod.AppsResetTokenResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import typings.octokitTypes.requestParametersMod.RequestParameters
import typings.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `647` extends StObject {
  
  var parameters: RequestParameters & (Omit[AppsResetTokenEndpoint, baseUrl | headers | mediaType])
  
  var response: OctokitResponse[AppsResetTokenResponseData]
}
object `647` {
  
  inline def apply(
    parameters: RequestParameters & (Omit[AppsResetTokenEndpoint, baseUrl | headers | mediaType]),
    response: OctokitResponse[AppsResetTokenResponseData]
  ): `647` = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[`647`]
  }
  
  extension [Self <: `647`](x: Self) {
    
    inline def setParameters(value: RequestParameters & (Omit[AppsResetTokenEndpoint, baseUrl | headers | mediaType])): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponse(value: OctokitResponse[AppsResetTokenResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
