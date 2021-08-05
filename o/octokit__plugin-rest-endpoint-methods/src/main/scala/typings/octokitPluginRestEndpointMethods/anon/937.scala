package typings.octokitPluginRestEndpointMethods.anon

import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typings.octokitTypes.endpointsMod.ReposGetEndpoint
import typings.octokitTypes.endpointsMod.ReposGetResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import typings.octokitTypes.requestParametersMod.RequestParameters
import typings.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `937` extends StObject {
  
  var parameters: RequestParameters & (Omit[ReposGetEndpoint, baseUrl | headers | mediaType])
  
  var response: OctokitResponse[ReposGetResponseData]
}
object `937` {
  
  inline def apply(
    parameters: RequestParameters & (Omit[ReposGetEndpoint, baseUrl | headers | mediaType]),
    response: OctokitResponse[ReposGetResponseData]
  ): `937` = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[`937`]
  }
  
  extension [Self <: `937`](x: Self) {
    
    inline def setParameters(value: RequestParameters & (Omit[ReposGetEndpoint, baseUrl | headers | mediaType])): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponse(value: OctokitResponse[ReposGetResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
