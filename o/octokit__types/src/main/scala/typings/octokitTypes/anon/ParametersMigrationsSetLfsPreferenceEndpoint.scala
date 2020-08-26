package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.MigrationsSetLfsPreferenceEndpoint
import typings.octokitTypes.endpointsMod.MigrationsSetLfsPreferenceRequestOptions
import typings.octokitTypes.endpointsMod.MigrationsSetLfsPreferenceResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParametersMigrationsSetLfsPreferenceEndpoint extends js.Object {
  var parameters: MigrationsSetLfsPreferenceEndpoint = js.native
  var request: MigrationsSetLfsPreferenceRequestOptions = js.native
  var response: OctokitResponse[MigrationsSetLfsPreferenceResponseData] = js.native
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
  @scala.inline
  implicit class ParametersMigrationsSetLfsPreferenceEndpointOps[Self <: ParametersMigrationsSetLfsPreferenceEndpoint] (val x: Self) extends AnyVal {
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
    def setParameters(value: MigrationsSetLfsPreferenceEndpoint): Self = this.set("parameters", value.asInstanceOf[js.Any])
    @scala.inline
    def setRequest(value: MigrationsSetLfsPreferenceRequestOptions): Self = this.set("request", value.asInstanceOf[js.Any])
    @scala.inline
    def setResponse(value: OctokitResponse[MigrationsSetLfsPreferenceResponseData]): Self = this.set("response", value.asInstanceOf[js.Any])
  }
  
}

