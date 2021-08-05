package typings.octokitPluginRestEndpointMethods.anon

import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typings.octokitTypes.endpointsMod.ActionsListWorkflowRunArtifactsEndpoint
import typings.octokitTypes.endpointsMod.ActionsListWorkflowRunArtifactsResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import typings.octokitTypes.requestParametersMod.RequestParameters
import typings.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `583` extends StObject {
  
  var parameters: RequestParameters & (Omit[ActionsListWorkflowRunArtifactsEndpoint, baseUrl | headers | mediaType])
  
  var response: OctokitResponse[ActionsListWorkflowRunArtifactsResponseData]
}
object `583` {
  
  inline def apply(
    parameters: RequestParameters & (Omit[ActionsListWorkflowRunArtifactsEndpoint, baseUrl | headers | mediaType]),
    response: OctokitResponse[ActionsListWorkflowRunArtifactsResponseData]
  ): `583` = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[`583`]
  }
  
  extension [Self <: `583`](x: Self) {
    
    inline def setParameters(
      value: RequestParameters & (Omit[ActionsListWorkflowRunArtifactsEndpoint, baseUrl | headers | mediaType])
    ): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponse(value: OctokitResponse[ActionsListWorkflowRunArtifactsResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
