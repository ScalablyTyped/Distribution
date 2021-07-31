package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.ActionsDownloadWorkflowRunLogsEndpoint
import typings.octokitTypes.endpointsMod.ActionsDownloadWorkflowRunLogsRequestOptions
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersActionsDownloadWorkflowRunLogsEndpoint extends StObject {
  
  var parameters: ActionsDownloadWorkflowRunLogsEndpoint
  
  var request: ActionsDownloadWorkflowRunLogsRequestOptions
  
  var response: OctokitResponse[js.Any]
}
object ParametersActionsDownloadWorkflowRunLogsEndpoint {
  
  @scala.inline
  def apply(
    parameters: ActionsDownloadWorkflowRunLogsEndpoint,
    request: ActionsDownloadWorkflowRunLogsRequestOptions,
    response: OctokitResponse[js.Any]
  ): ParametersActionsDownloadWorkflowRunLogsEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersActionsDownloadWorkflowRunLogsEndpoint]
  }
  
  @scala.inline
  implicit class ParametersActionsDownloadWorkflowRunLogsEndpointMutableBuilder[Self <: ParametersActionsDownloadWorkflowRunLogsEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: ActionsDownloadWorkflowRunLogsEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: ActionsDownloadWorkflowRunLogsRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[js.Any]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
