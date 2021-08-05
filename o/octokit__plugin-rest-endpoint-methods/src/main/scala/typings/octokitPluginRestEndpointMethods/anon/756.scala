package typings.octokitPluginRestEndpointMethods.anon

import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typings.octokitTypes.endpointsMod.IssuesUpdateMilestoneEndpoint
import typings.octokitTypes.endpointsMod.IssuesUpdateMilestoneResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import typings.octokitTypes.requestParametersMod.RequestParameters
import typings.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `756` extends StObject {
  
  var parameters: RequestParameters & (Omit[IssuesUpdateMilestoneEndpoint, baseUrl | headers | mediaType])
  
  var response: OctokitResponse[IssuesUpdateMilestoneResponseData]
}
object `756` {
  
  inline def apply(
    parameters: RequestParameters & (Omit[IssuesUpdateMilestoneEndpoint, baseUrl | headers | mediaType]),
    response: OctokitResponse[IssuesUpdateMilestoneResponseData]
  ): `756` = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[`756`]
  }
  
  extension [Self <: `756`](x: Self) {
    
    inline def setParameters(value: RequestParameters & (Omit[IssuesUpdateMilestoneEndpoint, baseUrl | headers | mediaType])): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponse(value: OctokitResponse[IssuesUpdateMilestoneResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
