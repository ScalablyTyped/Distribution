package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.IssuesRemoveLabelEndpoint
import typings.octokitTypes.endpointsMod.IssuesRemoveLabelRequestOptions
import typings.octokitTypes.endpointsMod.IssuesRemoveLabelResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersIssuesRemoveLabelEndpoint extends js.Object {
  
  var parameters: IssuesRemoveLabelEndpoint = js.native
  
  var request: IssuesRemoveLabelRequestOptions = js.native
  
  var response: OctokitResponse[IssuesRemoveLabelResponseData] = js.native
}
object ParametersIssuesRemoveLabelEndpoint {
  
  @scala.inline
  def apply(
    parameters: IssuesRemoveLabelEndpoint,
    request: IssuesRemoveLabelRequestOptions,
    response: OctokitResponse[IssuesRemoveLabelResponseData]
  ): ParametersIssuesRemoveLabelEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersIssuesRemoveLabelEndpoint]
  }
  
  @scala.inline
  implicit class ParametersIssuesRemoveLabelEndpointOps[Self <: ParametersIssuesRemoveLabelEndpoint] (val x: Self) extends AnyVal {
    
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
    def setParameters(value: IssuesRemoveLabelEndpoint): Self = this.set("parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: IssuesRemoveLabelRequestOptions): Self = this.set("request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[IssuesRemoveLabelResponseData]): Self = this.set("response", value.asInstanceOf[js.Any])
  }
}
