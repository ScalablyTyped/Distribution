package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.MigrationsListForAuthenticatedUserEndpoint
import typings.octokitTypes.endpointsMod.MigrationsListForAuthenticatedUserRequestOptions
import typings.octokitTypes.endpointsMod.MigrationsListForAuthenticatedUserResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersMigrationsListForAuthenticatedUserEndpoint extends js.Object {
  
  var parameters: MigrationsListForAuthenticatedUserEndpoint = js.native
  
  var request: MigrationsListForAuthenticatedUserRequestOptions = js.native
  
  var response: OctokitResponse[MigrationsListForAuthenticatedUserResponseData] = js.native
}
object ParametersMigrationsListForAuthenticatedUserEndpoint {
  
  @scala.inline
  def apply(
    parameters: MigrationsListForAuthenticatedUserEndpoint,
    request: MigrationsListForAuthenticatedUserRequestOptions,
    response: OctokitResponse[MigrationsListForAuthenticatedUserResponseData]
  ): ParametersMigrationsListForAuthenticatedUserEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersMigrationsListForAuthenticatedUserEndpoint]
  }
  
  @scala.inline
  implicit class ParametersMigrationsListForAuthenticatedUserEndpointOps[Self <: ParametersMigrationsListForAuthenticatedUserEndpoint] (val x: Self) extends AnyVal {
    
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
    def setParameters(value: MigrationsListForAuthenticatedUserEndpoint): Self = this.set("parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: MigrationsListForAuthenticatedUserRequestOptions): Self = this.set("request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[MigrationsListForAuthenticatedUserResponseData]): Self = this.set("response", value.asInstanceOf[js.Any])
  }
}
