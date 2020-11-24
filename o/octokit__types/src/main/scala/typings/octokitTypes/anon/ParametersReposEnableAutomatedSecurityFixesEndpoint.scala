package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.ReposEnableAutomatedSecurityFixesEndpoint
import typings.octokitTypes.endpointsMod.ReposEnableAutomatedSecurityFixesRequestOptions
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersReposEnableAutomatedSecurityFixesEndpoint extends js.Object {
  
  var parameters: ReposEnableAutomatedSecurityFixesEndpoint = js.native
  
  var request: ReposEnableAutomatedSecurityFixesRequestOptions = js.native
  
  var response: OctokitResponse[_] = js.native
}
object ParametersReposEnableAutomatedSecurityFixesEndpoint {
  
  @scala.inline
  def apply(
    parameters: ReposEnableAutomatedSecurityFixesEndpoint,
    request: ReposEnableAutomatedSecurityFixesRequestOptions,
    response: OctokitResponse[_]
  ): ParametersReposEnableAutomatedSecurityFixesEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersReposEnableAutomatedSecurityFixesEndpoint]
  }
  
  @scala.inline
  implicit class ParametersReposEnableAutomatedSecurityFixesEndpointOps[Self <: ParametersReposEnableAutomatedSecurityFixesEndpoint] (val x: Self) extends AnyVal {
    
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
    def setParameters(value: ReposEnableAutomatedSecurityFixesEndpoint): Self = this.set("parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: ReposEnableAutomatedSecurityFixesRequestOptions): Self = this.set("request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[_]): Self = this.set("response", value.asInstanceOf[js.Any])
  }
}
