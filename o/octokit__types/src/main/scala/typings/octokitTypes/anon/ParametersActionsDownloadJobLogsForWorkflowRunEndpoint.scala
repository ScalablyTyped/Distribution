package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.ActionsDownloadJobLogsForWorkflowRunEndpoint
import typings.octokitTypes.endpointsMod.ActionsDownloadJobLogsForWorkflowRunRequestOptions
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersActionsDownloadJobLogsForWorkflowRunEndpoint extends StObject {
  
  var parameters: ActionsDownloadJobLogsForWorkflowRunEndpoint = js.native
  
  var request: ActionsDownloadJobLogsForWorkflowRunRequestOptions = js.native
  
  var response: OctokitResponse[_] = js.native
}
object ParametersActionsDownloadJobLogsForWorkflowRunEndpoint {
  
  @scala.inline
  def apply(
    parameters: ActionsDownloadJobLogsForWorkflowRunEndpoint,
    request: ActionsDownloadJobLogsForWorkflowRunRequestOptions,
    response: OctokitResponse[_]
  ): ParametersActionsDownloadJobLogsForWorkflowRunEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersActionsDownloadJobLogsForWorkflowRunEndpoint]
  }
  
  @scala.inline
  implicit class ParametersActionsDownloadJobLogsForWorkflowRunEndpointMutableBuilder[Self <: ParametersActionsDownloadJobLogsForWorkflowRunEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: ActionsDownloadJobLogsForWorkflowRunEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: ActionsDownloadJobLogsForWorkflowRunRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[_]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
