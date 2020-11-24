package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.IssuesSetLabelsEndpoint
import typings.octokitTypes.endpointsMod.IssuesSetLabelsRequestOptions
import typings.octokitTypes.endpointsMod.IssuesSetLabelsResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersIssuesSetLabelsEndpoint extends js.Object {
  
  var parameters: IssuesSetLabelsEndpoint = js.native
  
  var request: IssuesSetLabelsRequestOptions = js.native
  
  var response: OctokitResponse[IssuesSetLabelsResponseData] = js.native
}
object ParametersIssuesSetLabelsEndpoint {
  
  @scala.inline
  def apply(
    parameters: IssuesSetLabelsEndpoint,
    request: IssuesSetLabelsRequestOptions,
    response: OctokitResponse[IssuesSetLabelsResponseData]
  ): ParametersIssuesSetLabelsEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersIssuesSetLabelsEndpoint]
  }
  
  @scala.inline
  implicit class ParametersIssuesSetLabelsEndpointOps[Self <: ParametersIssuesSetLabelsEndpoint] (val x: Self) extends AnyVal {
    
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
    def setParameters(value: IssuesSetLabelsEndpoint): Self = this.set("parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: IssuesSetLabelsRequestOptions): Self = this.set("request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[IssuesSetLabelsResponseData]): Self = this.set("response", value.asInstanceOf[js.Any])
  }
}
