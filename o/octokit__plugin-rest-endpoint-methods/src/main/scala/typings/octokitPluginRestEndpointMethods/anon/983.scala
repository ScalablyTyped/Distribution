package typings.octokitPluginRestEndpointMethods.anon

import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typings.octokitTypes.endpointsMod.ReposListCommitsEndpoint
import typings.octokitTypes.endpointsMod.ReposListCommitsResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import typings.octokitTypes.requestParametersMod.RequestParameters
import typings.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `983` extends StObject {
  
  var parameters: RequestParameters & (Omit[ReposListCommitsEndpoint, baseUrl | headers | mediaType])
  
  var response: OctokitResponse[ReposListCommitsResponseData]
}
object `983` {
  
  inline def apply(
    parameters: RequestParameters & (Omit[ReposListCommitsEndpoint, baseUrl | headers | mediaType]),
    response: OctokitResponse[ReposListCommitsResponseData]
  ): `983` = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[`983`]
  }
  
  extension [Self <: `983`](x: Self) {
    
    inline def setParameters(value: RequestParameters & (Omit[ReposListCommitsEndpoint, baseUrl | headers | mediaType])): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponse(value: OctokitResponse[ReposListCommitsResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
