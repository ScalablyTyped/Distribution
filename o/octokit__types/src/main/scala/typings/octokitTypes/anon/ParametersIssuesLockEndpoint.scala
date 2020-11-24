package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.IssuesLockEndpoint
import typings.octokitTypes.endpointsMod.IssuesLockRequestOptions
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersIssuesLockEndpoint extends js.Object {
  
  var parameters: IssuesLockEndpoint = js.native
  
  var request: IssuesLockRequestOptions = js.native
  
  var response: OctokitResponse[_] = js.native
}
object ParametersIssuesLockEndpoint {
  
  @scala.inline
  def apply(parameters: IssuesLockEndpoint, request: IssuesLockRequestOptions, response: OctokitResponse[_]): ParametersIssuesLockEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersIssuesLockEndpoint]
  }
  
  @scala.inline
  implicit class ParametersIssuesLockEndpointOps[Self <: ParametersIssuesLockEndpoint] (val x: Self) extends AnyVal {
    
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
    def setParameters(value: IssuesLockEndpoint): Self = this.set("parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: IssuesLockRequestOptions): Self = this.set("request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[_]): Self = this.set("response", value.asInstanceOf[js.Any])
  }
}
