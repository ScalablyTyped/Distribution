package typings.octokitPluginRestEndpointMethods.anon

import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typings.octokitTypes.endpointsMod.ReposGetAllStatusCheckContextsEndpoint
import typings.octokitTypes.endpointsMod.ReposGetAllStatusCheckContextsResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import typings.octokitTypes.requestParametersMod.RequestParameters
import typings.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `940` extends StObject {
  
  var parameters: RequestParameters & (Omit[ReposGetAllStatusCheckContextsEndpoint, baseUrl | headers | mediaType])
  
  var response: OctokitResponse[ReposGetAllStatusCheckContextsResponseData]
}
object `940` {
  
  inline def apply(
    parameters: RequestParameters & (Omit[ReposGetAllStatusCheckContextsEndpoint, baseUrl | headers | mediaType]),
    response: OctokitResponse[ReposGetAllStatusCheckContextsResponseData]
  ): `940` = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[`940`]
  }
  
  extension [Self <: `940`](x: Self) {
    
    inline def setParameters(
      value: RequestParameters & (Omit[ReposGetAllStatusCheckContextsEndpoint, baseUrl | headers | mediaType])
    ): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponse(value: OctokitResponse[ReposGetAllStatusCheckContextsResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
