package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.ActionsDownloadJobLogsForWorkflowRunEndpoint
import typings.octokitTypes.endpointsMod.ActionsDownloadJobLogsForWorkflowRunRequestOptions
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersActionsDownloadJobLogsForWorkflowRunEndpoint extends js.Object {
  
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
  implicit class ParametersActionsDownloadJobLogsForWorkflowRunEndpointOps[Self <: ParametersActionsDownloadJobLogsForWorkflowRunEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setParameters(value: ActionsDownloadJobLogsForWorkflowRunEndpoint): Self = this.set("parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: ActionsDownloadJobLogsForWorkflowRunRequestOptions): Self = this.set("request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[_]): Self = this.set("response", value.asInstanceOf[js.Any])
  }
}
