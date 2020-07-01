package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.ReposRemoveStatusCheckProtectionEndpoint
import typings.octokitTypes.endpointsMod.ReposRemoveStatusCheckProtectionRequestOptions
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParametersReposRemoveStatusCheckProtectionEndpoint extends js.Object {
  var parameters: ReposRemoveStatusCheckProtectionEndpoint
  var request: ReposRemoveStatusCheckProtectionRequestOptions
  var response: OctokitResponse[_]
}

object ParametersReposRemoveStatusCheckProtectionEndpoint {
  @scala.inline
  def apply(
    parameters: ReposRemoveStatusCheckProtectionEndpoint,
    request: ReposRemoveStatusCheckProtectionRequestOptions,
    response: OctokitResponse[_]
  ): ParametersReposRemoveStatusCheckProtectionEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersReposRemoveStatusCheckProtectionEndpoint]
  }
}

