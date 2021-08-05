package typings.octokitPluginRestEndpointMethods.anon

import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typings.octokitTypes.endpointsMod.SearchReposEndpoint
import typings.octokitTypes.endpointsMod.SearchReposResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import typings.octokitTypes.requestParametersMod.RequestParameters
import typings.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `1035` extends StObject {
  
  var parameters: RequestParameters & (Omit[SearchReposEndpoint, baseUrl | headers | mediaType])
  
  var response: OctokitResponse[SearchReposResponseData]
}
object `1035` {
  
  inline def apply(
    parameters: RequestParameters & (Omit[SearchReposEndpoint, baseUrl | headers | mediaType]),
    response: OctokitResponse[SearchReposResponseData]
  ): `1035` = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[`1035`]
  }
  
  extension [Self <: `1035`](x: Self) {
    
    inline def setParameters(value: RequestParameters & (Omit[SearchReposEndpoint, baseUrl | headers | mediaType])): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponse(value: OctokitResponse[SearchReposResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
