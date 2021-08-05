package typings.octokitPluginRestEndpointMethods.anon

import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typings.octokitTypes.endpointsMod.ActionsGetWorkflowRunEndpoint
import typings.octokitTypes.endpointsMod.ActionsGetWorkflowRunResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import typings.octokitTypes.requestParametersMod.RequestParameters
import typings.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `570` extends StObject {
  
  var parameters: RequestParameters & (Omit[ActionsGetWorkflowRunEndpoint, baseUrl | headers | mediaType])
  
  var response: OctokitResponse[ActionsGetWorkflowRunResponseData]
}
object `570` {
  
  inline def apply(
    parameters: RequestParameters & (Omit[ActionsGetWorkflowRunEndpoint, baseUrl | headers | mediaType]),
    response: OctokitResponse[ActionsGetWorkflowRunResponseData]
  ): `570` = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[`570`]
  }
  
  extension [Self <: `570`](x: Self) {
    
    inline def setParameters(value: RequestParameters & (Omit[ActionsGetWorkflowRunEndpoint, baseUrl | headers | mediaType])): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponse(value: OctokitResponse[ActionsGetWorkflowRunResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
