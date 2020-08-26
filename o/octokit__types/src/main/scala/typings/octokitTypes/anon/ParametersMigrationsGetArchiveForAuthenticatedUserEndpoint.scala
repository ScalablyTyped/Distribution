package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.MigrationsGetArchiveForAuthenticatedUserEndpoint
import typings.octokitTypes.endpointsMod.MigrationsGetArchiveForAuthenticatedUserRequestOptions
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParametersMigrationsGetArchiveForAuthenticatedUserEndpoint extends js.Object {
  var parameters: MigrationsGetArchiveForAuthenticatedUserEndpoint = js.native
  var request: MigrationsGetArchiveForAuthenticatedUserRequestOptions = js.native
  var response: OctokitResponse[_] = js.native
}

object ParametersMigrationsGetArchiveForAuthenticatedUserEndpoint {
  @scala.inline
  def apply(
    parameters: MigrationsGetArchiveForAuthenticatedUserEndpoint,
    request: MigrationsGetArchiveForAuthenticatedUserRequestOptions,
    response: OctokitResponse[_]
  ): ParametersMigrationsGetArchiveForAuthenticatedUserEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersMigrationsGetArchiveForAuthenticatedUserEndpoint]
  }
  @scala.inline
  implicit class ParametersMigrationsGetArchiveForAuthenticatedUserEndpointOps[Self <: ParametersMigrationsGetArchiveForAuthenticatedUserEndpoint] (val x: Self) extends AnyVal {
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
    def setParameters(value: MigrationsGetArchiveForAuthenticatedUserEndpoint): Self = this.set("parameters", value.asInstanceOf[js.Any])
    @scala.inline
    def setRequest(value: MigrationsGetArchiveForAuthenticatedUserRequestOptions): Self = this.set("request", value.asInstanceOf[js.Any])
    @scala.inline
    def setResponse(value: OctokitResponse[_]): Self = this.set("response", value.asInstanceOf[js.Any])
  }
  
}

