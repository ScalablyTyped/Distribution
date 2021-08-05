package typings.octokitPluginRestEndpointMethods.anon

import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typings.octokitTypes.endpointsMod.IssuesAddAssigneesEndpoint
import typings.octokitTypes.endpointsMod.IssuesAddAssigneesResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import typings.octokitTypes.requestParametersMod.RequestParameters
import typings.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `718` extends StObject {
  
  var parameters: RequestParameters & (Omit[IssuesAddAssigneesEndpoint, baseUrl | headers | mediaType])
  
  var response: OctokitResponse[IssuesAddAssigneesResponseData]
}
object `718` {
  
  inline def apply(
    parameters: RequestParameters & (Omit[IssuesAddAssigneesEndpoint, baseUrl | headers | mediaType]),
    response: OctokitResponse[IssuesAddAssigneesResponseData]
  ): `718` = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[`718`]
  }
  
  extension [Self <: `718`](x: Self) {
    
    inline def setParameters(value: RequestParameters & (Omit[IssuesAddAssigneesEndpoint, baseUrl | headers | mediaType])): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponse(value: OctokitResponse[IssuesAddAssigneesResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
