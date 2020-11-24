package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.IssuesCreateEndpoint
import typings.octokitTypes.endpointsMod.IssuesCreateRequestOptions
import typings.octokitTypes.endpointsMod.IssuesCreateResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersIssuesCreateEndpoint extends js.Object {
  
  var parameters: IssuesCreateEndpoint = js.native
  
  var request: IssuesCreateRequestOptions = js.native
  
  var response: OctokitResponse[IssuesCreateResponseData] = js.native
}
object ParametersIssuesCreateEndpoint {
  
  @scala.inline
  def apply(
    parameters: IssuesCreateEndpoint,
    request: IssuesCreateRequestOptions,
    response: OctokitResponse[IssuesCreateResponseData]
  ): ParametersIssuesCreateEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersIssuesCreateEndpoint]
  }
  
  @scala.inline
  implicit class ParametersIssuesCreateEndpointOps[Self <: ParametersIssuesCreateEndpoint] (val x: Self) extends AnyVal {
    
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
    def setParameters(value: IssuesCreateEndpoint): Self = this.set("parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: IssuesCreateRequestOptions): Self = this.set("request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[IssuesCreateResponseData]): Self = this.set("response", value.asInstanceOf[js.Any])
  }
}
