package typings.octokitPluginRestEndpointMethods.anon

import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typings.octokitTypes.endpointsMod.GitGetRefEndpoint
import typings.octokitTypes.endpointsMod.GitGetRefResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import typings.octokitTypes.requestParametersMod.RequestParameters
import typings.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `705` extends StObject {
  
  var parameters: RequestParameters & (Omit[GitGetRefEndpoint, baseUrl | headers | mediaType])
  
  var response: OctokitResponse[GitGetRefResponseData]
}
object `705` {
  
  inline def apply(
    parameters: RequestParameters & (Omit[GitGetRefEndpoint, baseUrl | headers | mediaType]),
    response: OctokitResponse[GitGetRefResponseData]
  ): `705` = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[`705`]
  }
  
  extension [Self <: `705`](x: Self) {
    
    inline def setParameters(value: RequestParameters & (Omit[GitGetRefEndpoint, baseUrl | headers | mediaType])): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponse(value: OctokitResponse[GitGetRefResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
