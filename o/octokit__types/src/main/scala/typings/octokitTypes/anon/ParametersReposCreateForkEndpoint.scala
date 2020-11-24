package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.ReposCreateForkEndpoint
import typings.octokitTypes.endpointsMod.ReposCreateForkRequestOptions
import typings.octokitTypes.endpointsMod.ReposCreateForkResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersReposCreateForkEndpoint extends js.Object {
  
  var parameters: ReposCreateForkEndpoint = js.native
  
  var request: ReposCreateForkRequestOptions = js.native
  
  var response: OctokitResponse[ReposCreateForkResponseData] = js.native
}
object ParametersReposCreateForkEndpoint {
  
  @scala.inline
  def apply(
    parameters: ReposCreateForkEndpoint,
    request: ReposCreateForkRequestOptions,
    response: OctokitResponse[ReposCreateForkResponseData]
  ): ParametersReposCreateForkEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersReposCreateForkEndpoint]
  }
  
  @scala.inline
  implicit class ParametersReposCreateForkEndpointOps[Self <: ParametersReposCreateForkEndpoint] (val x: Self) extends AnyVal {
    
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
    def setParameters(value: ReposCreateForkEndpoint): Self = this.set("parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: ReposCreateForkRequestOptions): Self = this.set("request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[ReposCreateForkResponseData]): Self = this.set("response", value.asInstanceOf[js.Any])
  }
}
