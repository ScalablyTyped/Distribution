package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.ScimRemoveUserFromOrgEndpoint
import typings.octokitTypes.endpointsMod.ScimRemoveUserFromOrgRequestOptions
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParametersScimRemoveUserFromOrgEndpoint extends js.Object {
  var parameters: ScimRemoveUserFromOrgEndpoint
  var request: ScimRemoveUserFromOrgRequestOptions
  var response: OctokitResponse[_]
}

object ParametersScimRemoveUserFromOrgEndpoint {
  @scala.inline
  def apply(
    parameters: ScimRemoveUserFromOrgEndpoint,
    request: ScimRemoveUserFromOrgRequestOptions,
    response: OctokitResponse[_]
  ): ParametersScimRemoveUserFromOrgEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersScimRemoveUserFromOrgEndpoint]
  }
}

