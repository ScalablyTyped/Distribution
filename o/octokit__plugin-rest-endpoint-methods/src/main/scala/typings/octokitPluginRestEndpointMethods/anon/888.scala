package typings.octokitPluginRestEndpointMethods.anon

import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typings.octokitTypes.endpointsMod.ReactionsListForIssueCommentEndpoint
import typings.octokitTypes.endpointsMod.ReactionsListForIssueCommentResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import typings.octokitTypes.requestParametersMod.RequestParameters
import typings.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `888` extends StObject {
  
  var parameters: RequestParameters & (Omit[ReactionsListForIssueCommentEndpoint, baseUrl | headers | mediaType])
  
  var response: OctokitResponse[ReactionsListForIssueCommentResponseData]
}
object `888` {
  
  inline def apply(
    parameters: RequestParameters & (Omit[ReactionsListForIssueCommentEndpoint, baseUrl | headers | mediaType]),
    response: OctokitResponse[ReactionsListForIssueCommentResponseData]
  ): `888` = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[`888`]
  }
  
  extension [Self <: `888`](x: Self) {
    
    inline def setParameters(
      value: RequestParameters & (Omit[ReactionsListForIssueCommentEndpoint, baseUrl | headers | mediaType])
    ): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponse(value: OctokitResponse[ReactionsListForIssueCommentResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
