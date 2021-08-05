package typings.octokitPluginRestEndpointMethods.anon

import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typings.octokitTypes.endpointsMod.IssuesListEventsForTimelineEndpoint
import typings.octokitTypes.endpointsMod.IssuesListEventsForTimelineResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import typings.octokitTypes.requestParametersMod.RequestParameters
import typings.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `739` extends StObject {
  
  var parameters: RequestParameters & (Omit[IssuesListEventsForTimelineEndpoint, baseUrl | headers | mediaType])
  
  var response: OctokitResponse[IssuesListEventsForTimelineResponseData]
}
object `739` {
  
  inline def apply(
    parameters: RequestParameters & (Omit[IssuesListEventsForTimelineEndpoint, baseUrl | headers | mediaType]),
    response: OctokitResponse[IssuesListEventsForTimelineResponseData]
  ): `739` = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[`739`]
  }
  
  extension [Self <: `739`](x: Self) {
    
    inline def setParameters(
      value: RequestParameters & (Omit[IssuesListEventsForTimelineEndpoint, baseUrl | headers | mediaType])
    ): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponse(value: OctokitResponse[IssuesListEventsForTimelineResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
