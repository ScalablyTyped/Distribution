package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.AppsGetOrgInstallationEndpoint
import typings.octokitTypes.endpointsMod.AppsGetOrgInstallationRequestOptions
import typings.octokitTypes.endpointsMod.AppsGetOrgInstallationResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersAppsGetOrgInstallationEndpoint extends js.Object {
  
  var parameters: AppsGetOrgInstallationEndpoint = js.native
  
  var request: AppsGetOrgInstallationRequestOptions = js.native
  
  var response: OctokitResponse[AppsGetOrgInstallationResponseData] = js.native
}
object ParametersAppsGetOrgInstallationEndpoint {
  
  @scala.inline
  def apply(
    parameters: AppsGetOrgInstallationEndpoint,
    request: AppsGetOrgInstallationRequestOptions,
    response: OctokitResponse[AppsGetOrgInstallationResponseData]
  ): ParametersAppsGetOrgInstallationEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersAppsGetOrgInstallationEndpoint]
  }
  
  @scala.inline
  implicit class ParametersAppsGetOrgInstallationEndpointOps[Self <: ParametersAppsGetOrgInstallationEndpoint] (val x: Self) extends AnyVal {
    
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
    def setParameters(value: AppsGetOrgInstallationEndpoint): Self = this.set("parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: AppsGetOrgInstallationRequestOptions): Self = this.set("request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[AppsGetOrgInstallationResponseData]): Self = this.set("response", value.asInstanceOf[js.Any])
  }
}
