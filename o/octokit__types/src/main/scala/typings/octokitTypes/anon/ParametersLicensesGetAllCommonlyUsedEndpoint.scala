package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.LicensesGetAllCommonlyUsedEndpoint
import typings.octokitTypes.endpointsMod.LicensesGetAllCommonlyUsedRequestOptions
import typings.octokitTypes.endpointsMod.LicensesGetAllCommonlyUsedResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersLicensesGetAllCommonlyUsedEndpoint extends js.Object {
  
  var parameters: LicensesGetAllCommonlyUsedEndpoint = js.native
  
  var request: LicensesGetAllCommonlyUsedRequestOptions = js.native
  
  var response: OctokitResponse[LicensesGetAllCommonlyUsedResponseData] = js.native
}
object ParametersLicensesGetAllCommonlyUsedEndpoint {
  
  @scala.inline
  def apply(
    parameters: LicensesGetAllCommonlyUsedEndpoint,
    request: LicensesGetAllCommonlyUsedRequestOptions,
    response: OctokitResponse[LicensesGetAllCommonlyUsedResponseData]
  ): ParametersLicensesGetAllCommonlyUsedEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersLicensesGetAllCommonlyUsedEndpoint]
  }
  
  @scala.inline
  implicit class ParametersLicensesGetAllCommonlyUsedEndpointOps[Self <: ParametersLicensesGetAllCommonlyUsedEndpoint] (val x: Self) extends AnyVal {
    
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
    def setParameters(value: LicensesGetAllCommonlyUsedEndpoint): Self = this.set("parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: LicensesGetAllCommonlyUsedRequestOptions): Self = this.set("request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[LicensesGetAllCommonlyUsedResponseData]): Self = this.set("response", value.asInstanceOf[js.Any])
  }
}
