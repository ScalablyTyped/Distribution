package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.AppsResetAuthorizationEndpoint
import typings.octokitTypes.endpointsMod.AppsResetAuthorizationRequestOptions
import typings.octokitTypes.endpointsMod.AppsResetAuthorizationResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersAppsResetAuthorizationEndpoint extends js.Object {
  
  var parameters: AppsResetAuthorizationEndpoint = js.native
  
  var request: AppsResetAuthorizationRequestOptions = js.native
  
  var response: OctokitResponse[AppsResetAuthorizationResponseData] = js.native
}
object ParametersAppsResetAuthorizationEndpoint {
  
  @scala.inline
  def apply(
    parameters: AppsResetAuthorizationEndpoint,
    request: AppsResetAuthorizationRequestOptions,
    response: OctokitResponse[AppsResetAuthorizationResponseData]
  ): ParametersAppsResetAuthorizationEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersAppsResetAuthorizationEndpoint]
  }
  
  @scala.inline
  implicit class ParametersAppsResetAuthorizationEndpointOps[Self <: ParametersAppsResetAuthorizationEndpoint] (val x: Self) extends AnyVal {
    
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
    def setParameters(value: AppsResetAuthorizationEndpoint): Self = this.set("parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: AppsResetAuthorizationRequestOptions): Self = this.set("request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[AppsResetAuthorizationResponseData]): Self = this.set("response", value.asInstanceOf[js.Any])
  }
}
