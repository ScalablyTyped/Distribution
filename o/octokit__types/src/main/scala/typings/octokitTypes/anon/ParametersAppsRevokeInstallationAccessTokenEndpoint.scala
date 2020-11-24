package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.AppsRevokeInstallationAccessTokenEndpoint
import typings.octokitTypes.endpointsMod.AppsRevokeInstallationAccessTokenRequestOptions
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersAppsRevokeInstallationAccessTokenEndpoint extends js.Object {
  
  var parameters: AppsRevokeInstallationAccessTokenEndpoint = js.native
  
  var request: AppsRevokeInstallationAccessTokenRequestOptions = js.native
  
  var response: OctokitResponse[_] = js.native
}
object ParametersAppsRevokeInstallationAccessTokenEndpoint {
  
  @scala.inline
  def apply(
    parameters: AppsRevokeInstallationAccessTokenEndpoint,
    request: AppsRevokeInstallationAccessTokenRequestOptions,
    response: OctokitResponse[_]
  ): ParametersAppsRevokeInstallationAccessTokenEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersAppsRevokeInstallationAccessTokenEndpoint]
  }
  
  @scala.inline
  implicit class ParametersAppsRevokeInstallationAccessTokenEndpointOps[Self <: ParametersAppsRevokeInstallationAccessTokenEndpoint] (val x: Self) extends AnyVal {
    
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
    def setParameters(value: AppsRevokeInstallationAccessTokenEndpoint): Self = this.set("parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: AppsRevokeInstallationAccessTokenRequestOptions): Self = this.set("request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[_]): Self = this.set("response", value.asInstanceOf[js.Any])
  }
}
