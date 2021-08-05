package typings.octokitPluginRestEndpointMethods.anon

import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typings.octokitTypes.endpointsMod.PullsListEndpoint
import typings.octokitTypes.endpointsMod.PullsListResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import typings.octokitTypes.requestParametersMod.RequestParameters
import typings.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `856` extends StObject {
  
  var parameters: RequestParameters & (Omit[PullsListEndpoint, baseUrl | headers | mediaType])
  
  var response: OctokitResponse[PullsListResponseData]
}
object `856` {
  
  inline def apply(
    parameters: RequestParameters & (Omit[PullsListEndpoint, baseUrl | headers | mediaType]),
    response: OctokitResponse[PullsListResponseData]
  ): `856` = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[`856`]
  }
  
  extension [Self <: `856`](x: Self) {
    
    inline def setParameters(value: RequestParameters & (Omit[PullsListEndpoint, baseUrl | headers | mediaType])): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponse(value: OctokitResponse[PullsListResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
