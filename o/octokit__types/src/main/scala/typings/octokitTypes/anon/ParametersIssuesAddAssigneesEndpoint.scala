package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.IssuesAddAssigneesEndpoint
import typings.octokitTypes.endpointsMod.IssuesAddAssigneesRequestOptions
import typings.octokitTypes.endpointsMod.IssuesAddAssigneesResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersIssuesAddAssigneesEndpoint extends js.Object {
  
  var parameters: IssuesAddAssigneesEndpoint = js.native
  
  var request: IssuesAddAssigneesRequestOptions = js.native
  
  var response: OctokitResponse[IssuesAddAssigneesResponseData] = js.native
}
object ParametersIssuesAddAssigneesEndpoint {
  
  @scala.inline
  def apply(
    parameters: IssuesAddAssigneesEndpoint,
    request: IssuesAddAssigneesRequestOptions,
    response: OctokitResponse[IssuesAddAssigneesResponseData]
  ): ParametersIssuesAddAssigneesEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersIssuesAddAssigneesEndpoint]
  }
  
  @scala.inline
  implicit class ParametersIssuesAddAssigneesEndpointOps[Self <: ParametersIssuesAddAssigneesEndpoint] (val x: Self) extends AnyVal {
    
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
    def setParameters(value: IssuesAddAssigneesEndpoint): Self = this.set("parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: IssuesAddAssigneesRequestOptions): Self = this.set("request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[IssuesAddAssigneesResponseData]): Self = this.set("response", value.asInstanceOf[js.Any])
  }
}
