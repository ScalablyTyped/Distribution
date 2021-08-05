package typings.octokitPluginRestEndpointMethods.anon

import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typings.octokitTypes.endpointsMod.IssuesListEventsForRepoEndpoint
import typings.octokitTypes.endpointsMod.IssuesListEventsForRepoResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import typings.octokitTypes.requestParametersMod.RequestParameters
import typings.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `738` extends StObject {
  
  var parameters: RequestParameters & (Omit[IssuesListEventsForRepoEndpoint, baseUrl | headers | mediaType])
  
  var response: OctokitResponse[IssuesListEventsForRepoResponseData]
}
object `738` {
  
  inline def apply(
    parameters: RequestParameters & (Omit[IssuesListEventsForRepoEndpoint, baseUrl | headers | mediaType]),
    response: OctokitResponse[IssuesListEventsForRepoResponseData]
  ): `738` = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[`738`]
  }
  
  extension [Self <: `738`](x: Self) {
    
    inline def setParameters(value: RequestParameters & (Omit[IssuesListEventsForRepoEndpoint, baseUrl | headers | mediaType])): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponse(value: OctokitResponse[IssuesListEventsForRepoResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
