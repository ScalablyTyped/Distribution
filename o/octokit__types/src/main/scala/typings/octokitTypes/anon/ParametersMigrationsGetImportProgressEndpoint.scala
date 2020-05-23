package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.MigrationsGetImportProgressEndpoint
import typings.octokitTypes.endpointsMod.MigrationsGetImportProgressRequestOptions
import typings.octokitTypes.endpointsMod.MigrationsGetImportProgressResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParametersMigrationsGetImportProgressEndpoint extends js.Object {
  var parameters: MigrationsGetImportProgressEndpoint
  var request: MigrationsGetImportProgressRequestOptions
  var response: OctokitResponse[MigrationsGetImportProgressResponseData]
}

object ParametersMigrationsGetImportProgressEndpoint {
  @scala.inline
  def apply(
    parameters: MigrationsGetImportProgressEndpoint,
    request: MigrationsGetImportProgressRequestOptions,
    response: OctokitResponse[MigrationsGetImportProgressResponseData]
  ): ParametersMigrationsGetImportProgressEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersMigrationsGetImportProgressEndpoint]
  }
}

