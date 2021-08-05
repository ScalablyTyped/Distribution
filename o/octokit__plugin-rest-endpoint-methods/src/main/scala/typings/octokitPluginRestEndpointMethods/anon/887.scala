package typings.octokitPluginRestEndpointMethods.anon

import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typings.octokitTypes.endpointsMod.ReactionsListForIssueEndpoint
import typings.octokitTypes.endpointsMod.ReactionsListForIssueResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import typings.octokitTypes.requestParametersMod.RequestParameters
import typings.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `887` extends StObject {
  
  var parameters: RequestParameters & (Omit[ReactionsListForIssueEndpoint, baseUrl | headers | mediaType])
  
  var response: OctokitResponse[ReactionsListForIssueResponseData]
}
object `887` {
  
  inline def apply(
    parameters: RequestParameters & (Omit[ReactionsListForIssueEndpoint, baseUrl | headers | mediaType]),
    response: OctokitResponse[ReactionsListForIssueResponseData]
  ): `887` = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[`887`]
  }
  
  extension [Self <: `887`](x: Self) {
    
    inline def setParameters(value: RequestParameters & (Omit[ReactionsListForIssueEndpoint, baseUrl | headers | mediaType])): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponse(value: OctokitResponse[ReactionsListForIssueResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
