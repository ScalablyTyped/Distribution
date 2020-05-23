package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.MigrationsStartImportEndpoint
import typings.octokitTypes.endpointsMod.MigrationsStartImportRequestOptions
import typings.octokitTypes.endpointsMod.MigrationsStartImportResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParametersMigrationsStartImportEndpoint extends js.Object {
  var parameters: MigrationsStartImportEndpoint
  var request: MigrationsStartImportRequestOptions
  var response: OctokitResponse[MigrationsStartImportResponseData]
}

object ParametersMigrationsStartImportEndpoint {
  @scala.inline
  def apply(
    parameters: MigrationsStartImportEndpoint,
    request: MigrationsStartImportRequestOptions,
    response: OctokitResponse[MigrationsStartImportResponseData]
  ): ParametersMigrationsStartImportEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersMigrationsStartImportEndpoint]
  }
}

