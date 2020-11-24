package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.ReposDisableAutomatedSecurityFixesEndpoint
import typings.octokitTypes.endpointsMod.ReposDisableAutomatedSecurityFixesRequestOptions
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersReposDisableAutomatedSecurityFixesEndpoint extends js.Object {
  
  var parameters: ReposDisableAutomatedSecurityFixesEndpoint = js.native
  
  var request: ReposDisableAutomatedSecurityFixesRequestOptions = js.native
  
  var response: OctokitResponse[_] = js.native
}
object ParametersReposDisableAutomatedSecurityFixesEndpoint {
  
  @scala.inline
  def apply(
    parameters: ReposDisableAutomatedSecurityFixesEndpoint,
    request: ReposDisableAutomatedSecurityFixesRequestOptions,
    response: OctokitResponse[_]
  ): ParametersReposDisableAutomatedSecurityFixesEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersReposDisableAutomatedSecurityFixesEndpoint]
  }
  
  @scala.inline
  implicit class ParametersReposDisableAutomatedSecurityFixesEndpointOps[Self <: ParametersReposDisableAutomatedSecurityFixesEndpoint] (val x: Self) extends AnyVal {
    
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
    def setParameters(value: ReposDisableAutomatedSecurityFixesEndpoint): Self = this.set("parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: ReposDisableAutomatedSecurityFixesRequestOptions): Self = this.set("request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[_]): Self = this.set("response", value.asInstanceOf[js.Any])
  }
}
