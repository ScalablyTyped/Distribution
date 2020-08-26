package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.UsersListEmailsForAuthenticatedEndpoint
import typings.octokitTypes.endpointsMod.UsersListEmailsForAuthenticatedRequestOptions
import typings.octokitTypes.endpointsMod.UsersListEmailsForAuthenticatedResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParametersUsersListEmailsForAuthenticatedEndpoint extends js.Object {
  var parameters: UsersListEmailsForAuthenticatedEndpoint = js.native
  var request: UsersListEmailsForAuthenticatedRequestOptions = js.native
  var response: OctokitResponse[UsersListEmailsForAuthenticatedResponseData] = js.native
}

object ParametersUsersListEmailsForAuthenticatedEndpoint {
  @scala.inline
  def apply(
    parameters: UsersListEmailsForAuthenticatedEndpoint,
    request: UsersListEmailsForAuthenticatedRequestOptions,
    response: OctokitResponse[UsersListEmailsForAuthenticatedResponseData]
  ): ParametersUsersListEmailsForAuthenticatedEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersUsersListEmailsForAuthenticatedEndpoint]
  }
  @scala.inline
  implicit class ParametersUsersListEmailsForAuthenticatedEndpointOps[Self <: ParametersUsersListEmailsForAuthenticatedEndpoint] (val x: Self) extends AnyVal {
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
    def setParameters(value: UsersListEmailsForAuthenticatedEndpoint): Self = this.set("parameters", value.asInstanceOf[js.Any])
    @scala.inline
    def setRequest(value: UsersListEmailsForAuthenticatedRequestOptions): Self = this.set("request", value.asInstanceOf[js.Any])
    @scala.inline
    def setResponse(value: OctokitResponse[UsersListEmailsForAuthenticatedResponseData]): Self = this.set("response", value.asInstanceOf[js.Any])
  }
  
}

