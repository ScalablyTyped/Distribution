package typings.octokitPluginPaginateRest.anon

import typings.octokitTypes.endpointsMod.MigrationsListReposForOrgEndpoint
import typings.octokitTypes.endpointsMod.MigrationsListReposForOrgResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersMigrationsListReposForOrgEndpoint extends js.Object {
  
  var parameters: MigrationsListReposForOrgEndpoint = js.native
  
  var response: OctokitResponse[MigrationsListReposForOrgResponseData] = js.native
}
object ParametersMigrationsListReposForOrgEndpoint {
  
  @scala.inline
  def apply(
    parameters: MigrationsListReposForOrgEndpoint,
    response: OctokitResponse[MigrationsListReposForOrgResponseData]
  ): ParametersMigrationsListReposForOrgEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersMigrationsListReposForOrgEndpoint]
  }
  
  @scala.inline
  implicit class ParametersMigrationsListReposForOrgEndpointOps[Self <: ParametersMigrationsListReposForOrgEndpoint] (val x: Self) extends AnyVal {
    
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
    def setParameters(value: MigrationsListReposForOrgEndpoint): Self = this.set("parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[MigrationsListReposForOrgResponseData]): Self = this.set("response", value.asInstanceOf[js.Any])
  }
}
