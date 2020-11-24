package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.LicensesGetEndpoint
import typings.octokitTypes.endpointsMod.LicensesGetRequestOptions
import typings.octokitTypes.endpointsMod.LicensesGetResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersLicensesGetEndpoint extends js.Object {
  
  var parameters: LicensesGetEndpoint = js.native
  
  var request: LicensesGetRequestOptions = js.native
  
  var response: OctokitResponse[LicensesGetResponseData] = js.native
}
object ParametersLicensesGetEndpoint {
  
  @scala.inline
  def apply(
    parameters: LicensesGetEndpoint,
    request: LicensesGetRequestOptions,
    response: OctokitResponse[LicensesGetResponseData]
  ): ParametersLicensesGetEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersLicensesGetEndpoint]
  }
  
  @scala.inline
  implicit class ParametersLicensesGetEndpointOps[Self <: ParametersLicensesGetEndpoint] (val x: Self) extends AnyVal {
    
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
    def setParameters(value: LicensesGetEndpoint): Self = this.set("parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: LicensesGetRequestOptions): Self = this.set("request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[LicensesGetResponseData]): Self = this.set("response", value.asInstanceOf[js.Any])
  }
}
