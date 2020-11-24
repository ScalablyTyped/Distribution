package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.MigrationsStartForAuthenticatedUserEndpoint
import typings.octokitTypes.endpointsMod.MigrationsStartForAuthenticatedUserRequestOptions
import typings.octokitTypes.endpointsMod.MigrationsStartForAuthenticatedUserResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersMigrationsStartForAuthenticatedUserEndpoint extends js.Object {
  
  var parameters: MigrationsStartForAuthenticatedUserEndpoint = js.native
  
  var request: MigrationsStartForAuthenticatedUserRequestOptions = js.native
  
  var response: OctokitResponse[MigrationsStartForAuthenticatedUserResponseData] = js.native
}
object ParametersMigrationsStartForAuthenticatedUserEndpoint {
  
  @scala.inline
  def apply(
    parameters: MigrationsStartForAuthenticatedUserEndpoint,
    request: MigrationsStartForAuthenticatedUserRequestOptions,
    response: OctokitResponse[MigrationsStartForAuthenticatedUserResponseData]
  ): ParametersMigrationsStartForAuthenticatedUserEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersMigrationsStartForAuthenticatedUserEndpoint]
  }
  
  @scala.inline
  implicit class ParametersMigrationsStartForAuthenticatedUserEndpointOps[Self <: ParametersMigrationsStartForAuthenticatedUserEndpoint] (val x: Self) extends AnyVal {
    
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
    def setParameters(value: MigrationsStartForAuthenticatedUserEndpoint): Self = this.set("parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: MigrationsStartForAuthenticatedUserRequestOptions): Self = this.set("request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[MigrationsStartForAuthenticatedUserResponseData]): Self = this.set("response", value.asInstanceOf[js.Any])
  }
}
