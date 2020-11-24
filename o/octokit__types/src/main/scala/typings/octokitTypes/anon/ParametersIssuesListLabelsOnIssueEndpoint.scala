package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.IssuesListLabelsOnIssueEndpoint
import typings.octokitTypes.endpointsMod.IssuesListLabelsOnIssueRequestOptions
import typings.octokitTypes.endpointsMod.IssuesListLabelsOnIssueResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersIssuesListLabelsOnIssueEndpoint extends js.Object {
  
  var parameters: IssuesListLabelsOnIssueEndpoint = js.native
  
  var request: IssuesListLabelsOnIssueRequestOptions = js.native
  
  var response: OctokitResponse[IssuesListLabelsOnIssueResponseData] = js.native
}
object ParametersIssuesListLabelsOnIssueEndpoint {
  
  @scala.inline
  def apply(
    parameters: IssuesListLabelsOnIssueEndpoint,
    request: IssuesListLabelsOnIssueRequestOptions,
    response: OctokitResponse[IssuesListLabelsOnIssueResponseData]
  ): ParametersIssuesListLabelsOnIssueEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersIssuesListLabelsOnIssueEndpoint]
  }
  
  @scala.inline
  implicit class ParametersIssuesListLabelsOnIssueEndpointOps[Self <: ParametersIssuesListLabelsOnIssueEndpoint] (val x: Self) extends AnyVal {
    
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
    def setParameters(value: IssuesListLabelsOnIssueEndpoint): Self = this.set("parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: IssuesListLabelsOnIssueRequestOptions): Self = this.set("request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[IssuesListLabelsOnIssueResponseData]): Self = this.set("response", value.asInstanceOf[js.Any])
  }
}
