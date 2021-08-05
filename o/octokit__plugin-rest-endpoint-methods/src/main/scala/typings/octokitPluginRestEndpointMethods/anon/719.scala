package typings.octokitPluginRestEndpointMethods.anon

import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typings.octokitTypes.endpointsMod.IssuesAddLabelsEndpoint
import typings.octokitTypes.endpointsMod.IssuesAddLabelsResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import typings.octokitTypes.requestParametersMod.RequestParameters
import typings.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `719` extends StObject {
  
  var parameters: RequestParameters & (Omit[IssuesAddLabelsEndpoint, baseUrl | headers | mediaType])
  
  var response: OctokitResponse[IssuesAddLabelsResponseData]
}
object `719` {
  
  inline def apply(
    parameters: RequestParameters & (Omit[IssuesAddLabelsEndpoint, baseUrl | headers | mediaType]),
    response: OctokitResponse[IssuesAddLabelsResponseData]
  ): `719` = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[`719`]
  }
  
  extension [Self <: `719`](x: Self) {
    
    inline def setParameters(value: RequestParameters & (Omit[IssuesAddLabelsEndpoint, baseUrl | headers | mediaType])): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponse(value: OctokitResponse[IssuesAddLabelsResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
