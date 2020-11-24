package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.ReposRemoveStatusCheckContextsEndpoint
import typings.octokitTypes.endpointsMod.ReposRemoveStatusCheckContextsRequestOptions
import typings.octokitTypes.endpointsMod.ReposRemoveStatusCheckContextsResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersReposRemoveStatusCheckContextsEndpoint extends js.Object {
  
  var parameters: ReposRemoveStatusCheckContextsEndpoint = js.native
  
  var request: ReposRemoveStatusCheckContextsRequestOptions = js.native
  
  var response: OctokitResponse[ReposRemoveStatusCheckContextsResponseData] = js.native
}
object ParametersReposRemoveStatusCheckContextsEndpoint {
  
  @scala.inline
  def apply(
    parameters: ReposRemoveStatusCheckContextsEndpoint,
    request: ReposRemoveStatusCheckContextsRequestOptions,
    response: OctokitResponse[ReposRemoveStatusCheckContextsResponseData]
  ): ParametersReposRemoveStatusCheckContextsEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersReposRemoveStatusCheckContextsEndpoint]
  }
  
  @scala.inline
  implicit class ParametersReposRemoveStatusCheckContextsEndpointOps[Self <: ParametersReposRemoveStatusCheckContextsEndpoint] (val x: Self) extends AnyVal {
    
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
    def setParameters(value: ReposRemoveStatusCheckContextsEndpoint): Self = this.set("parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: ReposRemoveStatusCheckContextsRequestOptions): Self = this.set("request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[ReposRemoveStatusCheckContextsResponseData]): Self = this.set("response", value.asInstanceOf[js.Any])
  }
}
