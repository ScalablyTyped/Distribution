package typings.octokitPluginRestEndpointMethods.anon

import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typings.octokitTypes.endpointsMod.ReposDeleteFileEndpoint
import typings.octokitTypes.endpointsMod.ReposDeleteFileResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import typings.octokitTypes.requestParametersMod.RequestParameters
import typings.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `925` extends StObject {
  
  var parameters: RequestParameters & (Omit[ReposDeleteFileEndpoint, baseUrl | headers | mediaType])
  
  var response: OctokitResponse[ReposDeleteFileResponseData]
}
object `925` {
  
  inline def apply(
    parameters: RequestParameters & (Omit[ReposDeleteFileEndpoint, baseUrl | headers | mediaType]),
    response: OctokitResponse[ReposDeleteFileResponseData]
  ): `925` = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[`925`]
  }
  
  extension [Self <: `925`](x: Self) {
    
    inline def setParameters(value: RequestParameters & (Omit[ReposDeleteFileEndpoint, baseUrl | headers | mediaType])): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponse(value: OctokitResponse[ReposDeleteFileResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
