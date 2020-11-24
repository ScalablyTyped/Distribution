package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.ChecksSetSuitesPreferencesEndpoint
import typings.octokitTypes.endpointsMod.ChecksSetSuitesPreferencesRequestOptions
import typings.octokitTypes.endpointsMod.ChecksSetSuitesPreferencesResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersChecksSetSuitesPreferencesEndpoint extends js.Object {
  
  var parameters: ChecksSetSuitesPreferencesEndpoint = js.native
  
  var request: ChecksSetSuitesPreferencesRequestOptions = js.native
  
  var response: OctokitResponse[ChecksSetSuitesPreferencesResponseData] = js.native
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
  
  @scala.inline
  implicit class ParametersChecksSetSuitesPreferencesEndpointOps[Self <: ParametersChecksSetSuitesPreferencesEndpoint] (val x: Self) extends AnyVal {
    
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
    def setParameters(value: ChecksSetSuitesPreferencesEndpoint): Self = this.set("parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: ChecksSetSuitesPreferencesRequestOptions): Self = this.set("request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[ChecksSetSuitesPreferencesResponseData]): Self = this.set("response", value.asInstanceOf[js.Any])
  }
}
