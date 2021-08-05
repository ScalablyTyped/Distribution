package typings.octokitPluginRestEndpointMethods.anon

import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typings.octokitTypes.endpointsMod.ActionsListJobsForWorkflowRunEndpoint
import typings.octokitTypes.endpointsMod.ActionsListJobsForWorkflowRunResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import typings.octokitTypes.requestParametersMod.RequestParameters
import typings.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `574` extends StObject {
  
  var parameters: RequestParameters & (Omit[ActionsListJobsForWorkflowRunEndpoint, baseUrl | headers | mediaType])
  
  var response: OctokitResponse[ActionsListJobsForWorkflowRunResponseData]
}
object `574` {
  
  inline def apply(
    parameters: RequestParameters & (Omit[ActionsListJobsForWorkflowRunEndpoint, baseUrl | headers | mediaType]),
    response: OctokitResponse[ActionsListJobsForWorkflowRunResponseData]
  ): `574` = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[`574`]
  }
  
  extension [Self <: `574`](x: Self) {
    
    inline def setParameters(
      value: RequestParameters & (Omit[ActionsListJobsForWorkflowRunEndpoint, baseUrl | headers | mediaType])
    ): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponse(value: OctokitResponse[ActionsListJobsForWorkflowRunResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
