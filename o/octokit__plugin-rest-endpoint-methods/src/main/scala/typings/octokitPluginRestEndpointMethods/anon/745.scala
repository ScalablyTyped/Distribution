package typings.octokitPluginRestEndpointMethods.anon

import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typings.octokitTypes.endpointsMod.IssuesListLabelsOnIssueEndpoint
import typings.octokitTypes.endpointsMod.IssuesListLabelsOnIssueResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import typings.octokitTypes.requestParametersMod.RequestParameters
import typings.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `745` extends StObject {
  
  var parameters: RequestParameters & (Omit[IssuesListLabelsOnIssueEndpoint, baseUrl | headers | mediaType])
  
  var response: OctokitResponse[IssuesListLabelsOnIssueResponseData]
}
object `745` {
  
  inline def apply(
    parameters: RequestParameters & (Omit[IssuesListLabelsOnIssueEndpoint, baseUrl | headers | mediaType]),
    response: OctokitResponse[IssuesListLabelsOnIssueResponseData]
  ): `745` = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[`745`]
  }
  
  extension [Self <: `745`](x: Self) {
    
    inline def setParameters(value: RequestParameters & (Omit[IssuesListLabelsOnIssueEndpoint, baseUrl | headers | mediaType])): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponse(value: OctokitResponse[IssuesListLabelsOnIssueResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
