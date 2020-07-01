package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.MigrationsGetImportStatusEndpoint
import typings.octokitTypes.endpointsMod.MigrationsGetImportStatusRequestOptions
import typings.octokitTypes.endpointsMod.MigrationsGetImportStatusResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParametersMigrationsGetImportStatusEndpoint extends js.Object {
  var parameters: MigrationsGetImportStatusEndpoint
  var request: MigrationsGetImportStatusRequestOptions
  var response: OctokitResponse[MigrationsGetImportStatusResponseData]
}

object ParametersMigrationsGetImportStatusEndpoint {
  @scala.inline
  def apply(
    parameters: MigrationsGetImportStatusEndpoint,
    request: MigrationsGetImportStatusRequestOptions,
    response: OctokitResponse[MigrationsGetImportStatusResponseData]
  ): ParametersMigrationsGetImportStatusEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersMigrationsGetImportStatusEndpoint]
  }
}

