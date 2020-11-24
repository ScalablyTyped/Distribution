package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.ReposGetContentEndpoint
import typings.octokitTypes.endpointsMod.ReposGetContentRequestOptions
import typings.octokitTypes.endpointsMod.ReposGetContentResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersReposGetContentEndpoint extends js.Object {
  
  var parameters: ReposGetContentEndpoint = js.native
  
  var request: ReposGetContentRequestOptions = js.native
  
  var response: OctokitResponse[ReposGetContentResponseData] = js.native
}
object ParametersReposGetContentEndpoint {
  
  @scala.inline
  def apply(
    parameters: ReposGetContentEndpoint,
    request: ReposGetContentRequestOptions,
    response: OctokitResponse[ReposGetContentResponseData]
  ): ParametersReposGetContentEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersReposGetContentEndpoint]
  }
  
  @scala.inline
  implicit class ParametersReposGetContentEndpointOps[Self <: ParametersReposGetContentEndpoint] (val x: Self) extends AnyVal {
    
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
    def setParameters(value: ReposGetContentEndpoint): Self = this.set("parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: ReposGetContentRequestOptions): Self = this.set("request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[ReposGetContentResponseData]): Self = this.set("response", value.asInstanceOf[js.Any])
  }
}
