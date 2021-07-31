package typings.octokitPluginRestEndpointMethods.anon

import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typings.octokitTypes.endpointsMod.ActionsListWorkflowRunsEndpoint
import typings.octokitTypes.endpointsMod.ActionsListWorkflowRunsResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import typings.octokitTypes.requestParametersMod.RequestParameters
import typings.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `584` extends StObject {
  
  var parameters: RequestParameters & (Omit[ActionsListWorkflowRunsEndpoint, baseUrl | headers | mediaType])
  
  var response: OctokitResponse[ActionsListWorkflowRunsResponseData]
}
object `584` {
  
  @scala.inline
  def apply(
    parameters: RequestParameters & (Omit[ActionsListWorkflowRunsEndpoint, baseUrl | headers | mediaType]),
    response: OctokitResponse[ActionsListWorkflowRunsResponseData]
  ): `584` = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[`584`]
  }
  
  @scala.inline
  implicit class `584MutableBuilder`[Self <: `584`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: RequestParameters & (Omit[ActionsListWorkflowRunsEndpoint, baseUrl | headers | mediaType])): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[ActionsListWorkflowRunsResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
