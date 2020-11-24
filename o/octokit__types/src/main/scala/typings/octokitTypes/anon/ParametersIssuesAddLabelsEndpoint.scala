package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.IssuesAddLabelsEndpoint
import typings.octokitTypes.endpointsMod.IssuesAddLabelsRequestOptions
import typings.octokitTypes.endpointsMod.IssuesAddLabelsResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersIssuesAddLabelsEndpoint extends js.Object {
  
  var parameters: IssuesAddLabelsEndpoint = js.native
  
  var request: IssuesAddLabelsRequestOptions = js.native
  
  var response: OctokitResponse[IssuesAddLabelsResponseData] = js.native
}
object ParametersIssuesAddLabelsEndpoint {
  
  @scala.inline
  def apply(
    parameters: IssuesAddLabelsEndpoint,
    request: IssuesAddLabelsRequestOptions,
    response: OctokitResponse[IssuesAddLabelsResponseData]
  ): ParametersIssuesAddLabelsEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersIssuesAddLabelsEndpoint]
  }
  
  @scala.inline
  implicit class ParametersIssuesAddLabelsEndpointOps[Self <: ParametersIssuesAddLabelsEndpoint] (val x: Self) extends AnyVal {
    
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
    def setParameters(value: IssuesAddLabelsEndpoint): Self = this.set("parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: IssuesAddLabelsRequestOptions): Self = this.set("request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[IssuesAddLabelsResponseData]): Self = this.set("response", value.asInstanceOf[js.Any])
  }
}
