package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.AppsGetUserInstallationEndpoint
import typings.octokitTypes.endpointsMod.AppsGetUserInstallationRequestOptions
import typings.octokitTypes.endpointsMod.AppsGetUserInstallationResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersAppsGetUserInstallationEndpoint extends js.Object {
  
  var parameters: AppsGetUserInstallationEndpoint = js.native
  
  var request: AppsGetUserInstallationRequestOptions = js.native
  
  var response: OctokitResponse[AppsGetUserInstallationResponseData] = js.native
}
object ParametersAppsGetUserInstallationEndpoint {
  
  @scala.inline
  def apply(
    parameters: AppsGetUserInstallationEndpoint,
    request: AppsGetUserInstallationRequestOptions,
    response: OctokitResponse[AppsGetUserInstallationResponseData]
  ): ParametersAppsGetUserInstallationEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersAppsGetUserInstallationEndpoint]
  }
  
  @scala.inline
  implicit class ParametersAppsGetUserInstallationEndpointOps[Self <: ParametersAppsGetUserInstallationEndpoint] (val x: Self) extends AnyVal {
    
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
    def setParameters(value: AppsGetUserInstallationEndpoint): Self = this.set("parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: AppsGetUserInstallationRequestOptions): Self = this.set("request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[AppsGetUserInstallationResponseData]): Self = this.set("response", value.asInstanceOf[js.Any])
  }
}
