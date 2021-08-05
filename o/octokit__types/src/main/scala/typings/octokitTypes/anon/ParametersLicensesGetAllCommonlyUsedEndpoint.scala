package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.LicensesGetAllCommonlyUsedEndpoint
import typings.octokitTypes.endpointsMod.LicensesGetAllCommonlyUsedRequestOptions
import typings.octokitTypes.endpointsMod.LicensesGetAllCommonlyUsedResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersLicensesGetAllCommonlyUsedEndpoint extends StObject {
  
  var parameters: LicensesGetAllCommonlyUsedEndpoint
  
  var request: LicensesGetAllCommonlyUsedRequestOptions
  
  var response: OctokitResponse[LicensesGetAllCommonlyUsedResponseData]
}
object ParametersLicensesGetAllCommonlyUsedEndpoint {
  
  inline def apply(
    parameters: LicensesGetAllCommonlyUsedEndpoint,
    request: LicensesGetAllCommonlyUsedRequestOptions,
    response: OctokitResponse[LicensesGetAllCommonlyUsedResponseData]
  ): ParametersLicensesGetAllCommonlyUsedEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersLicensesGetAllCommonlyUsedEndpoint]
  }
  
  extension [Self <: ParametersLicensesGetAllCommonlyUsedEndpoint](x: Self) {
    
    inline def setParameters(value: LicensesGetAllCommonlyUsedEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequest(value: LicensesGetAllCommonlyUsedRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    inline def setResponse(value: OctokitResponse[LicensesGetAllCommonlyUsedResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
