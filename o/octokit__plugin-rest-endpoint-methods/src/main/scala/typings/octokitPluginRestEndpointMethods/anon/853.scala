package typings.octokitPluginRestEndpointMethods.anon

import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typings.octokitTypes.endpointsMod.PullsGetEndpoint
import typings.octokitTypes.endpointsMod.PullsGetResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import typings.octokitTypes.requestParametersMod.RequestParameters
import typings.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `853` extends StObject {
  
  var parameters: RequestParameters & (Omit[PullsGetEndpoint, baseUrl | headers | mediaType])
  
  var response: OctokitResponse[PullsGetResponseData]
}
object `853` {
  
  inline def apply(
    parameters: RequestParameters & (Omit[PullsGetEndpoint, baseUrl | headers | mediaType]),
    response: OctokitResponse[PullsGetResponseData]
  ): `853` = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[`853`]
  }
  
  extension [Self <: `853`](x: Self) {
    
    inline def setParameters(value: RequestParameters & (Omit[PullsGetEndpoint, baseUrl | headers | mediaType])): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponse(value: OctokitResponse[PullsGetResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
