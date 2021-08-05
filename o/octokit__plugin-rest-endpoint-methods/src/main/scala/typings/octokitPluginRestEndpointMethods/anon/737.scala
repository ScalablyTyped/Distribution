package typings.octokitPluginRestEndpointMethods.anon

import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typings.octokitTypes.endpointsMod.IssuesListEventsEndpoint
import typings.octokitTypes.endpointsMod.IssuesListEventsResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import typings.octokitTypes.requestParametersMod.RequestParameters
import typings.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `737` extends StObject {
  
  var parameters: RequestParameters & (Omit[IssuesListEventsEndpoint, baseUrl | headers | mediaType])
  
  var response: OctokitResponse[IssuesListEventsResponseData]
}
object `737` {
  
  inline def apply(
    parameters: RequestParameters & (Omit[IssuesListEventsEndpoint, baseUrl | headers | mediaType]),
    response: OctokitResponse[IssuesListEventsResponseData]
  ): `737` = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[`737`]
  }
  
  extension [Self <: `737`](x: Self) {
    
    inline def setParameters(value: RequestParameters & (Omit[IssuesListEventsEndpoint, baseUrl | headers | mediaType])): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponse(value: OctokitResponse[IssuesListEventsResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
