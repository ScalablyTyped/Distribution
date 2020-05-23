package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.AppsSuspendInstallationEndpoint
import typings.octokitTypes.endpointsMod.AppsSuspendInstallationRequestOptions
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParametersAppsSuspendInstallationEndpoint extends js.Object {
  var parameters: AppsSuspendInstallationEndpoint
  var request: AppsSuspendInstallationRequestOptions
  var response: OctokitResponse[_]
}

object ParametersAppsSuspendInstallationEndpoint {
  @scala.inline
  def apply(
    parameters: AppsSuspendInstallationEndpoint,
    request: AppsSuspendInstallationRequestOptions,
    response: OctokitResponse[_]
  ): ParametersAppsSuspendInstallationEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersAppsSuspendInstallationEndpoint]
  }
}

