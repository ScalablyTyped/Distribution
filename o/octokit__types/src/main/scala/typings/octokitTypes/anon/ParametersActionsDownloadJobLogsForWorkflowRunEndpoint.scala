package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.ActionsDownloadJobLogsForWorkflowRunEndpoint
import typings.octokitTypes.endpointsMod.ActionsDownloadJobLogsForWorkflowRunRequestOptions
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersActionsDownloadJobLogsForWorkflowRunEndpoint extends StObject {
  
  var parameters: ActionsDownloadJobLogsForWorkflowRunEndpoint
  
  var request: ActionsDownloadJobLogsForWorkflowRunRequestOptions
  
  var response: OctokitResponse[js.Any]
}
object ParametersActionsDownloadJobLogsForWorkflowRunEndpoint {
  
  inline def apply(
    parameters: ActionsDownloadJobLogsForWorkflowRunEndpoint,
    request: ActionsDownloadJobLogsForWorkflowRunRequestOptions,
    response: OctokitResponse[js.Any]
  ): ParametersActionsDownloadJobLogsForWorkflowRunEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersActionsDownloadJobLogsForWorkflowRunEndpoint]
  }
  
  extension [Self <: ParametersActionsDownloadJobLogsForWorkflowRunEndpoint](x: Self) {
    
    inline def setParameters(value: ActionsDownloadJobLogsForWorkflowRunEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequest(value: ActionsDownloadJobLogsForWorkflowRunRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    inline def setResponse(value: OctokitResponse[js.Any]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
