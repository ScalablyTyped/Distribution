package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.ReposListCommitsEndpoint
import typings.octokitTypes.endpointsMod.ReposListCommitsRequestOptions
import typings.octokitTypes.endpointsMod.ReposListCommitsResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersReposListCommitsEndpoint extends js.Object {
  
  var parameters: ReposListCommitsEndpoint = js.native
  
  var request: ReposListCommitsRequestOptions = js.native
  
  var response: OctokitResponse[ReposListCommitsResponseData] = js.native
}
object ParametersReposListCommitsEndpoint {
  
  @scala.inline
  def apply(
    parameters: ReposListCommitsEndpoint,
    request: ReposListCommitsRequestOptions,
    response: OctokitResponse[ReposListCommitsResponseData]
  ): ParametersReposListCommitsEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersReposListCommitsEndpoint]
  }
  
  @scala.inline
  implicit class ParametersReposListCommitsEndpointOps[Self <: ParametersReposListCommitsEndpoint] (val x: Self) extends AnyVal {
    
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
    def setParameters(value: ReposListCommitsEndpoint): Self = this.set("parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: ReposListCommitsRequestOptions): Self = this.set("request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[ReposListCommitsResponseData]): Self = this.set("response", value.asInstanceOf[js.Any])
  }
}
