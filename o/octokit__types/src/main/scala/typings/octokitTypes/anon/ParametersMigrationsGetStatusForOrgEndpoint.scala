package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.MigrationsGetStatusForOrgEndpoint
import typings.octokitTypes.endpointsMod.MigrationsGetStatusForOrgRequestOptions
import typings.octokitTypes.endpointsMod.MigrationsGetStatusForOrgResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersMigrationsGetStatusForOrgEndpoint extends js.Object {
  
  var parameters: MigrationsGetStatusForOrgEndpoint = js.native
  
  var request: MigrationsGetStatusForOrgRequestOptions = js.native
  
  var response: OctokitResponse[MigrationsGetStatusForOrgResponseData] = js.native
}
object ParametersMigrationsGetStatusForOrgEndpoint {
  
  @scala.inline
  def apply(
    parameters: MigrationsGetStatusForOrgEndpoint,
    request: MigrationsGetStatusForOrgRequestOptions,
    response: OctokitResponse[MigrationsGetStatusForOrgResponseData]
  ): ParametersMigrationsGetStatusForOrgEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersMigrationsGetStatusForOrgEndpoint]
  }
  
  @scala.inline
  implicit class ParametersMigrationsGetStatusForOrgEndpointOps[Self <: ParametersMigrationsGetStatusForOrgEndpoint] (val x: Self) extends AnyVal {
    
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
    def setParameters(value: MigrationsGetStatusForOrgEndpoint): Self = this.set("parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: MigrationsGetStatusForOrgRequestOptions): Self = this.set("request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[MigrationsGetStatusForOrgResponseData]): Self = this.set("response", value.asInstanceOf[js.Any])
  }
}
