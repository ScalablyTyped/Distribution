package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.ScimDeleteUserFromOrgEndpoint
import typings.octokitTypes.endpointsMod.ScimDeleteUserFromOrgRequestOptions
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParametersScimDeleteUserFromOrgEndpoint extends js.Object {
  var parameters: ScimDeleteUserFromOrgEndpoint
  var request: ScimDeleteUserFromOrgRequestOptions
  var response: OctokitResponse[_]
}

object ParametersScimDeleteUserFromOrgEndpoint {
  @scala.inline
  def apply(
    parameters: ScimDeleteUserFromOrgEndpoint,
    request: ScimDeleteUserFromOrgRequestOptions,
    response: OctokitResponse[_]
  ): ParametersScimDeleteUserFromOrgEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersScimDeleteUserFromOrgEndpoint]
  }
}

