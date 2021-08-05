package typings.octokitPluginRestEndpointMethods.anon

import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typings.octokitTypes.endpointsMod.ActionsGetWorkflowRunUsageEndpoint
import typings.octokitTypes.endpointsMod.ActionsGetWorkflowRunUsageResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import typings.octokitTypes.requestParametersMod.RequestParameters
import typings.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `571` extends StObject {
  
  var parameters: RequestParameters & (Omit[ActionsGetWorkflowRunUsageEndpoint, baseUrl | headers | mediaType])
  
  var response: OctokitResponse[ActionsGetWorkflowRunUsageResponseData]
}
object `571` {
  
  inline def apply(
    parameters: RequestParameters & (Omit[ActionsGetWorkflowRunUsageEndpoint, baseUrl | headers | mediaType]),
    response: OctokitResponse[ActionsGetWorkflowRunUsageResponseData]
  ): `571` = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[`571`]
  }
  
  extension [Self <: `571`](x: Self) {
    
    inline def setParameters(
      value: RequestParameters & (Omit[ActionsGetWorkflowRunUsageEndpoint, baseUrl | headers | mediaType])
    ): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponse(value: OctokitResponse[ActionsGetWorkflowRunUsageResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
