package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.UsersBlockEndpoint
import typings.octokitTypes.endpointsMod.UsersBlockRequestOptions
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParametersUsersBlockEndpoint extends js.Object {
  var parameters: UsersBlockEndpoint
  var request: UsersBlockRequestOptions
  var response: OctokitResponse[_]
}

object ParametersUsersBlockEndpoint {
  @scala.inline
  def apply(parameters: UsersBlockEndpoint, request: UsersBlockRequestOptions, response: OctokitResponse[_]): ParametersUsersBlockEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersUsersBlockEndpoint]
  }
}

