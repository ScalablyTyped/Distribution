package typings.octokitPluginRestEndpointMethods.anon

import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typings.octokitTypes.endpointsMod.ReposListLanguagesEndpoint
import typings.octokitTypes.endpointsMod.ReposListLanguagesResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import typings.octokitTypes.requestParametersMod.RequestParameters
import typings.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `994` extends StObject {
  
  var parameters: RequestParameters & (Omit[ReposListLanguagesEndpoint, baseUrl | headers | mediaType])
  
  var response: OctokitResponse[ReposListLanguagesResponseData]
}
object `994` {
  
  inline def apply(
    parameters: RequestParameters & (Omit[ReposListLanguagesEndpoint, baseUrl | headers | mediaType]),
    response: OctokitResponse[ReposListLanguagesResponseData]
  ): `994` = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[`994`]
  }
  
  extension [Self <: `994`](x: Self) {
    
    inline def setParameters(value: RequestParameters & (Omit[ReposListLanguagesEndpoint, baseUrl | headers | mediaType])): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponse(value: OctokitResponse[ReposListLanguagesResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
