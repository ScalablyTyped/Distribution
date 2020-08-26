package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.UsersListPublicEmailsForAuthenticatedEndpoint
import typings.octokitTypes.endpointsMod.UsersListPublicEmailsForAuthenticatedRequestOptions
import typings.octokitTypes.endpointsMod.UsersListPublicEmailsForAuthenticatedResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParametersUsersListPublicEmailsForAuthenticatedEndpoint extends js.Object {
  var parameters: UsersListPublicEmailsForAuthenticatedEndpoint = js.native
  var request: UsersListPublicEmailsForAuthenticatedRequestOptions = js.native
  var response: OctokitResponse[UsersListPublicEmailsForAuthenticatedResponseData] = js.native
}

object ParametersUsersListPublicEmailsForAuthenticatedEndpoint {
  @scala.inline
  def apply(
    parameters: UsersListPublicEmailsForAuthenticatedEndpoint,
    request: UsersListPublicEmailsForAuthenticatedRequestOptions,
    response: OctokitResponse[UsersListPublicEmailsForAuthenticatedResponseData]
  ): ParametersUsersListPublicEmailsForAuthenticatedEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersUsersListPublicEmailsForAuthenticatedEndpoint]
  }
  @scala.inline
  implicit class ParametersUsersListPublicEmailsForAuthenticatedEndpointOps[Self <: ParametersUsersListPublicEmailsForAuthenticatedEndpoint] (val x: Self) extends AnyVal {
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
    def setParameters(value: UsersListPublicEmailsForAuthenticatedEndpoint): Self = this.set("parameters", value.asInstanceOf[js.Any])
    @scala.inline
    def setRequest(value: UsersListPublicEmailsForAuthenticatedRequestOptions): Self = this.set("request", value.asInstanceOf[js.Any])
    @scala.inline
    def setResponse(value: OctokitResponse[UsersListPublicEmailsForAuthenticatedResponseData]): Self = this.set("response", value.asInstanceOf[js.Any])
  }
  
}

