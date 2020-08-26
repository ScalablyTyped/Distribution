package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.MigrationsMapCommitAuthorEndpoint
import typings.octokitTypes.endpointsMod.MigrationsMapCommitAuthorRequestOptions
import typings.octokitTypes.endpointsMod.MigrationsMapCommitAuthorResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParametersMigrationsMapCommitAuthorEndpoint extends js.Object {
  var parameters: MigrationsMapCommitAuthorEndpoint = js.native
  var request: MigrationsMapCommitAuthorRequestOptions = js.native
  var response: OctokitResponse[MigrationsMapCommitAuthorResponseData] = js.native
}

object ParametersMigrationsMapCommitAuthorEndpoint {
  @scala.inline
  def apply(
    parameters: MigrationsMapCommitAuthorEndpoint,
    request: MigrationsMapCommitAuthorRequestOptions,
    response: OctokitResponse[MigrationsMapCommitAuthorResponseData]
  ): ParametersMigrationsMapCommitAuthorEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersMigrationsMapCommitAuthorEndpoint]
  }
  @scala.inline
  implicit class ParametersMigrationsMapCommitAuthorEndpointOps[Self <: ParametersMigrationsMapCommitAuthorEndpoint] (val x: Self) extends AnyVal {
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
    def setParameters(value: MigrationsMapCommitAuthorEndpoint): Self = this.set("parameters", value.asInstanceOf[js.Any])
    @scala.inline
    def setRequest(value: MigrationsMapCommitAuthorRequestOptions): Self = this.set("request", value.asInstanceOf[js.Any])
    @scala.inline
    def setResponse(value: OctokitResponse[MigrationsMapCommitAuthorResponseData]): Self = this.set("response", value.asInstanceOf[js.Any])
  }
  
}

