package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.UsersAddEmailForAuthenticatedEndpoint
import typings.octokitTypes.endpointsMod.UsersAddEmailForAuthenticatedRequestOptions
import typings.octokitTypes.endpointsMod.UsersAddEmailForAuthenticatedResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParametersUsersAddEmailForAuthenticatedEndpoint extends js.Object {
  var parameters: UsersAddEmailForAuthenticatedEndpoint
  var request: UsersAddEmailForAuthenticatedRequestOptions
  var response: OctokitResponse[UsersAddEmailForAuthenticatedResponseData]
}

object ParametersUsersAddEmailForAuthenticatedEndpoint {
  @scala.inline
  def apply(
    parameters: UsersAddEmailForAuthenticatedEndpoint,
    request: UsersAddEmailForAuthenticatedRequestOptions,
    response: OctokitResponse[UsersAddEmailForAuthenticatedResponseData]
  ): ParametersUsersAddEmailForAuthenticatedEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersUsersAddEmailForAuthenticatedEndpoint]
  }
}

