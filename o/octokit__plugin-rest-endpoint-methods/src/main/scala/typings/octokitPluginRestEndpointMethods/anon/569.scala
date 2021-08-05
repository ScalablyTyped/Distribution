package typings.octokitPluginRestEndpointMethods.anon

import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typings.octokitTypes.endpointsMod.ActionsGetWorkflowEndpoint
import typings.octokitTypes.endpointsMod.ActionsGetWorkflowResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import typings.octokitTypes.requestParametersMod.RequestParameters
import typings.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `569` extends StObject {
  
  var parameters: RequestParameters & (Omit[ActionsGetWorkflowEndpoint, baseUrl | headers | mediaType])
  
  var response: OctokitResponse[ActionsGetWorkflowResponseData]
}
object `569` {
  
  inline def apply(
    parameters: RequestParameters & (Omit[ActionsGetWorkflowEndpoint, baseUrl | headers | mediaType]),
    response: OctokitResponse[ActionsGetWorkflowResponseData]
  ): `569` = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[`569`]
  }
  
  extension [Self <: `569`](x: Self) {
    
    inline def setParameters(value: RequestParameters & (Omit[ActionsGetWorkflowEndpoint, baseUrl | headers | mediaType])): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponse(value: OctokitResponse[ActionsGetWorkflowResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
