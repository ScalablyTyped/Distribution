package typings.octokitPluginRestEndpointMethods.anon

import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typings.octokitTypes.endpointsMod.SearchIssuesAndPullRequestsEndpoint
import typings.octokitTypes.endpointsMod.SearchIssuesAndPullRequestsResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import typings.octokitTypes.requestParametersMod.RequestParameters
import typings.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `1033` extends StObject {
  
  var parameters: RequestParameters & (Omit[SearchIssuesAndPullRequestsEndpoint, baseUrl | headers | mediaType])
  
  var response: OctokitResponse[SearchIssuesAndPullRequestsResponseData]
}
object `1033` {
  
  inline def apply(
    parameters: RequestParameters & (Omit[SearchIssuesAndPullRequestsEndpoint, baseUrl | headers | mediaType]),
    response: OctokitResponse[SearchIssuesAndPullRequestsResponseData]
  ): `1033` = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[`1033`]
  }
  
  extension [Self <: `1033`](x: Self) {
    
    inline def setParameters(
      value: RequestParameters & (Omit[SearchIssuesAndPullRequestsEndpoint, baseUrl | headers | mediaType])
    ): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponse(value: OctokitResponse[SearchIssuesAndPullRequestsResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
