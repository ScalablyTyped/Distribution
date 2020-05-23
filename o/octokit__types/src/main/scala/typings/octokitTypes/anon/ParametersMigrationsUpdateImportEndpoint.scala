package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.MigrationsUpdateImportEndpoint
import typings.octokitTypes.endpointsMod.MigrationsUpdateImportRequestOptions
import typings.octokitTypes.endpointsMod.MigrationsUpdateImportResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParametersMigrationsUpdateImportEndpoint extends js.Object {
  var parameters: MigrationsUpdateImportEndpoint
  var request: MigrationsUpdateImportRequestOptions
  var response: OctokitResponse[MigrationsUpdateImportResponseData]
}

object ParametersMigrationsUpdateImportEndpoint {
  @scala.inline
  def apply(
    parameters: MigrationsUpdateImportEndpoint,
    request: MigrationsUpdateImportRequestOptions,
    response: OctokitResponse[MigrationsUpdateImportResponseData]
  ): ParametersMigrationsUpdateImportEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersMigrationsUpdateImportEndpoint]
  }
}

