package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.IssuesRemoveAssigneesEndpoint
import typings.octokitTypes.endpointsMod.IssuesRemoveAssigneesRequestOptions
import typings.octokitTypes.endpointsMod.IssuesRemoveAssigneesResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersIssuesRemoveAssigneesEndpoint extends js.Object {
  
  var parameters: IssuesRemoveAssigneesEndpoint = js.native
  
  var request: IssuesRemoveAssigneesRequestOptions = js.native
  
  var response: OctokitResponse[IssuesRemoveAssigneesResponseData] = js.native
}
object ParametersIssuesRemoveAssigneesEndpoint {
  
  @scala.inline
  def apply(
    parameters: IssuesRemoveAssigneesEndpoint,
    request: IssuesRemoveAssigneesRequestOptions,
    response: OctokitResponse[IssuesRemoveAssigneesResponseData]
  ): ParametersIssuesRemoveAssigneesEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersIssuesRemoveAssigneesEndpoint]
  }
  
  @scala.inline
  implicit class ParametersIssuesRemoveAssigneesEndpointOps[Self <: ParametersIssuesRemoveAssigneesEndpoint] (val x: Self) extends AnyVal {
    
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
    def setParameters(value: IssuesRemoveAssigneesEndpoint): Self = this.set("parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: IssuesRemoveAssigneesRequestOptions): Self = this.set("request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[IssuesRemoveAssigneesResponseData]): Self = this.set("response", value.asInstanceOf[js.Any])
  }
}
