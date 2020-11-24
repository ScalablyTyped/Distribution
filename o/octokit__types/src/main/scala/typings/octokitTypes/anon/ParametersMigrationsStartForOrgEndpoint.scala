package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.MigrationsStartForOrgEndpoint
import typings.octokitTypes.endpointsMod.MigrationsStartForOrgRequestOptions
import typings.octokitTypes.endpointsMod.MigrationsStartForOrgResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersMigrationsStartForOrgEndpoint extends js.Object {
  
  var parameters: MigrationsStartForOrgEndpoint = js.native
  
  var request: MigrationsStartForOrgRequestOptions = js.native
  
  var response: OctokitResponse[MigrationsStartForOrgResponseData] = js.native
}
object ParametersMigrationsStartForOrgEndpoint {
  
  @scala.inline
  def apply(
    parameters: MigrationsStartForOrgEndpoint,
    request: MigrationsStartForOrgRequestOptions,
    response: OctokitResponse[MigrationsStartForOrgResponseData]
  ): ParametersMigrationsStartForOrgEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersMigrationsStartForOrgEndpoint]
  }
  
  @scala.inline
  implicit class ParametersMigrationsStartForOrgEndpointOps[Self <: ParametersMigrationsStartForOrgEndpoint] (val x: Self) extends AnyVal {
    
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
    def setParameters(value: MigrationsStartForOrgEndpoint): Self = this.set("parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: MigrationsStartForOrgRequestOptions): Self = this.set("request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[MigrationsStartForOrgResponseData]): Self = this.set("response", value.asInstanceOf[js.Any])
  }
}
