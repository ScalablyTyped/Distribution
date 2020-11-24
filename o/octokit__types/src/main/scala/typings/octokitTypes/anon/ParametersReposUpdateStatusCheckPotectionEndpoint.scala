package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.ReposUpdateStatusCheckPotectionEndpoint
import typings.octokitTypes.endpointsMod.ReposUpdateStatusCheckPotectionRequestOptions
import typings.octokitTypes.endpointsMod.ReposUpdateStatusCheckPotectionResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersReposUpdateStatusCheckPotectionEndpoint extends js.Object {
  
  var parameters: ReposUpdateStatusCheckPotectionEndpoint = js.native
  
  var request: ReposUpdateStatusCheckPotectionRequestOptions = js.native
  
  var response: OctokitResponse[ReposUpdateStatusCheckPotectionResponseData] = js.native
}
object ParametersReposUpdateStatusCheckPotectionEndpoint {
  
  @scala.inline
  def apply(
    parameters: ReposUpdateStatusCheckPotectionEndpoint,
    request: ReposUpdateStatusCheckPotectionRequestOptions,
    response: OctokitResponse[ReposUpdateStatusCheckPotectionResponseData]
  ): ParametersReposUpdateStatusCheckPotectionEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersReposUpdateStatusCheckPotectionEndpoint]
  }
  
  @scala.inline
  implicit class ParametersReposUpdateStatusCheckPotectionEndpointOps[Self <: ParametersReposUpdateStatusCheckPotectionEndpoint] (val x: Self) extends AnyVal {
    
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
    def setParameters(value: ReposUpdateStatusCheckPotectionEndpoint): Self = this.set("parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: ReposUpdateStatusCheckPotectionRequestOptions): Self = this.set("request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[ReposUpdateStatusCheckPotectionResponseData]): Self = this.set("response", value.asInstanceOf[js.Any])
  }
}
