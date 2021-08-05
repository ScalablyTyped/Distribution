package typings.octokitPluginRestEndpointMethods.anon

import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typings.octokitTypes.endpointsMod.IssuesUpdateEndpoint
import typings.octokitTypes.endpointsMod.IssuesUpdateResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import typings.octokitTypes.requestParametersMod.RequestParameters
import typings.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `753` extends StObject {
  
  var parameters: RequestParameters & (Omit[IssuesUpdateEndpoint, baseUrl | headers | mediaType])
  
  var response: OctokitResponse[IssuesUpdateResponseData]
}
object `753` {
  
  inline def apply(
    parameters: RequestParameters & (Omit[IssuesUpdateEndpoint, baseUrl | headers | mediaType]),
    response: OctokitResponse[IssuesUpdateResponseData]
  ): `753` = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[`753`]
  }
  
  extension [Self <: `753`](x: Self) {
    
    inline def setParameters(value: RequestParameters & (Omit[IssuesUpdateEndpoint, baseUrl | headers | mediaType])): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponse(value: OctokitResponse[IssuesUpdateResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
