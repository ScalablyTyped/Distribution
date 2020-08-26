package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.MigrationsGetStatusForAuthenticatedUserEndpoint
import typings.octokitTypes.endpointsMod.MigrationsGetStatusForAuthenticatedUserRequestOptions
import typings.octokitTypes.endpointsMod.MigrationsGetStatusForAuthenticatedUserResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParametersMigrationsGetStatusForAuthenticatedUserEndpoint extends js.Object {
  var parameters: MigrationsGetStatusForAuthenticatedUserEndpoint = js.native
  var request: MigrationsGetStatusForAuthenticatedUserRequestOptions = js.native
  var response: OctokitResponse[MigrationsGetStatusForAuthenticatedUserResponseData] = js.native
}

object ParametersMigrationsGetStatusForAuthenticatedUserEndpoint {
  @scala.inline
  def apply(
    parameters: MigrationsGetStatusForAuthenticatedUserEndpoint,
    request: MigrationsGetStatusForAuthenticatedUserRequestOptions,
    response: OctokitResponse[MigrationsGetStatusForAuthenticatedUserResponseData]
  ): ParametersMigrationsGetStatusForAuthenticatedUserEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersMigrationsGetStatusForAuthenticatedUserEndpoint]
  }
  @scala.inline
  implicit class ParametersMigrationsGetStatusForAuthenticatedUserEndpointOps[Self <: ParametersMigrationsGetStatusForAuthenticatedUserEndpoint] (val x: Self) extends AnyVal {
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
    def setParameters(value: MigrationsGetStatusForAuthenticatedUserEndpoint): Self = this.set("parameters", value.asInstanceOf[js.Any])
    @scala.inline
    def setRequest(value: MigrationsGetStatusForAuthenticatedUserRequestOptions): Self = this.set("request", value.asInstanceOf[js.Any])
    @scala.inline
    def setResponse(value: OctokitResponse[MigrationsGetStatusForAuthenticatedUserResponseData]): Self = this.set("response", value.asInstanceOf[js.Any])
  }
  
}

