package typings.octokitPluginRestEndpointMethods.anon

import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typings.octokitTypes.endpointsMod.IssuesCreateMilestoneEndpoint
import typings.octokitTypes.endpointsMod.IssuesCreateMilestoneResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import typings.octokitTypes.requestParametersMod.RequestParameters
import typings.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `724` extends StObject {
  
  var parameters: RequestParameters & (Omit[IssuesCreateMilestoneEndpoint, baseUrl | headers | mediaType])
  
  var response: OctokitResponse[IssuesCreateMilestoneResponseData]
}
object `724` {
  
  inline def apply(
    parameters: RequestParameters & (Omit[IssuesCreateMilestoneEndpoint, baseUrl | headers | mediaType]),
    response: OctokitResponse[IssuesCreateMilestoneResponseData]
  ): `724` = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[`724`]
  }
  
  extension [Self <: `724`](x: Self) {
    
    inline def setParameters(value: RequestParameters & (Omit[IssuesCreateMilestoneEndpoint, baseUrl | headers | mediaType])): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponse(value: OctokitResponse[IssuesCreateMilestoneResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
