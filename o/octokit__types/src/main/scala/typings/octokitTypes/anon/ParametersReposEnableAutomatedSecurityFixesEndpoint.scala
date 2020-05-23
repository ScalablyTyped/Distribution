package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.ReposEnableAutomatedSecurityFixesEndpoint
import typings.octokitTypes.endpointsMod.ReposEnableAutomatedSecurityFixesRequestOptions
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParametersReposEnableAutomatedSecurityFixesEndpoint extends js.Object {
  var parameters: ReposEnableAutomatedSecurityFixesEndpoint
  var request: ReposEnableAutomatedSecurityFixesRequestOptions
  var response: OctokitResponse[_]
}

object ParametersReposEnableAutomatedSecurityFixesEndpoint {
  @scala.inline
  def apply(
    parameters: ReposEnableAutomatedSecurityFixesEndpoint,
    request: ReposEnableAutomatedSecurityFixesRequestOptions,
    response: OctokitResponse[_]
  ): ParametersReposEnableAutomatedSecurityFixesEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersReposEnableAutomatedSecurityFixesEndpoint]
  }
}

