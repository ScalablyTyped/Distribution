package typings.octokitPluginPaginateRest.anon

import typings.octokitTypes.endpointsMod.AppsListReposAccessibleToInstallationEndpoint
import typings.octokitTypes.endpointsMod.AppsListReposAccessibleToInstallationResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersAppsListReposAccessibleToInstallationEndpoint extends js.Object {
  
  var parameters: AppsListReposAccessibleToInstallationEndpoint = js.native
  
  var response: OctokitResponse[AppsListReposAccessibleToInstallationResponseData] with `1` = js.native
}
object ParametersAppsListReposAccessibleToInstallationEndpoint {
  
  @scala.inline
  def apply(
    parameters: AppsListReposAccessibleToInstallationEndpoint,
    response: OctokitResponse[AppsListReposAccessibleToInstallationResponseData] with `1`
  ): ParametersAppsListReposAccessibleToInstallationEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersAppsListReposAccessibleToInstallationEndpoint]
  }
  
  @scala.inline
  implicit class ParametersAppsListReposAccessibleToInstallationEndpointOps[Self <: ParametersAppsListReposAccessibleToInstallationEndpoint] (val x: Self) extends AnyVal {
    
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
    def setParameters(value: AppsListReposAccessibleToInstallationEndpoint): Self = this.set("parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[AppsListReposAccessibleToInstallationResponseData] with `1`): Self = this.set("response", value.asInstanceOf[js.Any])
  }
}
