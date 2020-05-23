package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.MigrationsSetLfsPreferenceEndpoint
import typings.octokitTypes.endpointsMod.MigrationsSetLfsPreferenceRequestOptions
import typings.octokitTypes.endpointsMod.MigrationsSetLfsPreferenceResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParametersMigrationsSetLfsPreferenceEndpoint extends js.Object {
  var parameters: MigrationsSetLfsPreferenceEndpoint
  var request: MigrationsSetLfsPreferenceRequestOptions
  var response: OctokitResponse[MigrationsSetLfsPreferenceResponseData]
}

object ParametersMigrationsSetLfsPreferenceEndpoint {
  @scala.inline
  def apply(
    parameters: MigrationsSetLfsPreferenceEndpoint,
    request: MigrationsSetLfsPreferenceRequestOptions,
    response: OctokitResponse[MigrationsSetLfsPreferenceResponseData]
  ): ParametersMigrationsSetLfsPreferenceEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersMigrationsSetLfsPreferenceEndpoint]
  }
}

