package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.ReposCreateInOrgEndpoint
import typings.octokitTypes.endpointsMod.ReposCreateInOrgRequestOptions
import typings.octokitTypes.endpointsMod.ReposCreateInOrgResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersReposCreateInOrgEndpoint extends js.Object {
  
  var parameters: ReposCreateInOrgEndpoint = js.native
  
  var request: ReposCreateInOrgRequestOptions = js.native
  
  var response: OctokitResponse[ReposCreateInOrgResponseData] = js.native
}
object ParametersReposCreateInOrgEndpoint {
  
  @scala.inline
  def apply(
    parameters: ReposCreateInOrgEndpoint,
    request: ReposCreateInOrgRequestOptions,
    response: OctokitResponse[ReposCreateInOrgResponseData]
  ): ParametersReposCreateInOrgEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersReposCreateInOrgEndpoint]
  }
  
  @scala.inline
  implicit class ParametersReposCreateInOrgEndpointOps[Self <: ParametersReposCreateInOrgEndpoint] (val x: Self) extends AnyVal {
    
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
    def setParameters(value: ReposCreateInOrgEndpoint): Self = this.set("parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: ReposCreateInOrgRequestOptions): Self = this.set("request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[ReposCreateInOrgResponseData]): Self = this.set("response", value.asInstanceOf[js.Any])
  }
}
