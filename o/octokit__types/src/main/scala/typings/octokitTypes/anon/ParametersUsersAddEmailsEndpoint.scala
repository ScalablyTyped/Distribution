package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.UsersAddEmailsEndpoint
import typings.octokitTypes.endpointsMod.UsersAddEmailsRequestOptions
import typings.octokitTypes.endpointsMod.UsersAddEmailsResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParametersUsersAddEmailsEndpoint extends js.Object {
  var parameters: UsersAddEmailsEndpoint
  var request: UsersAddEmailsRequestOptions
  var response: OctokitResponse[UsersAddEmailsResponseData]
}

object ParametersUsersAddEmailsEndpoint {
  @scala.inline
  def apply(
    parameters: UsersAddEmailsEndpoint,
    request: UsersAddEmailsRequestOptions,
    response: OctokitResponse[UsersAddEmailsResponseData]
  ): ParametersUsersAddEmailsEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersUsersAddEmailsEndpoint]
  }
}

