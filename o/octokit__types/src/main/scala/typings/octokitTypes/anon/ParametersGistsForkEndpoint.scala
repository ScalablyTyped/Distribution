package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.GistsForkEndpoint
import typings.octokitTypes.endpointsMod.GistsForkRequestOptions
import typings.octokitTypes.endpointsMod.GistsForkResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersGistsForkEndpoint extends js.Object {
  
  var parameters: GistsForkEndpoint = js.native
  
  var request: GistsForkRequestOptions = js.native
  
  var response: OctokitResponse[GistsForkResponseData] = js.native
}
object ParametersGistsForkEndpoint {
  
  @scala.inline
  def apply(
    parameters: GistsForkEndpoint,
    request: GistsForkRequestOptions,
    response: OctokitResponse[GistsForkResponseData]
  ): ParametersGistsForkEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersGistsForkEndpoint]
  }
  
  @scala.inline
  implicit class ParametersGistsForkEndpointOps[Self <: ParametersGistsForkEndpoint] (val x: Self) extends AnyVal {
    
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
    def setParameters(value: GistsForkEndpoint): Self = this.set("parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: GistsForkRequestOptions): Self = this.set("request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[GistsForkResponseData]): Self = this.set("response", value.asInstanceOf[js.Any])
  }
}
