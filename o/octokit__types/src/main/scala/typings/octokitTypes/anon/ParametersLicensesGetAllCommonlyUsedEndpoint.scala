package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.LicensesGetAllCommonlyUsedEndpoint
import typings.octokitTypes.endpointsMod.LicensesGetAllCommonlyUsedRequestOptions
import typings.octokitTypes.endpointsMod.LicensesGetAllCommonlyUsedResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersLicensesGetAllCommonlyUsedEndpoint extends StObject {
  
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
  implicit class ParametersLicensesGetAllCommonlyUsedEndpointMutableBuilder[Self <: ParametersLicensesGetAllCommonlyUsedEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: LicensesGetAllCommonlyUsedEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: LicensesGetAllCommonlyUsedRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[LicensesGetAllCommonlyUsedResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
