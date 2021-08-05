package typings.octokitPluginRestEndpointMethods.anon

import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typings.octokitTypes.endpointsMod.OrgsGetEndpoint
import typings.octokitTypes.endpointsMod.OrgsGetResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import typings.octokitTypes.requestParametersMod.RequestParameters
import typings.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `793` extends StObject {
  
  var parameters: RequestParameters & (Omit[OrgsGetEndpoint, baseUrl | headers | mediaType])
  
  var response: OctokitResponse[OrgsGetResponseData]
}
object `793` {
  
  inline def apply(
    parameters: RequestParameters & (Omit[OrgsGetEndpoint, baseUrl | headers | mediaType]),
    response: OctokitResponse[OrgsGetResponseData]
  ): `793` = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[`793`]
  }
  
  extension [Self <: `793`](x: Self) {
    
    inline def setParameters(value: RequestParameters & (Omit[OrgsGetEndpoint, baseUrl | headers | mediaType])): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponse(value: OctokitResponse[OrgsGetResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
