package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.MigrationsStartImportEndpoint
import typings.octokitTypes.endpointsMod.MigrationsStartImportRequestOptions
import typings.octokitTypes.endpointsMod.MigrationsStartImportResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParametersMigrationsStartImportEndpoint extends js.Object {
  var parameters: MigrationsStartImportEndpoint = js.native
  var request: MigrationsStartImportRequestOptions = js.native
  var response: OctokitResponse[MigrationsStartImportResponseData] = js.native
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
  @scala.inline
  implicit class ParametersMigrationsStartImportEndpointOps[Self <: ParametersMigrationsStartImportEndpoint] (val x: Self) extends AnyVal {
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
    def setParameters(value: MigrationsStartImportEndpoint): Self = this.set("parameters", value.asInstanceOf[js.Any])
    @scala.inline
    def setRequest(value: MigrationsStartImportRequestOptions): Self = this.set("request", value.asInstanceOf[js.Any])
    @scala.inline
    def setResponse(value: OctokitResponse[MigrationsStartImportResponseData]): Self = this.set("response", value.asInstanceOf[js.Any])
  }
  
}

