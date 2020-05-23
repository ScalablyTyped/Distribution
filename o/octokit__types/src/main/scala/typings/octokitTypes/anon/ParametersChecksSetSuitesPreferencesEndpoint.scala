package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.ChecksSetSuitesPreferencesEndpoint
import typings.octokitTypes.endpointsMod.ChecksSetSuitesPreferencesRequestOptions
import typings.octokitTypes.endpointsMod.ChecksSetSuitesPreferencesResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParametersChecksSetSuitesPreferencesEndpoint extends js.Object {
  var parameters: ChecksSetSuitesPreferencesEndpoint
  var request: ChecksSetSuitesPreferencesRequestOptions
  var response: OctokitResponse[ChecksSetSuitesPreferencesResponseData]
}

object ParametersChecksSetSuitesPreferencesEndpoint {
  @scala.inline
  def apply(
    parameters: ChecksSetSuitesPreferencesEndpoint,
    request: ChecksSetSuitesPreferencesRequestOptions,
    response: OctokitResponse[ChecksSetSuitesPreferencesResponseData]
  ): ParametersChecksSetSuitesPreferencesEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersChecksSetSuitesPreferencesEndpoint]
  }
}

