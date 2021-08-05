package typings.octokitPluginRestEndpointMethods.anon

import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typings.octokitTypes.endpointsMod.IssuesListLabelsForMilestoneEndpoint
import typings.octokitTypes.endpointsMod.IssuesListLabelsForMilestoneResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import typings.octokitTypes.requestParametersMod.RequestParameters
import typings.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `743` extends StObject {
  
  var parameters: RequestParameters & (Omit[IssuesListLabelsForMilestoneEndpoint, baseUrl | headers | mediaType])
  
  var response: OctokitResponse[IssuesListLabelsForMilestoneResponseData]
}
object `743` {
  
  inline def apply(
    parameters: RequestParameters & (Omit[IssuesListLabelsForMilestoneEndpoint, baseUrl | headers | mediaType]),
    response: OctokitResponse[IssuesListLabelsForMilestoneResponseData]
  ): `743` = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[`743`]
  }
  
  extension [Self <: `743`](x: Self) {
    
    inline def setParameters(
      value: RequestParameters & (Omit[IssuesListLabelsForMilestoneEndpoint, baseUrl | headers | mediaType])
    ): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponse(value: OctokitResponse[IssuesListLabelsForMilestoneResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
