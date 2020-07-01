package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.ReposGetStatusChecksProtectionEndpoint
import typings.octokitTypes.endpointsMod.ReposGetStatusChecksProtectionRequestOptions
import typings.octokitTypes.endpointsMod.ReposGetStatusChecksProtectionResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParametersReposGetStatusChecksProtectionEndpoint extends js.Object {
  var parameters: ReposGetStatusChecksProtectionEndpoint
  var request: ReposGetStatusChecksProtectionRequestOptions
  var response: OctokitResponse[ReposGetStatusChecksProtectionResponseData]
}

object ParametersReposGetStatusChecksProtectionEndpoint {
  @scala.inline
  def apply(
    parameters: ReposGetStatusChecksProtectionEndpoint,
    request: ReposGetStatusChecksProtectionRequestOptions,
    response: OctokitResponse[ReposGetStatusChecksProtectionResponseData]
  ): ParametersReposGetStatusChecksProtectionEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersReposGetStatusChecksProtectionEndpoint]
  }
}

