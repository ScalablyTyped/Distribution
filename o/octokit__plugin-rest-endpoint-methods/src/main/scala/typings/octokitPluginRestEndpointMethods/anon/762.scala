package typings.octokitPluginRestEndpointMethods.anon

import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typings.octokitTypes.endpointsMod.MetaGetEndpoint
import typings.octokitTypes.endpointsMod.MetaGetResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import typings.octokitTypes.requestParametersMod.RequestParameters
import typings.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `762` extends StObject {
  
  var parameters: RequestParameters & (Omit[MetaGetEndpoint, baseUrl | headers | mediaType])
  
  var response: OctokitResponse[MetaGetResponseData]
}
object `762` {
  
  inline def apply(
    parameters: RequestParameters & (Omit[MetaGetEndpoint, baseUrl | headers | mediaType]),
    response: OctokitResponse[MetaGetResponseData]
  ): `762` = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[`762`]
  }
  
  extension [Self <: `762`](x: Self) {
    
    inline def setParameters(value: RequestParameters & (Omit[MetaGetEndpoint, baseUrl | headers | mediaType])): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponse(value: OctokitResponse[MetaGetResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
