package typings.octokitPluginPaginateRest.anon

import typings.octokitTypes.endpointsMod.UsersListPublicSshKeysForAuthenticatedEndpoint
import typings.octokitTypes.endpointsMod.UsersListPublicSshKeysForAuthenticatedResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParametersUsersListPublicSshKeysForAuthenticatedEndpoint extends js.Object {
  var parameters: UsersListPublicSshKeysForAuthenticatedEndpoint = js.native
  var response: OctokitResponse[UsersListPublicSshKeysForAuthenticatedResponseData] = js.native
}

object ParametersUsersListPublicSshKeysForAuthenticatedEndpoint {
  @scala.inline
  def apply(
    parameters: UsersListPublicSshKeysForAuthenticatedEndpoint,
    response: OctokitResponse[UsersListPublicSshKeysForAuthenticatedResponseData]
  ): ParametersUsersListPublicSshKeysForAuthenticatedEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersUsersListPublicSshKeysForAuthenticatedEndpoint]
  }
  @scala.inline
  implicit class ParametersUsersListPublicSshKeysForAuthenticatedEndpointOps[Self <: ParametersUsersListPublicSshKeysForAuthenticatedEndpoint] (val x: Self) extends AnyVal {
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
    def setParameters(value: UsersListPublicSshKeysForAuthenticatedEndpoint): Self = this.set("parameters", value.asInstanceOf[js.Any])
    @scala.inline
    def setResponse(value: OctokitResponse[UsersListPublicSshKeysForAuthenticatedResponseData]): Self = this.set("response", value.asInstanceOf[js.Any])
  }
  
}

