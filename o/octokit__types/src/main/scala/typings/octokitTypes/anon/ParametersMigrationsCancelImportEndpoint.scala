package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.MigrationsCancelImportEndpoint
import typings.octokitTypes.endpointsMod.MigrationsCancelImportRequestOptions
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParametersMigrationsCancelImportEndpoint extends js.Object {
  var parameters: MigrationsCancelImportEndpoint = js.native
  var request: MigrationsCancelImportRequestOptions = js.native
  var response: OctokitResponse[_] = js.native
}

object ParametersMigrationsCancelImportEndpoint {
  @scala.inline
  def apply(
    parameters: MigrationsCancelImportEndpoint,
    request: MigrationsCancelImportRequestOptions,
    response: OctokitResponse[_]
  ): ParametersMigrationsCancelImportEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersMigrationsCancelImportEndpoint]
  }
  @scala.inline
  implicit class ParametersMigrationsCancelImportEndpointOps[Self <: ParametersMigrationsCancelImportEndpoint] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setParameters(value: MigrationsCancelImportEndpoint): Self = this.set("parameters", value.asInstanceOf[js.Any])
    @scala.inline
    def setRequest(value: MigrationsCancelImportRequestOptions): Self = this.set("request", value.asInstanceOf[js.Any])
    @scala.inline
    def setResponse(value: OctokitResponse[_]): Self = this.set("response", value.asInstanceOf[js.Any])
  }
  
}

