package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.ReposDisableAutomatedSecurityFixesEndpoint
import typings.octokitTypes.endpointsMod.ReposDisableAutomatedSecurityFixesRequestOptions
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParametersReposDisableAutomatedSecurityFixesEndpoint extends js.Object {
  var parameters: ReposDisableAutomatedSecurityFixesEndpoint
  var request: ReposDisableAutomatedSecurityFixesRequestOptions
  var response: OctokitResponse[_]
}

object ParametersReposDisableAutomatedSecurityFixesEndpoint {
  @scala.inline
  def apply(
    parameters: ReposDisableAutomatedSecurityFixesEndpoint,
    request: ReposDisableAutomatedSecurityFixesRequestOptions,
    response: OctokitResponse[_]
  ): ParametersReposDisableAutomatedSecurityFixesEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersReposDisableAutomatedSecurityFixesEndpoint]
  }
}

