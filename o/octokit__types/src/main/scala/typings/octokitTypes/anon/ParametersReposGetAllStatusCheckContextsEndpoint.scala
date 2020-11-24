package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.ReposGetAllStatusCheckContextsEndpoint
import typings.octokitTypes.endpointsMod.ReposGetAllStatusCheckContextsRequestOptions
import typings.octokitTypes.endpointsMod.ReposGetAllStatusCheckContextsResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersReposGetAllStatusCheckContextsEndpoint extends js.Object {
  
  var parameters: ReposGetAllStatusCheckContextsEndpoint = js.native
  
  var request: ReposGetAllStatusCheckContextsRequestOptions = js.native
  
  var response: OctokitResponse[ReposGetAllStatusCheckContextsResponseData] = js.native
}
object ParametersReposGetAllStatusCheckContextsEndpoint {
  
  @scala.inline
  def apply(
    parameters: ReposGetAllStatusCheckContextsEndpoint,
    request: ReposGetAllStatusCheckContextsRequestOptions,
    response: OctokitResponse[ReposGetAllStatusCheckContextsResponseData]
  ): ParametersReposGetAllStatusCheckContextsEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersReposGetAllStatusCheckContextsEndpoint]
  }
  
  @scala.inline
  implicit class ParametersReposGetAllStatusCheckContextsEndpointOps[Self <: ParametersReposGetAllStatusCheckContextsEndpoint] (val x: Self) extends AnyVal {
    
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
    def setParameters(value: ReposGetAllStatusCheckContextsEndpoint): Self = this.set("parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: ReposGetAllStatusCheckContextsRequestOptions): Self = this.set("request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[ReposGetAllStatusCheckContextsResponseData]): Self = this.set("response", value.asInstanceOf[js.Any])
  }
}
