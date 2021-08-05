package typings.octokitPluginRestEndpointMethods.anon

import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typings.octokitTypes.endpointsMod.ReposRemoveStatusCheckContextsEndpoint
import typings.octokitTypes.endpointsMod.ReposRemoveStatusCheckContextsResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import typings.octokitTypes.requestParametersMod.RequestParameters
import typings.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `1007` extends StObject {
  
  var parameters: RequestParameters & (Omit[ReposRemoveStatusCheckContextsEndpoint, baseUrl | headers | mediaType])
  
  var response: OctokitResponse[ReposRemoveStatusCheckContextsResponseData]
}
object `1007` {
  
  inline def apply(
    parameters: RequestParameters & (Omit[ReposRemoveStatusCheckContextsEndpoint, baseUrl | headers | mediaType]),
    response: OctokitResponse[ReposRemoveStatusCheckContextsResponseData]
  ): `1007` = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[`1007`]
  }
  
  extension [Self <: `1007`](x: Self) {
    
    inline def setParameters(
      value: RequestParameters & (Omit[ReposRemoveStatusCheckContextsEndpoint, baseUrl | headers | mediaType])
    ): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponse(value: OctokitResponse[ReposRemoveStatusCheckContextsResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
