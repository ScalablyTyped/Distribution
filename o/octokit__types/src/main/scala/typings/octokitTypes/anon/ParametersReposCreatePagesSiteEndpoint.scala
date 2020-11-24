package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.ReposCreatePagesSiteEndpoint
import typings.octokitTypes.endpointsMod.ReposCreatePagesSiteRequestOptions
import typings.octokitTypes.endpointsMod.ReposCreatePagesSiteResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersReposCreatePagesSiteEndpoint extends js.Object {
  
  var parameters: ReposCreatePagesSiteEndpoint = js.native
  
  var request: ReposCreatePagesSiteRequestOptions = js.native
  
  var response: OctokitResponse[ReposCreatePagesSiteResponseData] = js.native
}
object ParametersReposCreatePagesSiteEndpoint {
  
  @scala.inline
  def apply(
    parameters: ReposCreatePagesSiteEndpoint,
    request: ReposCreatePagesSiteRequestOptions,
    response: OctokitResponse[ReposCreatePagesSiteResponseData]
  ): ParametersReposCreatePagesSiteEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersReposCreatePagesSiteEndpoint]
  }
  
  @scala.inline
  implicit class ParametersReposCreatePagesSiteEndpointOps[Self <: ParametersReposCreatePagesSiteEndpoint] (val x: Self) extends AnyVal {
    
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
    def setParameters(value: ReposCreatePagesSiteEndpoint): Self = this.set("parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: ReposCreatePagesSiteRequestOptions): Self = this.set("request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[ReposCreatePagesSiteResponseData]): Self = this.set("response", value.asInstanceOf[js.Any])
  }
}
