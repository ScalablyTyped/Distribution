package typings.octokitPluginRestEndpointMethods.anon

import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typings.octokitTypes.endpointsMod.ReposTransferEndpoint
import typings.octokitTypes.endpointsMod.ReposTransferResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import typings.octokitTypes.requestParametersMod.RequestParameters
import typings.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `1019` extends StObject {
  
  var parameters: RequestParameters & (Omit[ReposTransferEndpoint, baseUrl | headers | mediaType])
  
  var response: OctokitResponse[ReposTransferResponseData]
}
object `1019` {
  
  inline def apply(
    parameters: RequestParameters & (Omit[ReposTransferEndpoint, baseUrl | headers | mediaType]),
    response: OctokitResponse[ReposTransferResponseData]
  ): `1019` = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[`1019`]
  }
  
  extension [Self <: `1019`](x: Self) {
    
    inline def setParameters(value: RequestParameters & (Omit[ReposTransferEndpoint, baseUrl | headers | mediaType])): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponse(value: OctokitResponse[ReposTransferResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
